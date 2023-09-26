import java.util.Scanner;

public class ProductoSinMultiplicacionRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int producto = productoSinMultiplicacion(numero1, numero2);

        System.out.println("El producto sin reaulizar la multiplicacion entre " + numero1 + " y " + numero2 + " es: " + producto);
    }

    public static int productoSinMultiplicacion(int numero1, int numero2) {
        // Caso base: si uno de los números es 0, el producto es 0.
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        }

        // Caso base: si uno de los números es 1, el producto es el otro número.
        if (numero1 == 1) {
            return numero2;
        }
        if (numero2 == 1) {
            return numero1;
        }

        // Si ninguno de los casos base se cumple, calculamos el producto de forma recursiva.
        if (numero1 > 0 && numero2 > 0) {
            return numero1 + productoSinMultiplicacion(numero1, numero2 - 1);
        } else if (numero1 < 0 && numero2 < 0) {
            // Si ambos números son negativos, cambiamos los signos y calculamos el producto positivo.
            return productoSinMultiplicacion(-numero1, -numero2);
        } else {
            // Si uno de los números es negativo, calculamos el producto negativo.
            return -productoSinMultiplicacion(Math.abs(numero1), Math.abs(numero2));
        }
    }
}
