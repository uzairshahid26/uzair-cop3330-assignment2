package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        assertEquals(70, Math.ceil(test.calculateMonthsUnitPaidOff(5000,100, (double) 12 / 36500)));


    }

    @Test
    void main() {


    }
}