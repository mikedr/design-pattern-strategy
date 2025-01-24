public class Tester {
    public static void main(String[] args) {
        Envio envio = new Envio(5);
        System.out.println("El costo del envio es: "+envio.calcularCosto());
    }
}
