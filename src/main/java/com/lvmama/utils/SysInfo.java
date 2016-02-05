package com.lvmama.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * Created by wangchongbei on 16-2-1.
 */
public class SysInfo {
    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();

        for (String key : envMap.keySet()) {
            System.out.println(key + "  =  " + envMap.get(key));
        }

        Properties properties = System.getProperties();
        Iterator<Map.Entry<Object, Object>> it = properties.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<Object, Object> entry = it.next();
            System.out.println(entry.getKey() + "  ---  " + entry.getValue());

        }
    }
}
