package teste;

public class Pedido {
    private String id;
    private double valor;
    private boolean pago;

    public Pedido(String id, double valor){
        this.id = id;
        this.valor = valor;
        this.pago = false;
    }

    public String getId(){ return id; }
    public double getValor() { return valor; }
    public boolean isPago(){ return pago; }
    public void marcarComoPago(){ this.pago = true; }
}
