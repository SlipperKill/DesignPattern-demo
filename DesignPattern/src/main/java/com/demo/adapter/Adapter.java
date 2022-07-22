/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.adapter;

/**
 * 
 * @Title 
 * 适配器
 * @Description 
 * 通过在内部包装一个Adaptee 对象，把源接口转换成目标接口
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class Adapter extends Target {

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request(){
		adaptee.specificRequest();
	}
}
