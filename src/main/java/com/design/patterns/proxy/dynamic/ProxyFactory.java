package com.design.patterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(Object target){
        /**
         * 参数说明：
         *  public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *  loader：指定当前目标对象使用的类加载器，获取加载器的方法固定
         *  interfaces：目标对象实现的接口类型，使用泛型确认类型
         *  h：事件处理，之执行目标对象方法时，会触发事件处理器的方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理开始。。。。。。。");
                Object result = method.invoke(target);
                System.out.println("动态代理结束。。。。。。。");
                return result;
            }
        });
    }

}
