// Implementar las clases Pila y Fila sin utilizar Collections

public class PilaSinCollection {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public static void main(String[] args) {

        PilaSinCollection pila = new PilaSinCollection(4); // creo una pila de 5 elementos a partir de PilaSinCollection

        try {
            pila.push(6);
            pila.push(2);
            pila.push(10);
            /*
            pila.push(1); // Esto lanzará una excepción ya que supera el tamaño de la pila establecido de 5 elementos
             */

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Pila sin Collection: ");

        System.out.print("Elementos en la pila: --> ");
        pila.print();
        System.out.println("Tamaño de la pila: --> " + pila.size() + " elementos");
        System.out.println("Elemento en la cima: " + pila.peek());


        System.out.println("--Desapilando elementos--:");
        while (!pila.isEmpty()) {
            System.out.println("Elemento desapilado: " + pila.pop());
        }
    }
    public PilaSinCollection(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws IllegalStateException{
        if (isFull()) {
            System.out.println("La pila está llena. No se puede agregar más elementos.");
        } else {
            top++;
            stackArray[top] = value;
        }
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede extraer ningún elemento.");
            return -1; // Valor predeterminado para indicar un error o pila vacía
        } else {
            int value = stackArray[top];
            top--;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No hay elementos para ver.");
            return -1; // Valor predeterminado para indicar un error o pila vacía
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }


}