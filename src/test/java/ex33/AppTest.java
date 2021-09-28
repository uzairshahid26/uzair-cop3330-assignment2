package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {

        assertFalse(App.numGenerator(3) > 3);
    }
}