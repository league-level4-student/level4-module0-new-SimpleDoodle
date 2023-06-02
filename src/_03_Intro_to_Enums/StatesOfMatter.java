package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0.0), LIQUID(25.55), GAS(100.0);
	private double temp;
	private double fahren;
	StatesOfMatter(double temp) {
		this.temp = temp;
	}

	public double celsiusTemp() {

		return this.temp;

	}
	public double fahrenTemp() {
		fahren = temp*9/5 + 32;
		return this.fahren;
	}

}
