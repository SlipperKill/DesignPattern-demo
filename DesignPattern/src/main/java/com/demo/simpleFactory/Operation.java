/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.simpleFactory;

public abstract class Operation {

	private double a = 0;

	private double b = 0;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public abstract double getResult();
}
