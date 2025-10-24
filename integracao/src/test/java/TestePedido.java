import exemplo1.Pedido;
import exemplo1.Pagamento;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestePedido{

    @Test
    @DisplayName("Test:")
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Notebook",2500.00);

        Pagamento pagamento = new Pagamento();
        boolean pagamentoProcessado = pagamento.processarPagamento(pedido, "Cartão de Crédito");

        if(pagamentoProcessado){
            System.out.println("teste de integracao passou");
        }
        else{
            System.out.println("teste não passou");
        }
    }
}