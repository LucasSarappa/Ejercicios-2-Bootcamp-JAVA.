import java.util.Scanner;

public class StringInvertidoRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadenaOriginal = scanner.nextLine();

        String cadenaInvertida = invertirStringRecursivamente(cadenaOriginal);
        System.out.println("Cadena Original: " + cadenaOriginal);
        System.out.println("Cadena Invertida: " + cadenaInvertida);


    }

    public static String invertirStringRecursivamente(String cadena) {
        // Caso base: si la cadena tiene 0 o 1 caracteres, no es necesario invertirla
        if (cadena.length() <= 1) {
            return cadena;
        }

        // Caso recursivo: divide la cadena en dos partes y llama recursivamente
        // para invertir las dos partes y luego concatenarlas en orden invertido
        String primeraMitad = cadena.substring(0, cadena.length() / 2);
        String segundaMitad = cadena.substring(cadena.length() / 2);

        String primeraMitadInvertida = invertirStringRecursivamente(primeraMitad);
        String segundaMitadInvertida = invertirStringRecursivamente(segundaMitad);

        return segundaMitadInvertida + primeraMitadInvertida;
    }


}