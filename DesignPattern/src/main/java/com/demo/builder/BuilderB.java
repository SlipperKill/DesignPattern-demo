/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.builder;


public class BuilderB extends Builder {

	private Product b = new Product();

	@Override
	public void buildPartA() {
		b.addPart("x");
	}

	@Override
	public void buildPartB() {
		b.addPart("y");
	}

	@Override
	public Product getProduct() {
		return b;
	}

}
