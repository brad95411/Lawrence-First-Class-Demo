package com.zephyr.basics;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String newName, int newAge)
	{
		name = newName;
		age = newAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String toString()
	{
		return "The name of this person is " + name + " and there age is " + age;
	}
}
