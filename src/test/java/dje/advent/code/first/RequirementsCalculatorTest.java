package dje.advent.code.first;

import dje.advent.code.first.fuel.ComplexFuelCalculator;
import dje.advent.code.first.fuel.SimpleFuelCalculator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class RequirementsCalculatorTest {

    @Test
    void calculateSumCorrectlyWithSimpleFuelCalculator() throws IOException {
        RequirementsCalculator calculator = new RequirementsCalculator(new SimpleFuelCalculator());
        assertThat(calculator.calculateFuel()).isEqualTo(3291760);
    }
    @Test
    void calculateSumCorrectlyWithComplexFuelCalculator() throws IOException {
        RequirementsCalculator calculator = new RequirementsCalculator(new ComplexFuelCalculator());
        assertThat(calculator.calculateFuel()).isEqualTo(4934767);
    }
}