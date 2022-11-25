package com.weapons.v0;

public class DiamondSword extends MeleeWeapon{
	
	DiamondSword (int numberOfUses){
		super(numberOfUses);
	}

	String message = " ";
	
	@Override
	public String fullDamage() {	
		if(numberOfUses <= 400) {
			float damage = numberOfUses * 4.5f;
			float time = numberOfUses * 1.2f;
			message = "You did " + damage + " of damage in " + time + " seconds";
		}else {
			message = "You can not use the Gold Sword more than 400 times";
		}
		return message;
	}

	@Override
	public String weaponWear() {		
		if(numberOfUses <= 400) {
			int missingUses = 400 - numberOfUses;
			message = "Missing uses: " + missingUses;
		}else {
			message = "You can not use the Gold Sword more than 150 times";
		}
		return message;
	}
	
}
