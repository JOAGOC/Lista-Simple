
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angel
 */
public class NodoCircular {

    private float info;
    private NodoCircular sig, ant;
    private javax.swing.JComponent comp;

    NodoCircular(float info) {
        this.info = info;
        sig = ant = null;
    }

    public javax.swing.JComponent getComponent() {
        if (this == null) {
            return null;
        }
        comp = new javax.swing.JComponent() {
            public void paint(Graphics g) {
                super.paint(g); //To change body of generated methods, choose Tools | Templates.
                g.setColor(Color.BLUE);
                g.fillRect(15, 0, 30, 40);
                g.setColor(Color.orange);
                g.fillRect(5, 0, 10, 40);
                g.fillRect(45, 0, 10, 40);
                g.setColor(Color.black);
                //Flecha saliente (Izq)
                g.drawLine(0, 10, 10, 10);
                //Flecha entrante (Izq)
                g.drawLine(0, 30, 10, 30);
                g.drawLine(10, 30, 7, 27);
                g.drawLine(10, 30, 7, 33);
                //Flecha entrante (Der)
                g.drawLine(60, 10, 50, 10);
                g.drawLine(50, 10, 53, 7);
                g.drawLine(50, 10, 53, 13);
                //Flecha entrante (Der)
                g.drawLine(60, 30, 50, 30);
            }
        };
        comp.setToolTipText(info + "");
        comp.setPreferredSize(new Dimension(60, 40));
        return comp;
    }

    public float getInfo() {
        return info;
    }

    public void setInfo(float info) {
        this.info = info;
    }

    public NodoCircular getSig() {
        return sig;
    }

    public void setSig(NodoCircular sig) {
        this.sig = sig;
    }

    public NodoCircular getAnt() {
        return ant;
    }

    public void setAnt(NodoCircular ant) {
        this.ant = ant;
    }
}
