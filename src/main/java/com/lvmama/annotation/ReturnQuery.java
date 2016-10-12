package com.lvmama.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReturnQuery {

    public static String query(Object o) {
        StringBuffer sb = new StringBuffer();

        Class c = o.getClass();

        if (!c.isAnnotationPresent(Table.class)) {
            return null;
        }

        //获取table的名字
        Table t = (Table) c.getAnnotation(Table.class);

        String tableName = t.value();

        //加入where 1=1 是为了防止未来如果没有条件的情况下也不会报错

        sb.append("select * from ").append(tableName).append(" where 1=1 ");

        //获取类的所有字段
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {

            if (!field.isAnnotationPresent(Column.class)) {
                continue;
            }

            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();

            String filedName = field.getName();

            String getMethodName = "get" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1);

            //字段的值
            Object fieldValue = null;//属性有int,String类型,所以定义为Object类
            try {
                Method getMethod = c.getMethod(getMethodName);
                fieldValue = getMethod.invoke(o);
            } catch (Exception e) {
                e.printStackTrace();
            }


//          拼接SQL

            if (fieldValue == null || (fieldValue instanceof Integer && (Integer) fieldValue == 0)) {
                continue;
            }

            sb.append(" and ").append(filedName);

            if (fieldValue instanceof String) {
                if (((String) fieldValue).contains(",")) {
                    String[] values = ((String) fieldValue).split(",");

                    sb.append(" in(");

                    for (String v : values) {
                        sb.append("'").append(v).append("'").append(",");
                    }

                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(")");


                } else {
                    sb.append("=").append("'").append(fieldValue).append("'");
                }
            }

        }


        return sb.toString();
    }
}
