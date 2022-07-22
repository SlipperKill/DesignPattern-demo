/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.decorator;

public class Person {

	public String name;
	
	public Person(){
		
	}

	public Person(String name) {
		this.name = name;
	}
	
	public void show(){
		System.out.println(name+"--");
	}
}
