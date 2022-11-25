package com.weapons.v0;

public abstract class MeleeWeapon implements Weapon{
	
	int numberOfUses;
	
	MeleeWeapon(int numberOfUses) {
		this.numberOfUses = numberOfUses;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": \nNumber of uses: " + numberOfUses;
	}
	
}
