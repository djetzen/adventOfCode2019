package dje.advent.code.first.fuel;

public class SimpleFuelCalculator implements FuelCalculator {
    @Override
    public int calculateSingleFuelRequirement(int input) {

        double d = input / 3;
        return (int) Math.floor(d)-2;
    }
}
