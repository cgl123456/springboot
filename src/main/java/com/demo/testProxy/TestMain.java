package com.demo.testProxy;

import org.springframework.cglib.proxy.Enhancer;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by cgl on 2018/3/22
 */
public class TestMain {
    public static void main(String[] args) {
    
//        UserDao userDao = new UserDaoImpl();
//        UserDao userDao1 = (UserDao)Proxy.newProxyInstance(JProxy.class.getClassLoader(), UserDaoImpl.class.getInterfaces(), new JProxy(userDao));
//        userDao1.hello();
    
//        Enhancer hancer = new Enhancer();
//        hancer.setSuperclass(UserDaoImpl.class);
//        hancer.setCallback();
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("","");
        for(Map.Entry<String, String> entry:map.entrySet()){
            String a = entry.getKey();
            String val = entry.getValue();
        }
        
        Set set = new HashSet();
        set.add("");
        
        String[] array = {};
    
    
        try {
//            InputStream is = new FileInputStream("");
//            byte[] arr = new byte[2*1024];
//            int len;
//            StringBuffer sb = new StringBuffer();
//            while((len = is.read(arr)) != -1){
//                sb.append(new StringBuffer(arr,0,len));
//            }
            StringBuffer sb = new StringBuffer();
            BufferedReader bufferReader = new BufferedReader(new FileReader(""));
            String info = null;
            bufferReader.read();
            while((info = bufferReader.readLine()) != null){
                sb.append(info);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
