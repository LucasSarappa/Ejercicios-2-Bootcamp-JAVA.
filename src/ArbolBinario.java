//4 - Implementar la clase Arbol Binario con los 3 recorridos básicos (inOrden, preOrden y postOrden)
/*
presenta un nodo en el árbol binario. Cada nodo tiene tres atributos:
valor: Almacena el valor del nodo
izquierda: Referencia al nodo hijo izquierdo.
derecha: Referencia al nodo hijo derecho.
*/

class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;

     public Nodo(int valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }
}

public class ArbolBinario {
    Nodo raiz;

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = new Nodo(1);
        arbol.raiz.izquierda = new Nodo(2);
        arbol.raiz.derecha = new Nodo(3);
        arbol.raiz.izquierda.izquierda = new Nodo(4);
        arbol.raiz.izquierda.derecha = new Nodo(5);


        System.out.println("Árbol original:");
        arbol.imprimirArbol(arbol.raiz);

        System.out.println("Recorrido inOrden:");
        arbol.inOrden(arbol.raiz);

        System.out.println("\nRecorrido preOrden:");
        arbol.preOrden(arbol.raiz);

        System.out.println("\nRecorrido postOrden:");
        arbol.postOrden(arbol.raiz);
    }

    public ArbolBinario() {
        raiz = null;
    }

    // Método para realizar un recorrido inOrden
    /*
    En este método, primero se visita el nodo izquierdo,
    luego se imprime el valor del nodo actual y finalmente
    se visita el nodo derecho.
    */

    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecha);
        }
    }

    // Método para realizar un recorrido preOrden
    /*
    En este método, primero se imprime el valor del nodo actual,
    luego se visita el nodo izquierdo y finalmente se visita el nodo derecho
    */

    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrden(nodo.izquierda);
            preOrden(nodo.derecha);
        }
    }

    // Método para realizar un recorrido postOrden
    /* En este método, primero se visita el nodo izquierdo,
    luego se visita el nodo derecho y finalmente se imprime
    el valor del nodo actual.
    */
    public void postOrden(Nodo nodo) {

        if (nodo != null) {
            postOrden(nodo.izquierda);
            postOrden(nodo.derecha);
            System.out.print(nodo.valor + " ");
        }
    }


    public void imprimirArbol(Nodo nodo) {
        imprimirArbol(nodo, "");
    }

    private void imprimirArbol(Nodo nodo, String prefijo) {
        if (nodo != null) {
            System.out.println(prefijo + "|__ " + nodo.valor);
            imprimirArbol(nodo.izquierda, prefijo + "|   ");
            imprimirArbol(nodo.derecha, prefijo + "    ");
        }
    }
}
