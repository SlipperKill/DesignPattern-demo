/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.bridge;

/**
 * 
 * @Title 
 * 桥接模式
 * @Description 
 * 将抽象部分与它的实现部分分离，使它们可以独立变化，减少它们之间的耦合
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ImplementorA());
		ab.opertion();

		ab.setImplementor(new ImplementorB());
		ab.opertion();
	}

}
