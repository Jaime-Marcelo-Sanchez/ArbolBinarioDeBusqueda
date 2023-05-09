package Principal;

import static Principal.Nodo.*;
import javax.swing.JOptionPane;

public class Arbol {

    public static int pos = -1, pad = 0, disp = 1, nuevo, ptr = 1, salva = 0, num_eliminar, sup = 0;
    public static int raizz = -1;
    static int pila[] = new int[1000];

    public void Insercion(double elemento) {

        if (raizz == -1) {
            raizz = 1;
            Dato[disp] = elemento;
        } else {
            if (Dato[ptr] == elemento) {
                JOptionPane.showMessageDialog(null, "YA EXISTE EL NUMERO INGRESADO");
                return;
            } else {
                if (elemento < Dato[ptr]) {
                    if (Izq[ptr] == 0) {
                        disp++;
                        Izq[ptr] = disp;
                        Dato[disp] = elemento;
                        ptr = 1;
                    } else {
                        ptr = Izq[ptr];
                        Insercion(elemento);
                    }
                } else {
                    if (Der[ptr] == 0) {
                        disp++;
                        Der[ptr] = disp;
                        Dato[disp] = elemento;
                        ptr = 1;
                    } else {
                        ptr = Der[ptr];
                        Insercion(elemento);
                    }
                }
                ptr = 1;
            }

        }

    }

    public String RecoInOrden() {

        if (raizz == -1) {

            return "El arbol esta vacio";
        } else {
            int ptraux = 1;
            String recorridoInorden = "-";
            sup = 0;
            pila[sup] = 0;

            do {
                sup++;
                pila[sup] = ptraux;
                ptraux = Izq[ptraux];
            } while (ptraux != 0);

            ptraux = pila[sup];
            sup--;
            do {
                recorridoInorden += "[" + Dato[ptraux] + "]" + "-";
                if (Der[ptraux] != 0) {
                    ptraux = Der[ptraux];
                    do {
                        sup++;
                        pila[sup] = ptraux;
                        ptraux = Izq[ptraux];
                    } while (ptraux != 0);
                }
                ptraux = pila[sup];
                sup--;
            } while (ptraux != 0);

            for (int i = 0; i <= disp; i++) {
                pila[i] = 0;
            }
            return recorridoInorden;
        }
    }

    public String RecoPreOrden() {
        if (raizz == -1) {

            return "El arbol esta vacio";
        } else {
            String recorridoPreorden = "-";
            sup = 0;
            pila[sup] = 0;
            int ptraux = 1;

            do {
                recorridoPreorden += "[" + Dato[ptraux] + "]" + "-";
                if (Der[ptraux] != 0) {
                    sup++;
                    pila[sup] = Der[ptraux];

                }
                if (Izq[ptraux] != 0) {
                    ptraux = Izq[ptraux];
                } else {
                    ptraux = pila[sup];
                    sup--;
                }
            } while (ptraux != 0);

            for (int i = 0; i <= disp; i++) {
                pila[i] = 0;
            }

            return recorridoPreorden;
        }
    }

    public String RecoPostOrden() {
        if (raizz == -1) {

            return "El arbol esta vacio";
        } else {
            String recorridoPostorden = "-";
            int ptraux = raizz;
            sup = 0;
            boolean flag = false;
            pila[sup] = 0;

            do {
                while (ptraux != 0) {
                    sup++;
                    pila[sup] = ptraux;
                    if (Der[ptraux] != 0) {
                        sup++;
                        pila[sup] = Der[ptraux] * -1;
                    }
                    ptraux = Izq[ptraux];
                }
                ptraux = pila[sup];
                sup--;
                while (ptraux > 0) {
                    recorridoPostorden += "[" + Dato[ptraux] + "]" + "-";
                    ptraux = pila[sup];
                    sup--;
                }
                if (ptraux < 0) {
                    ptraux = ptraux * -1;
                } else {
                    flag = true;
                }
            } while (flag != true);

            for (int i = 0; i <= disp; i++) {
                pila[i] = 0;
            }

            return recorridoPostorden;
        }
    }

