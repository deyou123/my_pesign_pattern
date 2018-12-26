package com.zdy.singleton.morethread.two;

/**
 * 多线程环境下的懒汉式单例模式(DCL，双检锁+volatile实现) 
 * 加入了volatile变量来禁止指令重排序   
 * @author ywq
 *
 *
 */
class Single{  
    private static volatile Single s = null;  
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
 
