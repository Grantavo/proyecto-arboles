import java.util.Scanner;

/**
 * Clase para representar un nodo individual en el árbol binario.
 * Cada nodo guarda un número y tiene referencias (izquierda y derecha).
 */
class NodoArbol {
    int dato;
    NodoArbol izquierda;
    NodoArbol derecha;

    // Constructor para crear un nuevo nodo con un valor.
    public NodoArbol(int dato) {
        this.dato = dato;
        this.izquierda = null; 
        this.derecha = null;
    }
}

// ----------------------------------------------------------------------------------

/**
 * Esta clase se usa para manejar la estructura del Árbol Binario y sus operaciones.
 */
class ArbolBinario {
    // Esta'raiz' es el punto de inicio de todo el árbol.
    NodoArbol raiz;

    // Constructor para inicializar un árbol vacío.
    public ArbolBinario() {
        this.raiz = null;
    }

    // --- 1. INSERTAR NÚMEROS ---

    /**
     * Este método público es para insertar un número. 
     */
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    /**
     * Método privado y recursivo que inserta el nodo.
     * Regla: Menor va a la izquierda, Mayor va a la derecha.
     */
    private NodoArbol insertarRecursivo(NodoArbol actual, int dato) {
        // Caso base: Si el espacio está vacío, creamos el nuevo nodo.
        if (actual == null) {
            return new NodoArbol(dato);
        }

        // Decisión: ¿Izquierda o Derecha?
        if (dato < actual.dato) {
            // Es menor, vamos al subárbol izquierdo.
            actual.izquierda = insertarRecursivo(actual.izquierda, dato);
        } else if (dato > actual.dato) {
            // Es mayor, vamos al subárbol derecho.
            actual.derecha = insertarRecursivo(actual.derecha, dato);
        }
        // Si el dato es igual, simplemente lo ignoramos (no permitimos duplicados).

        return actual; // Devolvemos el nodo actual, con su subárbol actualizado.
    }

    // --- 2. MOSTRAR RECORRIDO INORDEN ---

    /**
     * Método público para iniciar el recorrido Inorden.
     */
    public void recorrerInorden() {
        recorrerInordenRecursivo(raiz);
        System.out.println(); 
    }

    /**
     * Método privado y recursivo para el recorrido Inorden:
     * Izquierda -> Raíz (Imprimir) -> Derecha. Imprime los datos ordenados.
     */
    private void recorrerInordenRecursivo(NodoArbol actual) {
        if (actual != null) {
            recorrerInordenRecursivo(actual.izquierda); // 1. Recorre Izquierda
            System.out.print(actual.dato + " ");       // 2. Imprime Raíz
            recorrerInordenRecursivo(actual.derecha);  // 3. Recorre Derecha
        }
    }

    // --- 3. BUSCAR NÚMERO ---

    /**
     * Método público para buscar un número. Llama al método recursivo.
     */
    public boolean buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    /**
     * Método privado y recursivo para buscar un número eficientemente.
     */
    private boolean buscarRecursivo(NodoArbol actual, int dato) {
        // Caso 1: El árbol está vacío o llegamos al final sin encontrarlo.
        if (actual == null) {
            return false;
        }

        // Caso 2: ¡Lo encontramos!
        if (dato == actual.dato) {
            return true;
        }

        // Caso 3: Decidir por dónde seguir buscando.
        if (dato < actual.dato) {
            // Es menor, busca por la izquierda.
            return buscarRecursivo(actual.izquierda, dato);
        } else {
            // Es mayor, busca por la derecha.
            return buscarRecursivo(actual.derecha, dato);
        }
    }
}

// ----------------------------------------------------------------------------------

/**
 * Clase principal que contiene el menú y maneja la ejecución del programa.
 */
public class MainArbol {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("🌳 TALLER DE ÁRBOLES BINARIOS SIMPLES 🌳");
        System.out.println("----------------------------------------");

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Insertar un número.");
            System.out.println("2. Mostrar recorrido Inorden (datos ordenados).");
            System.out.println("3. Buscar un número.");
            System.out.println("4. Salir.");
            System.out.print("Elige una opción: ");

            try {
                opcion = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("❌ Error: Por favor, ingresa un número válido para la opción (1-4).");
                scanner.next(); // Limpiar el buffer de entrada errónea
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("👉 Ingresa el número a insertar: ");
                    if (scanner.hasNextInt()) {
                        int numInsertar = scanner.nextInt();
                        arbol.insertar(numInsertar);
                        System.out.println("✅ Número " + numInsertar + " insertado.");
                    } else {
                        System.out.println("❌ Error: Ingresa un número entero válido.");
                        scanner.next(); 
                    }
                    break;
                case 2:
                    System.out.print("👉 Recorrido Inorden: ");
                    arbol.recorrerInorden();
                    break;
                case 3:
                    System.out.print("👉 Ingresa el número a buscar: ");
                    if (scanner.hasNextInt()) {
                        int numBuscar = scanner.nextInt();
                        if (arbol.buscar(numBuscar)) {
                            System.out.println("🥳 El número " + numBuscar + " SÍ existe en el árbol.");
                        } else {
                            System.out.println("😔 El número " + numBuscar + " NO se encontró en el árbol.");
                        }
                    } else {
                        System.out.println("❌ Error: Ingresa un número entero válido.");
                        scanner.next(); 
                    }
                    break;
                case 4:
                    System.out.println("👋 ¡Muchas gracias por usar mi programa! Seción finalizada.");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}