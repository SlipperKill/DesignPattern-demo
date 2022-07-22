/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.builder;

/**
 * 
 * @Title 
 * @Description 
 * 为创建一个product对象的各个部件指定的抽象接口
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public abstract class Builder {

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract Product getProduct();
}
