/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class ListaSimple {

    private Nodo inicio, fin;

    public ListaSimple() {
        inicio = fin = null;
    }

    public void agregar(String cad) {
        Nodo nuevo = new Nodo(cad);
        if (inicio == null) {
            inicio = fin = nuevo;
            return;
        }
        fin.setSig(nuevo);
        fin = nuevo;
    }

    public String ver() {
        String r = "";
        for (Nodo i = inicio; i != null; i = i.getSig()) {
            r += "[" + i.getInfo() + "]->";
        }
        return r;
    }

    public Nodo buscar(String cad) {
        for (Nodo i = inicio; i != null; i = i.getSig()) {
            if (cad.equals(i.getInfo())) {
                return i;
            }
        }
        return null;
    }

    public Nodo buscarAnterior(String cad) {
        for (Nodo i = inicio; i != fin; i = i.getSig()) {
            if (cad.equals(i.getSig().getInfo())) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        l.agregar("XDD");
        l.agregar("XDI");
        l.agregar("Xddd");
        l.agregar("Hola");
        l.agregar("Adios");
        System.out.println(l.ver());
        if (l.buscar("Perrosco") != null) {
            System.out.println("\nEncontrado");
        } else {
            System.out.println("\nNo encontrado");
        }
        if (l.editar("XDD", "xdxd")) {
            System.out.println("\nRemplazado");
        } else {
            System.out.println("\nNo remplazado");
        }
        System.out.println(l.ver());
        if (l.borrar("HAHAHA"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        if (l.borrar("xdxd"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        System.out.println(l.ver());
        if (l.borrar("Adios"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        System.out.println(l.ver());
        if (l.borrar("Xddd"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        System.out.println(l.ver());
        if (l.borrar("XDI"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        System.out.println(l.ver());
        if (l.borrar("Hola"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        System.out.println(l.ver());
        if (l.borrar("Bua"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        System.out.println(l.ver());
        if (l.borrar("Ghandi"))
            System.out.println("\nBorrado");
        else
            System.out.println("\nNo borrado");
        System.out.println(l.ver());
    }

    public boolean editar(String busqueda, String valorCambio) {
        Nodo n;
        if ((n = buscar(busqueda)) != null) {
            n.setInfo(valorCambio);
            n.getComponent().setToolTipText(n.getInfo());
            return true;
        }
        return false;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public boolean borrar(String busqueda) {
        Nodo n;
        if ((n = buscar(busqueda)) != null) {
            if (n == inicio) {
                inicio = n.getSig();
            } else if (n == fin) {
                fin = buscarAnterior(busqueda);
                fin.setSig(null);
            } else {
                buscarAnterior(busqueda).setSig(n.getSig());
            }
            return true;
        }
        return false;
    }

    public void borrar(Nodo nodo) {
        if (nodo == inicio) {
            inicio = nodo.getSig();
        } else if (nodo == fin) {
            fin = buscarAnterior(nodo.getInfo());
            fin.setSig(null);
        } else {
            buscarAnterior(nodo.getInfo()).setSig(nodo.getSig());
        }
    }
}
