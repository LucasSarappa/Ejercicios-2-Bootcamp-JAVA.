import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
    private List<T> elementos = new ArrayList<>();

    public void encolar(T elemento) {
        elementos.add(elemento);
    }

    public T desencolar() {
        if (isEmpty()) {
            throw new IllegalStateException("La fila está vacía");
        }
        return elementos.remove(0);
    }

    public T frente() {
        if (isEmpty()) {
            throw new IllegalStateException("La fila está vacía");
        }
        return elementos.get(0);
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void print() {
        for (T elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.encolar(6);
        fila.encolar(2);
        fila.encolar(10);

        System.out.print("Elementos de la fila: --> ");
        fila.print();

        System.out.println("Tamaño de la fila --> " + fila.size() + " elementos");
        System.out.println("Primer elemento de la fila: " + fila.frente());

        System.out.println("--Desencolando elementos:--");
        while (!fila.isEmpty()) {
            System.out.println("Desencolado: " + fila.desencolar());
        }
    }
}