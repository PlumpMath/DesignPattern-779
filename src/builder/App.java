package builder;

public class App {
	public static void main(String[] args) {
		Hero mage = new Hero.HeroBuilder(Profession.MAGE, "Riobard")
		.withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER)
		.build();
		System.out.println(mage);
	}

}
