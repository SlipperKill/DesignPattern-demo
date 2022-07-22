/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.builder;

/**
 * 
 * @Title 
 * 指挥者类
 * @Description 
 * 用来指挥创建过程
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class Director {

	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
