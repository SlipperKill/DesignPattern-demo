/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.command;

/**
 * 
 * @Title
 * 命令模式 
 * @Description 
 * 将一个请求封装为一个对象，从而使你可以用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作
 * 优点：
 * 1、它能较轻易的设计一个命令队列；
 * 2、在需要的情况下，可以较容易的将命令记入日志
 * 3、允许接收请求的一方决定是否拒绝请求
 * 4、可以容易的实现对请求的撤销或重做
 * 5、加进新的命令类而不影响其他的类
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		// 开店前的准备
		Barbecuer boy = new Barbecuer();
		Command cmd1 = new BakeMuttonCommand(boy);
		Command cmd2 = new BakeMuttonCommand(boy);
		Command cmd3 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		girl.setOrder(cmd1);
		girl.setOrder(cmd2);
		girl.setOrder(cmd3);

		girl.excute();
	}

}
