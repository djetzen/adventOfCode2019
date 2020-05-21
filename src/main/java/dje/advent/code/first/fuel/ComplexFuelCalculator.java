package dje.advent.code.first.fuel;

public class ComplexFuelCalculator implements FuelCalculator {

    @Override
    public int calculateSingleFuelRequirement(int input) {
        int sum = 0;
        int result = 0;
        result = calculateSingleStep(input);
        while(result > 0){
            sum += result;
            result = calculateSingleStep(result);
        }
        return sum;
    }

    private int calculateSingleStep(int input) {
        return new SimpleFuelCalculator().calculateSingleFuelRequirement(input);
    }
}
