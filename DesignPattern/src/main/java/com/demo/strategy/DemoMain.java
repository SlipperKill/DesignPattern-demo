/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.strategy;

/**
 * @Title 
 * 策略模式
 * @Description 
 * 它定义了算法家族，分别封装起来，让它们之间可以互相转换，此模式让算法的变化，不会影响到使用算法的客户
 * 策略模式就是用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，只要在分析过程中听到需要在不同时间应用不同的业务规则，就可以使用策略模式处理这种变化的可能性
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String args[]) {
		CashContext cc = new CashContext("normal");
		double normalResult = cc.getResult(100);
		System.out.println("normal:" + normalResult);

		CashContext cc1 = new CashContext("rebate");
		double rebateResult = cc1.getResult(100);
		System.out.println("normal:" + rebateResult);
	}
}
