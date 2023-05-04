package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class CalculatorServiceParamTests {

    private final CalculatorService service = new CalculatorService();

    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(10, 15, 25)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void shouldReturnCorrectSum(int num1, int num2, int expectedSum) {
        Assertions.assertEquals(expectedSum, service.plus(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(15, 5, 10)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void shouldReturnCorrectDiff(int num1, int num2, int expectedDiff) {
        Assertions.assertEquals(expectedDiff, service.minus(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(5, 0, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void shouldReturnCorrectWork(int num1, int num2, int expectedWork) {
        Assertions.assertEquals(expectedWork, service.multiply(num1, num2));
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(10, 2, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void shouldReturnCorrectQuotient(int num1, int num2, int expectedQuotient) {
        Assertions.assertEquals(expectedQuotient, service.divide(num1, num2));
    }
}
