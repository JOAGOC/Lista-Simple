/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Nodo {
    private String info;
    private Nodo sig;
    private javax.swing.JComponent comp;
    
    Nodo (String info){
        this.info = info;
        sig=null;
        comp = new javax.swing.JComponent(){
            public void paint(Graphics g) {
                super.paint(g); //To change body of generated methods, choose Tools | Templates.
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 40, 40);
                g.setColor(Color.orange);
                g.fillRect(40, 0, 10, 40);
                g.setColor(Color.black);
                int[] xPoints = {45, 70, 70, 79, 70, 70, 45,45}, yPoints = {15, 15, 10, 20, 30, 25, 25,15};
                for(int i = 0; i < xPoints.length-1; i++){
                    g.drawLine(xPoints[i], yPoints[i], xPoints[i+1], yPoints[i+1]);
                }
            }
        };
        comp.setToolTipText(info);
        comp.setPreferredSize(new Dimension(80,40));
    }

    public javax.swing.JComponent getComponent(){
        return comp;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}
