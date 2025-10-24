package exemplo1;

public class Pedido {
    private String produto;
    private double valor;

    public Pedido(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }
}
