/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.composite;


public abstract class Company {

	protected String name;

	public Company(String name) {
		this.name = name;
	}

	public abstract void add(Company c);

	public abstract void remove(Company c);

	public abstract void display(int depth);

	public abstract void lineOfDuty();

	
}
