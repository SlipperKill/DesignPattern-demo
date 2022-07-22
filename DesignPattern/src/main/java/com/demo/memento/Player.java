/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.memento;

public class Player {

	private int vit;

	private int atk;

	private int def;

	public PlayerMemento saveState() {
		return new PlayerMemento(vit, atk, def);
	}

	public void recoverState(PlayerMemento memento) {
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}

	public void getInitState() {
		this.vit = 100;
		this.def = 888;
		this.atk = 999;
	}

	public void dead() {
		this.vit = 0;
	}

	public void display() {
		System.out.println("vit = " + this.vit);
		System.out.println("atk = " + this.atk);
		System.out.println("def = " + this.def);
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

}
