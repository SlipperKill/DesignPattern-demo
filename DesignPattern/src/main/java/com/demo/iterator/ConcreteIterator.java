/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.iterator;

public class ConcreteIterator extends Iterator<String> {

	private ConcreteAggreaget aggreagt;

	private int current = 0;

	public ConcreteIterator(ConcreteAggreaget aggreagt) {
		this.aggreagt = aggreagt;
	}

	@Override
	public String first() {
		return aggreagt.get(0);
	}

	@Override
	public String next() {
		current++;
		if (current < aggreagt.count()) {
			return aggreagt.get(current);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		return current >= aggreagt.count() ? true : false;
	}

	@Override
	public String currentItem() {
		return aggreagt.get(current);
	}

}
