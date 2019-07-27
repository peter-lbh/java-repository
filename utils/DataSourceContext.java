package com.xmg.p2p.base.utils;

/**
 * 用于存放当前线程使用的数据库名字的工具类
 */
public class DataSourceContext {
    private static ThreadLocal<String> datasourceLocal = new ThreadLocal<>();
    /**
     * 定义get和set方法给外界使用ThreadLocal自带的get和set方法，用于在当前线程上绑定东西
     */
    public static void set(String dsName){
        datasourceLocal.set(dsName);
    }
    public static String get(){
       return datasourceLocal.get();
    }


}