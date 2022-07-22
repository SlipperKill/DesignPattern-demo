/**
 * Created on 2018年5月8日 by caiming
 */
package com.demo.prototype;

/**
 * @Title
 * @Description
 * @Copyright
 *            <p>
 *            Copyright (c) 2016
 *            </p>
 * @Company
 *          <p>
 *          迪曼森信息科技有限公司 Co., Ltd.
 *          </p>
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class ConcretePrototype implements Cloneable {

	private String id;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConcretePrototype(String id) {
		this.id = id;
	}

	@Override
	public ConcretePrototype clone() throws CloneNotSupportedException {
		return (ConcretePrototype) super.clone();
	}

}
