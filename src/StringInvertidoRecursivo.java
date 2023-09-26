import java.util.Scanner;

public class StringInvertidoRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena/frase: ");
        String fraseOriginal = scanner.nextLine();

        String fraseInvertida = InvertirFrase (fraseOriginal);
        System.out.println("Cadena Original ingresada: " + fraseOriginal);
        System.out.println("Cadena Invertida resultante: " + fraseInvertida);


    }

    public static String InvertirFrase (String frase) {
        // Caso base: si la palabra tiene 0 o 1 caracteres, no es necesario invertirla
        if (frase.length() <= 1) {
            return frase;
        }

        // Caso recursivo: divide la cadena en dos partes y llama recursivamente para invertir las dos partes y luego concatenarlas en orden invertido
        String mitad1 = frase.substring(0, frase.length() / 2);
        String mitad2 = frase.substring(frase.length() / 2);

        String primitadInvertida = InvertirFrase(mitad1);
        String segmitadInvertida = InvertirFrase(mitad2);

        return segmitadInvertida + primitadInvertida;
    }


}