package dje.advent.code.first;

import dje.advent.code.first.fuel.FuelCalculator;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Builder
public class RequirementsCalculator {

    private FuelCalculator fuelCalculator;

    public int calculateFuel() throws IOException {
        FileReader fileReader = new FileReader();
        List<Integer> integers = fileReader.readFuelInputFile();
        int sum = 0;
        for(var integer: integers) {
            sum+=fuelCalculator.calculateSingleFuelRequirement(integer);
        }
        return sum;
    }
}
