/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.bridge;


public abstract class Abstraction {

	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public void opertion() {
		implementor.opertionImpl();
	}
}
