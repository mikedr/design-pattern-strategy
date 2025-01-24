public class Envio {
    private CalculadoraDeEnvio calculadoraDeEnvio;

    private float peso;

    public Envio(float peso) {
        this.peso = peso;
    }

    public CalculadoraDeEnvio getCalculadoraDeEnvio() {
        return calculadoraDeEnvio;
    }

    public void setCalculadoraDeEnvio(CalculadoraDeEnvio calculadoraDeEnvio) {
        this.calculadoraDeEnvio = calculadoraDeEnvio;
    }

    public double calcularCosto() {
        return calculadoraDeEnvio.calcularCosto(peso);
    }
}
