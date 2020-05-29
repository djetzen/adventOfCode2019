package dje.advent.code.second;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class IntCodeCalculator {

    private int solution;

    public List<Integer> calculateFirstPart(List<Integer> parsedList) {
        for (var i = 0; i < parsedList.size() / 4; i++) {
            var iterationOffset = i * 4;
            var operationCode = parsedList.get(iterationOffset);
            if (operationCode == 99) {
                break;
            }
            doSingleStepCalculation(parsedList, iterationOffset, operationCode);
        }
        return parsedList;
    }

    private void doSingleStepCalculation(List<Integer> parsedList, int iterationOffset, int operationCode) {
        var firstPosition = parsedList.get(iterationOffset + 1);
        var secondPosition = parsedList.get(iterationOffset + 2);
        var sumPosition = parsedList.get(iterationOffset + 3);
        if (operationCode == 1) {
            addValues(parsedList, firstPosition, secondPosition, sumPosition);
        } else if (operationCode == 2) {
            multiplyValues(parsedList, firstPosition, secondPosition, sumPosition);
        }
    }

    public void calculateSecondPart(List<Integer> parsedList) {
        for (var noun = 0; noun <= 99; noun++) {
            for (var verb = 0; verb <= 99; verb++) {
                var parsedListCopy = new ArrayList<>(parsedList);
                parsedListCopy.set(1, noun);
                parsedListCopy.set(2, verb);
                for (var i = 0; i < parsedList.size() / 4; i++) {
                    var iterationOffset = i * 4;
                    var operationCode = parsedListCopy.get(iterationOffset);
                    doSingleStepCalculation(parsedListCopy, iterationOffset, operationCode);
                    if (parsedListCopy.get(0) == 19690720) {
                        calculateSolutionForSecondPart(parsedListCopy, noun, verb);
                        break;
                    }
                }
            }
        }
    }

    private void calculateSolutionForSecondPart(List<Integer> parsedList, int noun, int verb) {
        solution = (100 * noun + verb);
    }

    private Integer multiplyValues(List<Integer> parsedList, int firstPosition, int secondPosition, int sumPosition) {
        return parsedList.set(sumPosition, parsedList.get(firstPosition) * parsedList.get(secondPosition));
    }

    private Integer addValues(List<Integer> parsedList, int firstPosition, int secondPosition, int sumPosition) {
        return parsedList.set(sumPosition, parsedList.get(firstPosition) + parsedList.get(secondPosition));
    }

}
