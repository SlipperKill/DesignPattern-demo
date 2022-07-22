/**
 * Created on 2018年5月7日 by caiming
 */
package com.demo.visitor;

import java.util.ArrayList;
import java.util.List;

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
public class ObjectStructure {

	private List<Element> elements = new ArrayList<Element>();

	public void attach(Element element) {
		elements.add(element);
	}

	public void detach(Element element) {
		elements.remove(element);
	}

	public void accept(Visitor visitor) {
		for (Element e : elements) {
			e.accept(visitor);
		}
	}
}
