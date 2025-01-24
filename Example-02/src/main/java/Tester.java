public class Tester {
    public static void main(String[] args) {
        Envio envio = new Envio(10);
        envio.setCalculadoraDeEnvio(new EnvioRapido());
        envio.setCalculadoraDeEnvio(new EnvioInternacional());
        System.out.println("El costo del envio es: "+envio.calcularCosto());
    }
}