    public void Busqueda(double num) {
        pad = 0;
        salva = 0;
        int posaux = 0;
        int ptraux = 1;
        if (raizz == -1) {
            posaux = 0;
            ptraux = 0;
            JOptionPane.showMessageDialog(null, "EL ARBOL ESTA VACIO");

        } else if (num == Dato[raizz]) {
            posaux = raizz;
            pad = 1;
            JOptionPane.showMessageDialog(null, "EL NUMERO SI ESTA EN EL ARBOL Y ES LA RAIZ");

        } else {
            if (num < Dato[raizz]) {
                ptraux = Izq[raizz];
                salva = raizz;
            } else {
                ptraux = Der[raizz];
                salva = raizz;
            }
            while (ptraux != 0) {
                if (num == Dato[ptraux]) {
                    posaux = ptraux;
                    pad = salva;
                    JOptionPane.showMessageDialog(null, "EL NUMERO SI ESTA EN EL ARBOL"
                            + "\nPosicion del nodo padre: " + pad
                            + "\nValor del nodo padre: " + Dato[pad]);
                    return;
                } else if (num < Dato[ptraux]) {
                    salva = ptraux;
                    ptraux = Izq[ptraux];

                } else {
                    salva = ptraux;
                    ptraux = Der[ptraux];
                }
            }
            if (posaux == 0 && pad == salva) {
                JOptionPane.showMessageDialog(null, "EL NUMERO NO ESTA EN EL ARBOL");

            }
        }
        pad = 0;
        salva = 0;
    }

    public void eliminar_total(double num, int ptraux, int anterior) {

        int pos_nodo_eliminar;

        if (num == Dato[ptraux] && Izq[ptraux] == 0 && Der[ptraux] == 0) {
            if (ptraux == raizz) {
                Dato[ptraux] = 0;
                raizz = -1;

            } else {
                if (Izq[anterior] == ptraux) {
                    Izq[anterior] = 0;
                }
                if (Der[anterior] == ptraux) {
                    Der[anterior] = 0;
                }
                Dato[ptraux] = 0;

            }

        } else {
            if (num == Dato[ptraux] && (Izq[ptraux] != 0 || Der[ptraux] != 0)) {
                pos_nodo_eliminar = ptraux;

                if (Der[ptraux] != 0) {
                    anterior = ptraux;
                    ptraux = Der[ptraux];
                    while (Izq[ptraux] != 0) {
                        anterior = ptraux;
                        ptraux = Izq[ptraux];
                    }
                    Dato[pos_nodo_eliminar] = Dato[ptraux];
                    if (Dato[anterior] == Dato[ptraux]) {
                        Der[pos_nodo_eliminar] = 0;
                    } else {
                        Der[pos_nodo_eliminar] = anterior;
                        Der[ptraux] = 0;
                        Izq[anterior] = 0;
                    }
                    Dato[ptraux] = 0;

                } else if (Izq[ptraux] != 0) {
                    anterior = ptraux;
                    ptraux = Izq[ptraux];
                    while (Der[ptraux] != 0) {
                        anterior = ptraux;
                        ptraux = Der[ptraux];
                    }
                    Dato[pos_nodo_eliminar] = Dato[ptraux];
                    if (Dato[anterior] == Dato[ptraux]) {
                        Izq[pos_nodo_eliminar] = 0;
                    } else {
                        Izq[pos_nodo_eliminar] = anterior;
                        Izq[ptraux] = 0;
                        Der[anterior] = 0;
                    }
                    Dato[ptraux] = 0;

                }

            } else {
                if (num > Dato[ptraux]) {
                    anterior = ptraux;
                    ptraux = Der[ptraux];
                    eliminar_total(num, ptraux, anterior);
                } else {
                    anterior = ptraux;
                    ptraux = Izq[ptraux];
                    eliminar_total(num, ptraux, anterior);
                }

            }

        }
    }

}
