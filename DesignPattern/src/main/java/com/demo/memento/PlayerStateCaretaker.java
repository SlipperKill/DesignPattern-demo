/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.memento;

public class PlayerStateCaretaker {

	private PlayerMemento memento;

	public PlayerMemento getMemento() {
		return memento;
	}

	public void setMemento(PlayerMemento memento) {
		this.memento = memento;
	}

}
