package com.zdy.singleton.onethread.one;

//懒汉模式（延迟实例加载）
class Single
{
	private static Single s = null;
	private Single(){}
 
	public static  Single getInstance()
	{
		if(s==null)
		   s = new Single();
		return s;
	}
}


