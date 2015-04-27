package builder;

public enum Armor {
	CLOTHES("clothes"),LEATHER("leather"),CHAIN_MAIL("chain mail"),PALTE_MAIL("plate mail");
	private String title;
	Armor(String title){
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title;
	}
}
