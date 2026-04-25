public class Calculadora {
    public static void main(String[] args) {
        Suma s = new Suma();
        Resta r = new Resta();

        System.out.println("=== CALCULADORA JAVA ===");
        System.out.println("Resultado suma = " + s.sumar(10,5));
        System.out.println("Resultado resta = " + r.restar(10,5));
    }
}