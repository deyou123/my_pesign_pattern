package com.zdy.singleton.onethread;

//饿汉式。

class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
