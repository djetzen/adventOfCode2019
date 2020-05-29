package dje.advent.code.second;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IntCodeParserTest {

    @Test
    void shouldParseListCorrectly() {
        IntCodeParser parser = new IntCodeParser();
        List<Integer> parsedList = parser.parse("1,2,3,4");
        assertThat(parsedList).hasSize(4);
        assertThat(parsedList.get(0)).isEqualTo(1);
        assertThat(parsedList.get(3)).isEqualTo(4);
    }
}
