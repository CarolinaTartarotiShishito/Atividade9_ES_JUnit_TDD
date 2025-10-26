import b.CalculadoraSegura;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraSeguraIT {
    @Test
    void testSomaComValidacao(){
        CalculadoraSegura cs = new CalculadoraSegura();
        assertEquals(2, cs.somarSeguramente(1, 1));
        assertNull(cs.somarSeguramente(-1,5));
    }
}
