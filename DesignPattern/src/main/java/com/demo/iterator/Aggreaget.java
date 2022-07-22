/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.iterator;

public abstract class Aggreaget<T> {

	public abstract Iterator<T> createIterator();
}
