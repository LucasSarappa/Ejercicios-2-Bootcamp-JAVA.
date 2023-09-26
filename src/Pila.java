// 1 Implementar la clase Pila (Utilizando una Collection que no implemente la interfaz Queue / Deque)

import java.util.ArrayList;

public class Pila<T> {

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(6);
        pila.push(2);
        pila.push(10);

        System.out.print("Pila con Collection sin Queue/Deque: ");

        System.out.print("Elementos de la pila: --> ");
        pila.print();

        System.out.println("Tamaño de la pila --> " + pila.size() + " elementos");

        System.out.println("Elemento en la cima: " + pila.peek());

        System.out.println("--Desapilando elementos:--");

        while (!pila.isEmpty()) {
            System.out.println("Elemento desapilado: " + pila.pop());
        }
    }

    private ArrayList<T> elementos;

    public Pila() {
        elementos = new ArrayList<T>();
    }

    // Método para agregar un elemento a la pila
    public void push(T elemento) {
        elementos.add(elemento);
    }

    // Método para eliminar y devolver el elemento en la cima de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int lastIndex = elementos.size() - 1;
        T elemento = elementos.get(lastIndex);
        elementos.remove(lastIndex);
        return elemento;
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return elementos.size();
    }

    // Método para obtener el elemento en la cima de la pila sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }

    // Método para imprimir la pila
    public void print() {
        for (T elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }


}
