# 🌳 Taller EA3 - Implementación de Árbol Binario Simple en Java

Mi nombre es **GUSTAVO ADOLFO MERCHANCANO PIEDRAHITA** y este es mi desarrollo de la actividad sobre **Árboles Binarios**. 
Usé Java y conceptos básicos de recursividad para crear una estructura que permite guardar y buscar números de forma organizada.

## 🧑‍💻 Integrantes del Grupo (¡Lo hice solo!)

## 🧐 ¿Qué es un Árbol Binario?

Me lo Imagino que es como un árbol genealógico, pero de números.

* **Raíz:** Es el número de hasta arriba, el punto de partida de todo el árbol.
* **Nodo:** Es cada número en el árbol es un nodo.
* **Ramificación (Hijos):** Lo interesante es que cada nodo solo puede tener **dos "hijos"** como máximo (por eso es **Binario**).
* **Super importante:** Para mantener el orden, usamos una regla muy simple:
    * Si el número que quiero guardar es **MENOR** que el nodo actual, va a la **IZQUIERDA**.
    * Si es **MAYOR** que el nodo actual, va a la **DERECHA**.

Esto hace que buscar y ordenar sea rápido.

## ⚙️ ¿Cómo se implementó en Java?

En este caso implementé dos clases sencillas:

1.  **`NodoArbol.java`**: Le llamo la "cajita" (el número) con tres datos: el **valor** (`dato`), un puntero a su hijo **izquierdo** (`izquierda`) y un puntero a su hijo **derecho** (`derecha`).
2.  **`ArbolBinario.java`**: Contiene la lógica principal.
    * **Inserción (`insertar`):** Se usa la técnica de **recursividad** (una función que se llama a sí misma) para ir bajando por el árbol, siguiendo la regla de "menor va a la izquierda, mayor va a la derecha", hasta encontrar un espacio vacío.
    * **Recorrido Inorden (`recorrerInorden`):** Lo describo como la manera de "visitar" todos los nodos con el orden: **Izquierda -> Raíz -> Derecha**. Como lo implementamos siguiendo la regla de oro, al hacer este recorrido, **los números salen ordenados de menor a mayor**.
    * **Búsqueda (`buscar`):** También usa recursividad. Es muy eficiente, ya que en cada paso, decidimos si ir a la izquierda o a la derecha, descartando la mitad de los números restantes.

## 🖥️ Ejemplo de Ejecución en Consola

Aquí muestro cómo funciona el programa. Inserté los números **50, 30, 70, 20, 40** y luego los recorrí para ver el orden.

### Paso 1: Insertar y Recorrido Inorden

<img width="649" height="248" alt="image" src="https://github.com/user-attachments/assets/1765d022-c56d-434a-be3d-dcda05403a96" />
<img width="644" height="234" alt="image" src="https://github.com/user-attachments/assets/2cd834e3-940e-40ec-8617-0e92d48c2edd" />
<img width="637" height="228" alt="image" src="https://github.com/user-attachments/assets/bc2d82a4-a5f5-49da-99a9-459d55758d97" />
<img width="624" height="238" alt="image" src="https://github.com/user-attachments/assets/4f43cb95-63b2-4442-86de-47ad048e9894" />
<img width="629" height="234" alt="image" src="https://github.com/user-attachments/assets/0b9b1ed7-e815-4386-a24b-fc3f073c15f6" />

<img width="631" height="223" alt="image" src="https://github.com/user-attachments/assets/b8380d67-e466-4955-b5e9-bfe8a113c020" />


### Paso 2: Búsqueda de un número

<img width="627" height="236" alt="image" src="https://github.com/user-attachments/assets/4cdb06b4-254f-4864-aa6b-ec044a642a80" />
<img width="633" height="250" alt="image" src="https://github.com/user-attachments/assets/c0618c35-f0c8-486c-ba55-ad78c6f22a30" />

## 🌟 Conclusión y Futuro

Este taller me ayudó a entender que los **Árboles Binarios** no son solo teoría; son una herramienta muy eficiente para mantener los datos ordenados. 
La **recursividad** se me hizo un poco complicada, ya que estoy muy enganchado con otro lenguaje ¡pero la clave es en aprender siempre!

El siguiente paso será intentar implementar otras operaciones como eliminar nodos o hacer recorridos Preorden/Postorden.

¡Muchas gracias porfe por su paciencia! 
 



