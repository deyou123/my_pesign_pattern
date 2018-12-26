package com.zdy.singleton.morethread;

/**
 * 多线程环境下的懒汉式单例模式(简单加锁)    
 * @author ywq
 *
 *
 */
class Single{  
    private static Single s = null;  
    private Single(){}  
  
    public static  Single getInstance(){
    	synchronized(Single.class){
    		if(null==s)  
    			s = new Single();  
    	}
    	return s;  
    }  
} 