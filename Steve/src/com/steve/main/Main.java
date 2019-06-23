package com.steve.main;

import com.steve.roman.RomanNumeralConverter;

public class Main {

	public static void main(String[] args) {
		RomanNumeralConverter rnc = new RomanNumeralConverter();
		System.out.println(rnc.convert("XXIV"));
	}
}
