package com.zdy.singleton.morethread.one;
/**
 * 多线程环境下的懒汉式单例模式(DCL，双检锁实现) 
 * 由于指令可能重排序，即DCL可能会返回一个并不完整的对象。   
 * @author ywq
 *
 *
 */
class Single{  
    private static Single s = null;  
    private Single(){}  
  
    public static  Single getInstance(){
    	if(null==s){
    		synchronized(Single.class){
        		if(null==s)  
        			s = new Single();  
        	}
    	}
    	return s;  
    }  
}