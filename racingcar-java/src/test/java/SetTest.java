import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void SetTest1() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void SetTest2(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
    void SetTest3(int number, boolean expected) {
        assertThat(numbers.contains(number)).isEqualTo(expected);
    }
}
