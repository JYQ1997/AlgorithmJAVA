package com.designModelTest.Singleton.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式
 * @Author YongQiang
 * @Date 2020/5/19 14:03
 * @Version 1.0
 */
public class SingletonManager {
    private static Map<String,Object> singletonMap=new HashMap<String, Object>();

    private SingletonManager(){}

    //将多种单例类型注入到一个统一的管理类，在使用时根据key获取对象对应类型的对象
    public static void registService(String key,Object object){
        if (!singletonMap.containsKey(key)){
            singletonMap.put(key,object);
        }
    }
    public static Object getService(String key){
        return singletonMap.get(key);
    }
}
