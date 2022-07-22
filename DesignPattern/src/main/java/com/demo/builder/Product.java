/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.builder;

import java.util.ArrayList;
import java.util.List;


public class Product {

	List<String> parts = new ArrayList<String>();
	/**
	 * 
	 * @创建人 caiming
	 * @创建时间 2018年5月7日
	 * @创建目的【添加产品部件】
	 * @param part
	 */
	public void addPart(String part) {
		parts.add(part);
	}

	/**
	 * 
	 * @创建人 caiming
	 * @创建时间 2018年5月7日
	 * @创建目的【列举所有的产品部件】
	 */
	public void show() {
		System.out.println("产品展示：");
		for (String part : parts) {
			System.out.println(part);
		}
	}

}
