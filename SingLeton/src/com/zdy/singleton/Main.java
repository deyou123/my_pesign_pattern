package com.zdy.singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println("Star");
		Singleton obj1 = Singleton.getIntance();
		Singleton obj2 = Singleton.getIntance();
		if(obj1 == obj2){
			System.out.println("ojb1 �� ojb2 ��2����ͬ��ʵ��");	
		}else{
			System.out.println("obb1 �� ojb2 ʱ��ͬʵ��");
		}
		System.out.println("end");
	}
}
