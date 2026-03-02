package nom_proy;

import nom_proy.mate.Operacion;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionTest {

    @Test
    public void testSumar() {
        Operacion op = new Operacion(5, 3);
        assertEquals(8, op.sumar(), 0.001);
    }

    @Test
    public void testRestar() {
        Operacion op = new Operacion(5, 3);
        assertEquals(2, op.restar(), 0.001);
    }

    @Test
    public void testMultiplicar() {
        Operacion op = new Operacion(5, 3);
        assertEquals(15, op.multiplicar(), 0.001);
    }

    @Test
    public void testDividir() {
        Operacion op = new Operacion(6, 3);
        assertEquals(2, op.dividir(), 0.001);
    }
}

