package com.zephyr.basics;

public class Main {
	
	public static void main(String[] args)
	{
		Person p1 = new Person("Bradley", 20);
		Person p2 = new Person("Nathan", 19);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.getAge() + p2.getAge());
	}
}
