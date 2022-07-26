/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.proxy;
/**
 * @Title 
 * 代理模式
 * @Description 
 * 为其他对象提供一种代理以控制这个对象的访问
 * 应用场合：
 * 1、远程代理，也就是为一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在于不同地址空间的事实。如：webservice
 * 2、虚拟代理，是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象。
 * 3、安全代理，用来控制真实对象访问时的权限
 * 4、智能指引，是指当调用真实的对象时，代理处理另外一些事
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("jiaojiao");
		
		Proxy proxy = new Proxy(jiaojiao);
		proxy.giveDolls();
		proxy.giveFlowers();  
		proxy.giveChocolate();
	}

}

