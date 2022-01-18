import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @DisplayName("요구사항 1-1")
    @Test
    void splitTest() {
        String[] result = "1,2".split(",");
        assertThat(result).contains("2", "1");
        assertThat(result).containsExactly("1", "2");
    }

    @DisplayName("요구사항 1-2")
    @Test
    void splitTest2() {
        String[] result = "1".split(",");
        assertThat(result).containsExactly("1");
    }

    @DisplayName("요구사항 2")
    @Test
    void substringTest() {
        String data = "(1,2)";
        int left = data.indexOf("(");
        int right = data.indexOf(")");
        String result = data.substring(left + 1, right);
        assertThat(result).isEqualTo("1,2");
    }

    @DisplayName("요구사항 3")
    @Test
    void charAtTest() {
        String data = "abc";
        assertThatThrownBy(() -> {
            data.charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);

    }


}
