// Implementar las clases Pila y Fila sin utilizar Collections

public class FilaSinCollection {
    private int[] elementos;
    private int capacidad;
    private int tamanio;
    private int frente;
    private int finalCola;

    public static void main(String[] args) {
        FilaSinCollection fila = new FilaSinCollection(3);

        fila.encolar(6);
        fila.encolar(2);
        fila.encolar(10);

        System.out.print("Pila sin collection: ");

        System.out.print("Elementos de la pila: --> "  );
        fila.mostrarFila();
        System.out.println("Tamaño de la fila: -->" + fila.tam() + " elementos");

        System.out.println("--Desencolando elementos:--");
        while (!fila.estaVacia()) {
            System.out.println("Desencolando: " + fila.desencolar());
        }

    }

    public FilaSinCollection(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new int[capacidad];
        this.tamanio = 0;
        this.frente = 0;
        this.finalCola = -1;
    }

    public void encolar(int elemento) {
        if (tamanio < capacidad) {
            if (finalCola == capacidad - 1) {
                finalCola = -1;
            }
            elementos[++finalCola] = elemento;
            tamanio++;
        } else {
            System.out.println("La fila está llena. No se puede encolar.");
        }
    }

    public int desencolar() {
        if (tamanio > 0) {
            int elementoDesencolado = elementos[frente++];
            if (frente == capacidad) {
                frente = 0;
            }
            tamanio--;
            return elementoDesencolado;
        } else {
            System.out.println("La fila está vacía. No se puede desencolar.");
            return -1; // valor para indicar un error.
        }
    }

    public int tam() {
        return tamanio;
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }

    public void mostrarFila() {
        for (int i = 0; i < tamanio; i++) {
            int indice = (frente + i) % capacidad;
            System.out.print(elementos[indice] + " ");
        }

    }


}
