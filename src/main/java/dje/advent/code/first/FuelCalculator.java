package dje.advent.code.first;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class FuelCalculator {

    public int calculateFuel() throws IOException {
        FileReader fileReader = new FileReader();
        List<Integer> integers = fileReader.readFuelInputFile();
        int sum = 0;
        for(var integer: integers) {
            sum+=calculateSingleFuelRequirement(integer);
        }
        return sum;
    }

    public int calculateSingleFuelRequirement(int input) {
        double d = input / 3;
        return (int) Math.floor(d)-2;
    }

}
