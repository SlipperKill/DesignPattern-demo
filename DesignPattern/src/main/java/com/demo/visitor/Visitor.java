/**
 * Created on 2018年5月7日 by caiming
 */
package com.demo.visitor;
/**
 * @Title 
 * @Description 
 * @Copyright <p>Copyright (c) 2016</p>
 * @Company <p>迪曼森信息科技有限公司 Co., Ltd.</p>
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public abstract class Visitor {

	public abstract void visitConcreateElementA(ConcreteElementA concreteElementA);
	
	public abstract void visitConcreateElementB(ConcreteElementB concreteElementB);
}

