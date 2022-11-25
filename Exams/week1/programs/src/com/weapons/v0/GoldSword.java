package com.weapons.v0;

public class GoldSword extends MeleeWeapon{
	
	GoldSword (int numberOfUses){
		super(numberOfUses);
	}

	String message = " ";
	@Override
	public String fullDamage() {
		
		//String message = " ";
		if(numberOfUses <= 150) {
			float damage = numberOfUses * 1.5f;
			float time = numberOfUses * 1.2f;
			message = "You did " + damage + " of damage in " + time + " seconds";
		}else {
			message = "You can not use the Gold Sword more than 150 times";
		}
		return message;
	}

	@Override
	public String weaponWear() {
		
		if(numberOfUses <= 150) {
			int missingUses = 150 - numberOfUses;
			message = "Missing uses: " + missingUses;
		}else {
			message = "You can not use the Gold Sword more than 150 times";
		}
		return message;
	}
}
