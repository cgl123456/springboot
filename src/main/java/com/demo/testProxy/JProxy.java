package com.demo.testProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cgl on 2018/3/22
 */
public class JProxy implements InvocationHandler {
    
    private Object userDaoImpl;
    
    public JProxy(Object userDaoImpl){
        this.userDaoImpl = userDaoImpl;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("before = " + "before");
        result = method.invoke(userDaoImpl, args);
        System.out.println("\"\" = " + "after");
        
        return result;
    }
}
