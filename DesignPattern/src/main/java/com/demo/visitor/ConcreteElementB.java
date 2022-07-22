/**
 * Created on 2018年5月7日 by caiming
 */
package com.demo.visitor;

public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreateElementB(this);
	}
	
	/**
	 * 
	 * @创建人 caiming
	 * @创建时间 2018年5月7日
	 * @创建目的【其他操作方法】
	 * @修改目的【修改人：，修改时间：】
	 */
	public void optionB(){
		
	}

}
