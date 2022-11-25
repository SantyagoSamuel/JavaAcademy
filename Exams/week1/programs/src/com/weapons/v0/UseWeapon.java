package com.weapons.v0;

import java.util.ArrayList;
import java.util.List;

public class UseWeapon {

	public static void main(String[] args) {
		
		int numberOfUses = 23;
		
		List<Weapon> weaponList = new ArrayList<>();
		weaponList.add(new GoldSword(numberOfUses));
		weaponList.add(new IronSword(numberOfUses));
		weaponList.add(new DiamondSword(numberOfUses));
		
		for(Weapon w:weaponList) {
			System.out.println(w);
			System.out.println(w.fullDamage());
			System.out.println(w.weaponWear());
			System.out.println("_______________________________________");
		}
	}

}
