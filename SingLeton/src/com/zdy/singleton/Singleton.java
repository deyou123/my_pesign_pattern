package com.zdy.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		// TODO Auto-generated constructor stub
		System.out.println("单例模式");
	}
	public static Singleton getIntance(){
		return singleton;
	}
}
