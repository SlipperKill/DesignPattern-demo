/**
 * Created on 2018年4月25日 by caiming
 */
package com.demo.mediator;

/**
 * 
 * @Title 
 * 中介者模式
 * @Description 
 * 用一個中介对象来封装一系列的对象交互。中介者使各对象不需要显式的相互引用，从而使其耦合松散，而且可以独立的改变它们之间的交互
 * 当系统出现了“多对多”交互复杂的对象群时，不要急于使用中介者模式，而要反思你的系统在设计上是否合理
 * 中介者模式一般應用於一组对象已定义良好，但是复杂的方式进行通信的场合
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();//聯合國安理會 做為美國和伊拉克的中介者

		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);

		UNSC.setColleague1(c1);
		UNSC.setColleague2(c2);
		
		c1.declare("不准研制核武器，否则发动战争");
		c2.declare("我们没有核武器，也不怕侵略");
	}

}
