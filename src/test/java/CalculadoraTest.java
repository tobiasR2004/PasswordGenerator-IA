import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Al instanciarla aquí, cubrimos el constructor implícito de la clase
    Calculadora calc = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5.0, calc.sumar(2.0, 3.0));
    }

    @Test
    void testRestar() {
        assertEquals(1.0, calc.restar(3.0, 2.0));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6.0, calc.multiplicar(2.0, 3.0));
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calc.dividir(4.0, 2.0));
    }

    @Test
    void testDividirNumerosNegativos() {
        // Test sugerido por IA para validar signos
        assertEquals(-2.0, calc.dividir(4.0, -2.0));
    }

    @Test
    void testDividirPorCero() {
        // AHORA: Usamos la constante ERROR_DIVISION_POR_CERO para validar el mensaje
        // Esto hace el test "a prueba de balas" contra errores de texto.
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10.0, 0.0);
        });

        assertEquals(Calculadora.ERROR_DIVISION_POR_CERO, exception.getMessage());
    }
}
