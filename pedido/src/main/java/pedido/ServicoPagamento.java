package pedido;

public class ServicoPagamento {
    public boolean processarPagamento(Pedido pedido, double valorPago) {
        if (valorPago >= pedido.getValor()) {
            pedido.marcarComoPago();
            return true;
        }
        return false;
    }
}
