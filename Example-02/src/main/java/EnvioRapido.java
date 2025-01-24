public class EnvioRapido implements CalculadoraDeEnvio {
    public double calcularCosto(double peso) {
        return 100.0 + 10  * peso;
    }
}
