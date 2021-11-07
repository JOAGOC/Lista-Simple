/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class ListaDobleCircular {

    private NodoCircular inicio, fin;

    public ListaDobleCircular() {
        inicio = fin = null;
    }

    public void agregar(float flotante) {
        NodoCircular nuevo = new NodoCircular(flotante);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else if (flotante < inicio.getInfo()) {
            inicio.setAnt(nuevo);
            nuevo.setSig(inicio);
            inicio = nuevo;
        } else if (flotante > fin.getInfo()) {
            fin.setSig(nuevo);
            nuevo.setAnt(fin);
            fin = nuevo;
        } else {
            for (NodoCircular n = inicio.getSig(); n != null; n = n.getSig()) {
                if (n.getAnt().getInfo() <= flotante && flotante <= n.getInfo()) {
                    n.getAnt().setSig(nuevo);
                    nuevo.setAnt(n.getAnt());
                    n.setAnt(nuevo);
                    nuevo.setSig(n);
                    if (inicio == fin) {
                        fin = inicio.getSig();
                    }
                    break;
                }
            }
        }
        fin.setSig(inicio);
        inicio.setAnt(fin);
    }

    public String ver() {
        if (vacia()) {
            return "";
        }
        String r = "";
        byte s = 0;
        for (NodoCircular i = inicio; (s = i == inicio ? ++s : s) != 3; i = i.getSig()) {
            r += (i == inicio ? "inicio" : i == fin ? "fin-" : "") + "[" + i.getInfo() + "]->";
        }
        return r;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public String verAtras() {
        if (vacia()) {
            return "";
        }
        String r = "";
        byte s = 0;
        for (NodoCircular i = fin; (s = i == fin ? ++s : s) != 3; i = i.getAnt()) {
            r += "[" + i.getInfo() + "]->";
        }
        return r;
    }

    public NodoCircular buscar(float entero) {
        for (NodoCircular i = inicio; ; i = i.getSig()) {
            if (entero == i.getInfo()) {
                return i;
            }
            if (i == fin) {
                break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListaDobleCircular l = new ListaDobleCircular();
        float[] lE = {14, 13, 6, 3, 13, 11, 1, 15, 0, 4};
        for (int i = 0; i < lE.length; i++) {
            System.out.println("Insertar " + lE[i]);
            l.agregar(lE[i]);
            System.out.println(l.ver());
            System.out.println(l.verAtras());
        }
        //Prueba borrar
//        int[] nB = {0, 15, 13, 11, 43};
        for (int i = lE.length - 1; i >= 0; i--) {
            System.out.println("Borrar " + lE[i]);
            System.out.println(l.borrar(lE[i]) ? "Borrado" : "No borrado");
            System.out.println(l.ver());
            System.out.println(l.verAtras());
        }
//        Prueba editar
//        float[] lEdit = {10,19,13,15};
//        for (int i = 0; i < lEdit.length; i++) {
//            System.out.println("Editar " + lE[lE.length-1-i]+", "+lEdit[i]);
//            System.out.println(l.editar(lE[lE.length-1-i],lEdit[i])?"Editado":"No editado");
//            System.out.println(l.ver());
//        }
//        Generar conjunto números
//        for (int i=0;i<10;i++){
//            System.out.print((Math.random()*20)+",");
//        }
    }

    public NodoCircular getInicio() {
        return inicio;
    }

    public NodoCircular getFin() {
        return fin;
    }

    public boolean editar(float busqueda, float valorCambio) {
        if ((borrar(busqueda))) {
            agregar(valorCambio);
            return true;
        }
        return false;
    }

    public boolean borrar(float busqueda) {
        NodoCircular n;
        if ((n = buscar(busqueda)) == null) {
            return false;
        }
        if (n == inicio && n == fin) {
            inicio = fin = null;
        } else if (n == inicio) {
            inicio = inicio.getSig();
            inicio.setAnt(fin);
            fin.setSig(inicio);
        } else if (n == fin) {
            fin = fin.getAnt();
            fin.setSig(inicio);
            inicio.setAnt(fin);
        } else {
            n.getAnt().setSig(n.getSig());
            n.getSig().setAnt(n.getAnt());
            return true;
        }
        return true;
    }
}
