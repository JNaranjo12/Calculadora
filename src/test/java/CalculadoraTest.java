import com.proyecto.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSuma() {
        assertEquals(10, calc.sumar(6, 4));
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(4, 0));
    }

    @Test
    void testRaizNegativa() {
        assertThrows(IllegalArgumentException.class, () -> calc.raiz(-9));
    }

    @Test
    void testPotencia() {
        assertEquals(8, calc.potencia(2, 3));
    }

    @Test
    void testAbsoluto() {
        assertEquals(5, calc.absoluto(-5));
    }
}