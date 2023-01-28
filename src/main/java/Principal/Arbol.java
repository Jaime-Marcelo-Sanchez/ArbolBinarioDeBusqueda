/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author user
 */
public class Arbol {

    Nodo raiz; // Empieza como nulo

    public void insertar(Nodo nuevo_nodo) {
        raiz = insertHelper(raiz, nuevo_nodo);
    }

    private Nodo insertHelper(Nodo raiz, Nodo nuevo_nodo) {

        double dato = nuevo_nodo.dato;

        if (raiz == null) {
            raiz = nuevo_nodo;
            return raiz;
        } else if (dato < raiz.dato) {
            raiz.izq = insertHelper(raiz.izq, nuevo_nodo);
        } else {
            raiz.der = insertHelper(raiz.der, nuevo_nodo);
        }

        return raiz;
    }

}
