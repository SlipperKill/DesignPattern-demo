/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.builder;


public class BuilderA extends Builder {

	private Product a = new Product();

	@Override
	public void buildPartA() {
		a.addPart("a");
	}

	@Override
	public void buildPartB() {
		a.addPart("b");

	}

	@Override
	public Product getProduct() {
		return a;
	}

}
