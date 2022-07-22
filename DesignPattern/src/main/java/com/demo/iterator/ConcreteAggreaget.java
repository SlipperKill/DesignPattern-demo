/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggreaget extends Aggreaget<String> {

	List<String> list = new ArrayList<String>();

	@Override
	public Iterator<String> createIterator() {
		return new ConcreteIterator(this);
	}

	public int count() {
		return list.size();
	}

	public String get(int index) {
		return list.get(index);
	}

	public void set(int index, String value) {
		list.add(index, value);
	}

}
