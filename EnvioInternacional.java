public class EnvioInternacional implements CalculadoraDeEnvio {
    public double calcularCosto(double peso) {
        return 200.0 + 15 * peso;
    }
}
