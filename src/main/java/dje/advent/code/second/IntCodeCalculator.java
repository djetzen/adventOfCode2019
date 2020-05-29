package dje.advent.code.second;

import java.util.List;

public class IntCodeCalculator {
    private List<Integer> parsedList;

    public List<Integer> calculate(List<Integer> parsedList) {
        for (int i = 0; i < parsedList.size() / 4; i++) {
            int iterationOffset = i * 4;
            int operationCode = parsedList.get(iterationOffset);
            int firstPosition = parsedList.get(iterationOffset + 1);
            int secondPosition = parsedList.get(iterationOffset + 2);
            int sumPosition = parsedList.get(iterationOffset + 3);
            if (operationCode == 99) {
                break;
            }
            if (operationCode == 1) {
                addValues(parsedList, firstPosition, secondPosition, sumPosition);
            } else if (operationCode == 2) {
                multiplyValues(parsedList, firstPosition, secondPosition, sumPosition);
            }
        }
        return parsedList;
    }

    private Integer multiplyValues(List<Integer> parsedList, int firstPosition, int secondPosition, int sumPosition) {
        return parsedList.set(sumPosition, (parsedList.get(firstPosition) * parsedList.get(secondPosition)));
    }

    private Integer addValues(List<Integer> parsedList, int firstPosition, int secondPosition, int sumPosition) {
        return parsedList.set(sumPosition, (parsedList.get(firstPosition) + parsedList.get(secondPosition)));
    }

}
