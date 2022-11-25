package com.weapons.v0;

public class IronSword extends MeleeWeapon{
	
	IronSword (int numberOfUses){
		super(numberOfUses);
	}

	String message = " ";
	
	@Override
	public String fullDamage() {	
		if(numberOfUses <= 250) {
			float damage = numberOfUses * 2.5f;
			float time = numberOfUses * 1.2f;
			message = "You did " + damage + " of damage in " + time + " seconds";
		}else {
			message = "You can not use the Gold Sword more than 250 times";
		}
		return message;
	}

	@Override
	public String weaponWear() {		
		if(numberOfUses <= 250) {
			int missingUses = 250 - numberOfUses;
			message = "Missing uses: " + missingUses;
		}else {
			message = "You can not use the Gold Sword more than 150 times";
		}
		return message;
	}
}
	

