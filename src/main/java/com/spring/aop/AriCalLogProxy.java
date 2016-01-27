package com.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by wangchongbei on 16-1-27.
 */
public class AriCalLogProxy {

    private ArithmeticCalculator target;//要代理的对象

    public AriCalLogProxy(ArithmeticCalculator target) {
        super();
        this.target = target;
    }

    //返回代理对象
    public ArithmeticCalculator getLogProxy() {
        
        ArithmeticCalculator proxy;

        ClassLoader loader = target.getClass().getClassLoader();
        Class[] interfaces = new Class[]{ArithmeticCalculator.class};

        InvocationHandler h = new InvocationHandler() {
            /**
             * proxy:   代理对象. 一般不使用该对象
             * method:  正在被调用的方法
             * args:    调用方法传入的参数
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                System.out.println("[before]The method: " + methodName + " begin with" + Arrays.asList(args));//打印日志

                Object result = null;//调用目标方法

                try {
                    //前置通知
                    result = method.invoke(target, args);
                    //返回通知,可以访问到方法的返回值
                } catch (Exception e) {
                    e.printStackTrace();
                    //异常通知,可以访问到方法出现的异常
                }

                //后置通知,因为方法可能会出现异常,所以访问不到方法的返回值

                System.out.println("[after]The method ends with " + result);
                return result;
            }
        };

        /**
         * loader:代理对象使用的类加载器
         * interfaces:指定代理对象的类型,即代理代理对象中可有哪些方法
         * ｈ:当具体调用代理对象的方法时,应该如何进行响应,实际上就是调用InvocationHandler的invoke方法
         */
        proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);

        return proxy;
    }
}
