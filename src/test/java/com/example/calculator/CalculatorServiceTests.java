package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorServiceTests {

	private final CalculatorService service = new CalculatorService();

	@Test
	void shouldReturn4When2Plus2() {
		Assertions.assertEquals("2 + 2 = 4", service.plus(2, 2));
	}

	@Test
	void shouldReturn25When10Plus15() {
		Assertions.assertEquals("10 + 15 = 25", service.plus(10, 15));
	}

	@Test
	void shouldReturn0When5Minus5() {
		Assertions.assertEquals("5 - 5 = 0", service.minus(5, 5));
	}

	@Test
	void shouldReturn10When15Minus5() {
		Assertions.assertEquals("15 - 5 = 10", service.minus(15, 5));
	}

	@Test
	void shouldReturn4When2Multiply2() {
		Assertions.assertEquals("2 * 2 = 4", service.multiply(2, 2));
	}

	@Test
	void shouldReturn0When5Multiply0() {
		Assertions.assertEquals("5 * 0 = 0", service.multiply(5, 0));
	}

	@Test
	void shouldReturn1When5Divide5() {
		Assertions.assertEquals("5 / 5 = 1", service.divide(5, 5));
	}

	@Test
	void shouldReturn5When10Divide2() {
		Assertions.assertEquals("10 / 2 = 5", service.divide(10, 2));
	}

	@Test
	void shouldThrowException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> service.divide(5, 0));
	}

}
