/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.iterator;

public abstract class Iterator<T> {

	public abstract T first();

	public abstract T next();

	public abstract boolean isDone();

	public abstract T currentItem();
}
