/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;

/**
 * 
 * @Title 
 * 抽象工厂接口，包含所有产品创建的抽象方法
 * @Description 
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public interface IFactory {

	/**
	 * 
	 * @创建人 caiming
	 * @创建时间 2018年5月7日
	 * @创建目的【創建用户抽象接口】
	 * @return
	 */
	IUser createUser();
	
	/**
	 * 
	 * @创建人 caiming
	 * @创建时间 2018年5月7日
	 * @创建目的【创建部门抽象接口】
	 * @return
	 */
	IDepartment createDepartment();
}
