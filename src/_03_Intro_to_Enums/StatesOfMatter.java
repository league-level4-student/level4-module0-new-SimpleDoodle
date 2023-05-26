package _03_Intro_to_Enums;

public enum StatesOfMatter {
SOLID, LIQUID, GAS;
	double temp = 0.0;
public double celsiusTemp() {
	if (values().equals(SOLID)) {
		temp =  0.0;
		return temp;
	}
	else if (values().equals(LIQUID)) {
		temp = 25.55;
		return temp;
	}
	else if (values().equals(GAS)) {
		temp = 100.0;
		return temp;
	}
	return 0;

}
public double convertToFahrenheit(){

	if (values().equals(SOLID)) {
		temp =  0.0;
		double F = temp*(9/5);
		return F;
	}
	else if (values().equals(LIQUID)) {
		temp = 25.55;
		double F = temp*(9/5);
		return F;
	}
	else if (values().equals(GAS)) {
		temp = 100.0;
		double F = temp*(9/5);
		return F;
	}
	return 0;
}
}
