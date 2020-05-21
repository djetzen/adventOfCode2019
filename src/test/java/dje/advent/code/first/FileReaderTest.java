package dje.advent.code.first;

import static org.assertj.core.api.Assertions.*;

import dje.advent.code.first.FileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class FileReaderTest {

    @Test
    public void shouldReadFileAndDeliverListOfIntegers() throws IOException {
        FileReader fileReader = new FileReader();
        List<Integer> inputs = fileReader.readFuelInputFile();
        assertThat(inputs).hasSize(100);
        assertThat(inputs.get(0)).isEqualTo(73365);
        assertThat(inputs.get(99)).isEqualTo(142447);
    }
}