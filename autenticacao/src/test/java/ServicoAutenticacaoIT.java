import autenticacao.RepositorioUsuarios;
import autenticacao.ServicoAutenticacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;

class ServicoAutenticacaoIT {

    @Test
    void testAutenticacaoCompleta(){
        RepositorioUsuarios repo = new RepositorioUsuarios();
        repo.salvar("Alice", "1234");
        ServicoAutenticacao servico = new ServicoAutenticacao(repo);

        assertTrue(servico.autenticar("Alice", "1234"));
        assertFalse(servico.autenticar("Alice", "0000"));
        assertFalse(servico.autenticar("Bob", "1234"));
    }
}
