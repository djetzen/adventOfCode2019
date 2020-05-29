package dje.advent.code.second;

import java.util.ArrayList;
import java.util.List;

public class IntCodeParser {
    private List<Integer> parsedList;

    public List<Integer> parse(String input) {
        parsedList = new ArrayList<>();
        for (String parsedNumber : input.split(",")) {
            parsedList.add(Integer.parseInt(parsedNumber));
        }
        return parsedList;
    }

}