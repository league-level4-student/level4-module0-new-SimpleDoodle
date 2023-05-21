package _01_Encapsulate_the_Data;

import java.awt.Robot;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.
	
	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;
	
	
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	public int getItemsReceived() {
		if (itemsReceived < 0) {
			itemsReceived = 0;
		}
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		this.itemsReceived = itemsReceived;
	}
	
	private double degreesTurned;
	
	public double getDegreesTurned() {
		if (degreesTurned <= 0.0) {
			degreesTurned = 0.0;
		}
		else if (degreesTurned >= 360.0) {
			degreesTurned = 360.0;
		}
		return degreesTurned;
	}

	public void setDegreesTurned(double degreesTurned) {
		this.degreesTurned = degreesTurned;
	}
	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	public String getNomenclature() {
		if (nomenclature.isEmpty() == true) {
			nomenclature = " ";
		}
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
	}

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;
	
	public Object getMemberObj() {
		if (memberObj instanceof String == true) {
			memberObj = 5;
		}
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		this.memberObj = memberObj;
	}

}
