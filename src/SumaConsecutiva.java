import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumaConsecutiva {

    public static boolean esSumatoriaDeConsecutivos(int value) {
        return esSumatoriaDeConsecutivosRecursivo(value, 1, new ArrayList<>());
    }

    private static boolean esSumatoriaDeConsecutivosRecursivo(int value, int current, List<Integer> consecutivos) {
        if (value == 0) {
            // Hemos encontrado una suma de consecutivos
            imprimirListaConsecutivos(consecutivos);
            return true;
        }
        if (value < 0 || current > value) {
            // No es posible encontrar una suma de consecutivos
            return false;
        }

        // Intentamos con el siguiente número consecutivo
        consecutivos.add(current);
        return esSumatoriaDeConsecutivosRecursivo(value - current, current + 1, consecutivos);
    }

    private static void imprimirListaConsecutivos(List<Integer> consecutivos) {
        Collections.reverse(consecutivos);
        System.out.println(consecutivos);
    }

    public static void main(String[] args) {
        System.out.println(esSumatoriaDeConsecutivos(3)); // Debería devolver true
        System.out.println(esSumatoriaDeConsecutivos(9)); // Debería devolver true
        System.out.println(esSumatoriaDeConsecutivos(5)); // Debería devolver false
    }
}
