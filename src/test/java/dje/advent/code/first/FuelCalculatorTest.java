package dje.advent.code.first;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FuelCalculatorTest {

    @Test
    void calculateSingleFuelShouldWork() {
        FuelCalculator calculator = new FuelCalculator();
        assertThat(calculator.calculateSingleFuelRequirement(12)).isEqualTo(2);
        assertThat(calculator.calculateSingleFuelRequirement(1969)).isEqualTo(654);
    }

    @Test
    void calculateNeededFuelForSolution() throws IOException {
        FuelCalculator calculator = new FuelCalculator();
        assertThat(calculator.calculateFuel()).isEqualTo(3291760);
    }

}