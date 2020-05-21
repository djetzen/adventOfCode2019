package dje.advent.code.first.fuel;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleFuelCalculatorTest {

    @Test
    void calculateSingleFuelShouldWork() {
        SimpleFuelCalculator calculator = new SimpleFuelCalculator();
        assertThat(calculator.calculateSingleFuelRequirement(12)).isEqualTo(2);
        assertThat(calculator.calculateSingleFuelRequirement(1969)).isEqualTo(654);
    }

}