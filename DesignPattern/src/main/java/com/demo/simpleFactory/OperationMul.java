/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.simpleFactory;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = getA() * getB();
		return result;
	}

}
