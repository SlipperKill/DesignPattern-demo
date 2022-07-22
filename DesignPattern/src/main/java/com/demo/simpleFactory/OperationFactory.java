/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.simpleFactory;

public class OperationFactory {

	public static Operation getOpertion(String opertion) {
		Operation oper = null;
		switch (opertion) {
		case "+":
			oper = new OperationAdd();
			break;

		case "*":
			oper = new OperationMul();
			break;
		}
		return oper;
	}

}
