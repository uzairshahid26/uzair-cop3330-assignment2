package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordTest {

    @Test
    void passwordValidator() {
        password s = new password();
        int actual = s.passwordValidator("12345");
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void main() {
        password s = new password();
        int actual = s.passwordValidator("12345");
        int expected = 0;
        assertEquals(expected, actual);

    }
}