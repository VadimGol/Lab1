public class Coffee extends Food {
	private String aroma;

	public Coffee(String aroma) {
		super("Кофе");
		this.aroma = aroma;
	}

	@Override
	public void consume() {
		System.out.println(this + " выпито");
	}

	public String getSize() {
		return aroma;
	}

	public void setSize(String aroma) {
		this.aroma = aroma;
	}

	public String toString() {
		return super.toString() + " аромата '" + aroma.toUpperCase() + "'";
	}

}
