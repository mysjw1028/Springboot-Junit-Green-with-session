package site.metacoding.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyParseTest {

    @Test
    public void changeStringTolnt_test() {
        // given
        String value = "1";

        // when
        int result = Integer.parseInt(value);

        // then
        assertEquals(1, result);
    }
}
