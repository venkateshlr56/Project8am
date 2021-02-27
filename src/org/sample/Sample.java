package org.sample;

public class Sample {

	public static void main(String[] args) {

		String s = "heLLOWorld@123 45.com";
		int caps = 0, lower = 0, special = 0, number = 0;
		String cap = "", low = "", spe = "", num = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90) {
				caps++;
				cap = cap + c;

			} else if (c >= 97 && c <= 122) {
				lower++;
				low = low + c;
			} else if (c >= 48 && c <= 57) {
				number++;
				num = num + c;
			} else {
				special++;
				spe = spe + c;
			}

		}
		System.out.println("Lower Count :" + lower + " " + "Lower Words :" + low);
		System.out.println("Captial Count :" + caps + " " + "Captial Words :" + cap);
		System.out.println("Number Count :" + number + " " + "Number  :" + num);
		System.out.println("Special Count :" + special + " " + "Special char :" + spe);

	}

}
