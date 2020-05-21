package dje.advent.code.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<Integer> readFuelInputFile() throws IOException {
        var lines = Files.readAllLines(Paths.get("src/main/resources/firstdayinput.txt").toAbsolutePath());
        return convertToNumbers(lines);
    }

    private List<Integer> convertToNumbers (List<String> lines) {
        List<Integer> numbers = new ArrayList<>();
        for(var line: lines) {
            numbers.add(Integer.parseInt(line));
        }
        return numbers;
    }
}
