package b;
public class CalculadoraSegura {
    private final ValidadorEntrada validador = new ValidadorEntrada();
    private final Calculadora calculadora = new Calculadora();

    public Integer somarSeguramente(int a, int b) {
        if (!validador.validar(a, b)) return null;
        return calculadora.somar(a, b);
    }
}
