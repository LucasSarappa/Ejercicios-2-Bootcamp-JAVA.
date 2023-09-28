import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumaConsecutiva {

    public static boolean esSumatoriaDeConsecutivos(int valor) {
        return esSumatoriaDeConsecutivosRecursivo(valor, 1, new ArrayList<>());
    }

    private static boolean esSumatoriaDeConsecutivosRecursivo(int valor, int actual, List<Integer> consecutivos) {
        if (valor == 0) {
            // Existe la suma de consecutivos
            imprimirListaConsecutivos(consecutivos);
            return true;
        }
        if (valor < 0 || actual > valor) {
            // No existe la suma de consecutivos
            return false;
        }

        // Intentamos con el siguiente número consecutivo
        consecutivos.add(actual);
        return esSumatoriaDeConsecutivosRecursivo(valor - actual, actual + 1, consecutivos);
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
