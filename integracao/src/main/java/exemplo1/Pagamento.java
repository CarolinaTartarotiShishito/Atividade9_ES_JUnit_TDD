package exemplo1;

public class Pagamento {
    public boolean processarPagamento(Pedido pedido, String metodoPagamento) {
        if (pedido == null || metodoPagamento == null) {
            throw new IllegalArgumentException("Pedido e metodoPagamento nao podem ser nulos");
        }

        System.out.println("Processando pagamento de R$ " + pedido.getValor() + " usando " + metodoPagamento);
        return true;
    }
}
