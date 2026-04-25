public class Calculadora {
    public static void main(String[] args) {
        Suma s = new Suma();
        Resta r = new Resta();
        Multiplicacion m = new Multiplicacion();
        Division d = new Division();

        System.out.println("=== CALCULADORA JAVA ===");
        System.out.println("Resultado suma = " + s.sumar(10,5));
        System.out.println("Resultado resta = " + r.restar(10,5));
        System.out.println("Resultado multiplicación = " + m.multiplicar(10,5));
        try {
            System.out.println("Division 10 / 0 = " + d.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Division 10 / 0 → " + e.getMessage());
        }

        System.out.println("Resultado división = " + d.dividir(10,5));
    }
}