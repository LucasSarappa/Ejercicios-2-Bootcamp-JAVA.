import java.util.Scanner;

public class FactorialRecursivo {

    public static void main(String[] args) {

        System.out.println("-----------------Calcular el factorial de un número de forma recursiva-----------------");
        System.out.println("Ingrese el numero al que le desea calcular su factorial");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        long resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
