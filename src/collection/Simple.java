package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Simple {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sanjay MR", "Suraj MR", "MR Diganth", "Rocky MR", "Devil MR", "Sreeja Mrs",
				"Raja Dr");

		// getExampleOne(names);
		// getExampleTwo(names);
		// getExampleThree(names);
		System.out.println(getExampleFour(names));
	}

	private static void getExampleOne(List<String> names) {

		List<String> empty = new ArrayList<String>();

		for (int i = 0; i <= names.size() - 1; i++) {
			String str1 = names.get(i);
			char str2 = ' ';
			String str3 = "";

			for (int j = 0; j <= str1.length() - 1; j++) {
				char ch = str1.charAt(j);

				if (ch == 'M' || ch == 'R') {
					str2 = ch;
				} else {
					str3 = str3 + ch;
				}
			}
			empty.add(str3.trim());
		}

		System.out.println();
		System.out.println("After removing the MR from the list");
		System.out.println();
		System.out.println(empty);
	}

	private static void getExampleTwo(List<String> names) {

		List<String> returnString = new ArrayList<>();

		for (String val : names) {
			returnString.add(val.replaceAll("MR", " ").trim());
		}

		System.out.println("returnString : " + returnString);

	}

	private static void getExampleThree(List<String> names) {

		List<String> returnString = new ArrayList<>();

		names.stream().forEach(str -> returnString.add(str.replaceAll("MR", " ").trim()));

		System.out.println("returnString : " + returnString);
	}

	private static List<String> getExampleFour(List<String> names) {

		return names.stream().map(mr -> mr.replaceAll("MR", " ").trim()).map(mrs -> mrs.replaceAll("Mrs", " ").trim())
				.map(dr -> dr.replaceAll("Dr", " ").trim()).collect(Collectors.toList());
	}
}
