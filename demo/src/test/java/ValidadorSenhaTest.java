// import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue; 
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import validadorsenhatest.ValidadorSenha;

public class ValidadorSenhaTest {

    @Test
    public void testValidarSenha() {
        ValidadorSenha val = new ValidadorSenha();
        assertTrue(val.validar("Senha123"));
        assertFalse(val.validar("senha123")); // falta maiúscula
        assertFalse(val.validar("SENHA"));    // falta número
        assertFalse(val.validar("123456"));   // falta letra
        assertFalse(val.validar(""));         // vazia
    }
}
