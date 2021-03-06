package dje.advent.code.second;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IntCodeCalculatorTest {

    @Test
    void shouldAddTwoValuesWithALeadingOne() {
        List<Integer> parsedList = parseInput("1,0,0,0,99");
        assertThat(calculate(parsedList)).hasSameElementsAs(Arrays.asList(2, 0, 0, 0, 99));
    }

    @Test
    void shouldMultiplyTwoValueswithALeadingTwo() {
        List<Integer> parsedList = parseInput("2,3,0,3,99");
        assertThat(calculate(parsedList)).hasSameElementsAs(Arrays.asList(2, 3, 0, 6, 99));
    }

    @Test
    void shouldCalculateMoreThanOneCode() {
        List<Integer> parsedList = parseInput("1,1,1,4,99,5,6,0,99");
        assertThat(calculate(parsedList)).hasSameElementsAs(Arrays.asList(30, 1, 1, 4, 2, 5, 6, 0, 99));
    }

    @Test
    void shouldStopAsSoonAs99IsSeen() {
        List<Integer> parsedList = parseInput("1,1,1,3,99,1,1,4,1,1,1,4");
        assertThat(calculate(parsedList)).hasSameElementsAs(Arrays.asList(1, 1, 1, 2, 99, 1, 1, 4, 1, 1, 1, 4));
    }

    @Test
    void solveFirstPartOfPuzzleForSecondDay() {
        List<Integer> parsedList = parseInput("1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,2,9,19,23,2,13,23,27,1,6,27,31,2,6,31,35,2,13,35,39,1,39,10,43,2,43,13,47,1,9,47,51,1,51,13,55,1,55,13,59,2,59,13,63,1,63,6,67,2,6,67,71,1,5,71,75,2,6,75,79,1,5,79,83,2,83,6,87,1,5,87,91,1,6,91,95,2,95,6,99,1,5,99,103,1,6,103,107,1,107,2,111,1,111,5,0,99,2,14,0,0");
        calculate(parsedList);
        assertThat(parsedList.get(0)).isEqualTo(2890696);
    }

    @Test
    void solveSecondPartOfPuzzleForSecondDay() {
        List<Integer> parsedList = parseInput("1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,2,9,19,23,2,13,23,27,1,6,27,31,2,6,31,35,2,13,35,39,1,39,10,43,2,43,13,47,1,9,47,51,1,51,13,55,1,55,13,59,2,59,13,63,1,63,6,67,2,6,67,71,1,5,71,75,2,6,75,79,1,5,79,83,2,83,6,87,1,5,87,91,1,6,91,95,2,95,6,99,1,5,99,103,1,6,103,107,1,107,2,111,1,111,5,0,99,2,14,0,0");
        assertThat(calculateWithSolution(parsedList)).isEqualTo(8226);
    }

    private List<Integer> calculate(List<Integer> parsedList) {
        IntCodeCalculator calculator = new IntCodeCalculator();
        return calculator.calculateFirstPart(parsedList);
    }

    private int calculateWithSolution(List<Integer> parsedList) {
        IntCodeCalculator calculator = calculateSecondPart(parsedList);
        return calculator.getSolution();
    }

    private IntCodeCalculator calculateSecondPart(List<Integer> parsedList) {
        IntCodeCalculator calculator = new IntCodeCalculator();
        calculator.calculateSecondPart(parsedList);
        return calculator;
    }


    private List<Integer> parseInput(String input) {
        return new IntCodeParser().parse(input);
    }
}
