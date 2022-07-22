/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.simpleFactory;
/**
 * @Title 
 * 简单工厂模式
 * @Description 
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		Operation operAdd = OperationFactory.getOpertion("+");
		operAdd.setA(11);
		operAdd.setB(12);
		double resultAdd = operAdd.getResult();
		System.out.println("+,"+resultAdd);
		
		Operation operMul = OperationFactory.getOpertion("*");
		operMul.setA(11);
		operMul.setB(12);
		double resultMul = operMul.getResult();
		System.out.println("*,"+resultMul);

	}

}

