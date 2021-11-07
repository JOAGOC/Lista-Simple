/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public void agregar(int entero) {
        NodoDoble nuevo = new NodoDoble(entero);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else if (inicio == fin && inicio.getInfo() == entero) {
            inicio.setSig(nuevo);
            nuevo.setAnt(inicio);
            fin = nuevo;
        } else if (entero < inicio.getInfo()) {
            inicio.setAnt(nuevo);
            nuevo.setSig(inicio);
            inicio = nuevo;
        } else if (entero > fin.getInfo()) {
            fin.setSig(nuevo);
            nuevo.setAnt(fin);
            fin = nuevo;
        } else {
            for (NodoDoble n = inicio.getSig(); n != null; n = n.getSig()) {
                if (n.getAnt().getInfo() <= entero && entero <= n.getInfo()) {
                    n.getAnt().setSig(nuevo);
                    nuevo.setAnt(n.getAnt());
                    n.setAnt(nuevo);
                    nuevo.setSig(n);
                    break;
                }
            }
        }
    }

    public String ver() {
        String r = "";
        for (NodoDoble i = inicio; i != null; i = i.getSig()) {
            r += "[" + i.getInfo() + "]->";
        }
        return r;
    }

    public String verAtras() {
        String r = "";
        for (NodoDoble i = fin; i != null; i = i.getAnt()) {
            r += "[" + i.getInfo() + "]->";
        }
        return r;
    }

    public NodoDoble buscar(int entero) {
        for (NodoDoble i = inicio; i != null; i = i.getSig()) {
            if (entero == i.getInfo()) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListaDoble l = new ListaDoble();
        int[] lE = {14, 13, 6, 3, 13, 11, 1, 15, 0, 4};
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
        //Prueba editar
//        int[] lEdit = {10,19,13,15};
//        for (int i = 0; i < lEdit.length; i++) {
//            System.out.println("Editar " + lE[lE.length-1-i]+", "+lEdit[i]);
//            System.out.println(l.editar(lE[lE.length-1-i],lEdit[i])?"Editado":"No editado");
//            System.out.println(l.ver());
//        }
        //Generar conjunto números
//        for (int i=0;i<10;i++){
//            System.out.print((int)(Math.random()*20)+",");
//        }
    }

    public boolean editar(int busqueda, int valorCambio) {
        if ((borrar(busqueda))) {
            agregar(valorCambio);
            return true;
        }
        return false;
    }

    public boolean borrar(int busqueda) {
        NodoDoble n;
        if ((n = buscar(busqueda)) != null) {
            if (n == inicio && n == fin) {
                inicio = fin = null;
            } else if (n == inicio) {
                inicio = n.getSig();
                inicio.setAnt(null);
            } else if (n == fin) {
                fin = fin.getAnt();
                fin.setSig(null);
            } else {
                n.getAnt().setSig(n.getSig());
                n.getSig().setAnt(n.getAnt());
            }
            return true;
        }
        return false;
    }

    public NodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    public NodoDoble getFin() {
        return fin;
    }

    public void setFin(NodoDoble fin) {
        this.fin = fin;
    }

}
