package _00_Intro_To_Encapsulation;

import java.util.*;

public class Pandemic {

	public static double infected(String input) {
		ArrayList<String> inputList = new ArrayList<String>();
		ArrayList<String> sortedList = new ArrayList<String>();
		StringBuilder builder = new StringBuilder();
		ArrayList<Integer> counter = new ArrayList<Integer>();
		builder.append(input);
		inputList.add(input);
		counter.add(0);
		if (input.contains("X")) {
			for (int i = 0; i < input.length(); i++) {
				if (inputList.get(i).equals("X")) {
					counter.add(i);
				}
			}
			counter.add(input.length());
				for (int j = 0; j < counter.size() + 1; j++) {
					inputList.subList(counter.get(j), counter.get(j+1));
				}
			
		} else {
			if (input.contains("1")) {
				return 100;
			} else {
				return 0;
			}

		}
		return 0;
	}
}
