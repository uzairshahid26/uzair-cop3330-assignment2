package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        assertTrue(App.Password( 8, 2, 2).length()>=8)
    }
}