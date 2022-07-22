/**
 * Created on 2018年5月7日 by caiming
 */
package com.demo.visitor;
public class ConcreteVisitorA extends Visitor {

	@Override
	public void visitConcreateElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()+"被"+this.getClass().getName()+"访问");
	}

	@Override
	public void visitConcreateElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName()+"被"+this.getClass().getName()+"访问");

	}

}

