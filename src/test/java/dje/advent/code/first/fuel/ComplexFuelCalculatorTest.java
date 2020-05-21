package dje.advent.code.first.fuel;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComplexFuelCalculatorTest {

    @Test
    void calculateSingleFuel() {
        ComplexFuelCalculator fuelCalculator = new ComplexFuelCalculator();
        assertThat(fuelCalculator.calculateSingleFuelRequirement(14)).isEqualTo(2);
        assertThat(fuelCalculator.calculateSingleFuelRequirement(1969)).isEqualTo(966);
        assertThat(fuelCalculator.calculateSingleFuelRequirement(100756)).isEqualTo(50346);
    }

}