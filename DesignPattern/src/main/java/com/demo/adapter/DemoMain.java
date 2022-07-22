/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.adapter;

/**
 * 
 * @Title 
 * 适配器模式
 * @Description 
 * 将一个类的接口转换成客户希望的另外一个接口。使得原本不兼容而不能一起工作的那些类可以一起工作
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		//对于客户端来说，调用的是Target的request，实际执行的是Adaptee的request
		Target target = new Adapter();
		target.request();
	}

}
