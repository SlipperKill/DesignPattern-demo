/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.state;

/**
 * 状态模式
 * @Title 
 * @Description 
 * 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
 * 主要解決的当控制一个对象状态转换的条件表达式过于复杂的情况。把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把複雜的邏輯簡化		
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(10);
		work.writeProgram();

		work.setHour(13);
		work.writeProgram();
		
		work.setHour(19);
		work.writeProgram();
	}

}
