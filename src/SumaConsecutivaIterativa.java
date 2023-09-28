import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumaConsecutivaIterativa {

    public static boolean esSumatoriaDeConsecutivos(int valor) {
        List<Integer> consecutivos = new ArrayList<>();
        int actual = 1;
        while (valor > 0) {
            if (valor >= actual) {
                consecutivos.add(actual);
                valor -= actual;
                actual++;
            } else {
                break;
            }
        }
        if (valor == 0) {
            imprimirListaConsecutivos(consecutivos);
            return true;
        } else {
            return false;
        }
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
