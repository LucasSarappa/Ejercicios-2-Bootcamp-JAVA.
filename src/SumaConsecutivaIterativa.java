import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumaConsecutivaIterativa {

    public static boolean esSumatoriaDeConsecutivos(int value) {
        List<Integer> consecutivos = new ArrayList<>();
        int current = 1;
        while (value > 0) {
            if (value >= current) {
                consecutivos.add(current);
                value -= current;
                current++;
            } else {
                break;
            }
        }
        if (value == 0) {
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
