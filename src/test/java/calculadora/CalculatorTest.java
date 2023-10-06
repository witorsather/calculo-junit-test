package calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Adiciona 2 números")
    void add() {
        assertEquals(4, Calculator.add(2,2));
    }

    @Test
    @DisplayName("Multiplica 2 números")
    void multiply() {
        assertAll(
                () -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(3, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0))
                );
    }
}