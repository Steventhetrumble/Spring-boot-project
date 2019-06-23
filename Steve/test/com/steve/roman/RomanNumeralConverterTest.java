package com.steve.roman;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralConverterTest {
	
	RomanNumeralConverter rnc;
	
	
	@BeforeEach
	public void setup() {
		rnc = new RomanNumeralConverter();
		
		
	}
	
	@Test
	public void test1() {
		int expected = 24;
		int actual = rnc.convert("XXIV");
		assertEquals(expected, actual, "calculated value was wrong");
	}
	
	@Test
	public void test2() {
		int expected = 24;
		int actual = rnc.convert("xxIV");
		assertEquals(expected, actual, "calculated value was wrong");
	}
	
	@Test
	public void test3() {
		int expected = 24;
		int actual = rnc.convert("IVXX");
		assertEquals(expected, actual, "calculated value was wrong");
	}
	@Test
	public void test4() {
		int expected = 24;
		int actual = rnc.convert("IVasdfasdfXX");
		assertEquals(expected, actual, "calculated value was wrong");
	}
	
	@ParameterizedTest
	@CsvSource({"XIV,14","XXIV,24"})
	public void testAll(String input, int expected) {	
		int actual = rnc.convert(input);
		assertEquals(expected, actual, "calculated value was wrong");
	}
}
