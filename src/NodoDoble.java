
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
public class NodoDoble {
    private int info;
    private NodoDoble sig,ant;
     private javax.swing.JComponent comp;
    
       NodoDoble (int info){
        this.info = info;
        sig=null;
    }

      public javax.swing.JComponent getComponent(){
          if (this == null)
            return null;
        if (this.ant!=null && this.sig!=null){
            comp = new javax.swing.JComponent(){
                public void paint(Graphics g) {
                    super.paint(g); //To change body of generated methods, choose Tools | Templates.
                    g.setColor(Color.BLUE);
                    g.fillRect(15, 0, 35, 40);
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
                    g.drawLine(60, 10, 45, 10);
                    g.drawLine(45, 10, 48, 7);
                    g.drawLine(45, 10, 48, 13);
                    //Flecha entrante (Der)
                    g.drawLine(60, 30, 50, 30);                  
                }
            };
        } else if (this.ant!=null){
            comp = new javax.swing.JComponent(){
                public void paint(Graphics g) {
                    super.paint(g); //To change body of generated methods, choose Tools | Templates.
                    g.setColor(Color.BLUE);
                    g.fillRect(15, 0, 45, 40);
                    g.setColor(Color.orange);
                    g.fillRect(5, 0, 10, 40);
                    g.fillRect(45, 0, 10, 40);
                    g.setColor(Color.black);
                    //Flecha entrante (Der)
                    g.drawLine(60, 10, 50, 10);
                    g.drawLine(50, 10, 48, 5);
                    g.drawLine(50, 10, 48, 15);
                    //Flecha entrante (Der)
                    g.drawLine(60, 30, 50, 30);                                      
                }
            };
        } else if (this.sig!=null){
            comp = new javax.swing.JComponent(){
                public void paint(Graphics g) {
                    super.paint(g); //To change body of generated methods, choose Tools | Templates.
                    g.setColor(Color.BLUE);
                    g.fillRect(15, 0, 45, 40);
                    g.setColor(Color.orange);
                    g.fillRect(5, 0, 10, 40);
                    g.fillRect(45, 0, 10, 40);
                    g.setColor(Color.black);
                    //Flecha entrante (Der)
                    g.drawLine(60, 10, 50, 10);
                    g.drawLine(45, 10, 48, 5);
                    g.drawLine(45, 10, 48, 15);
                    //Flecha entrante (Der)
                    g.drawLine(60, 30, 50, 30);               
                }
            };
        } else{
            comp = new javax.swing.JComponent(){
                public void paint(Graphics g) {
                    super.paint(g); //To change body of generated methods, choose Tools | Templates.
                    g.setColor(Color.BLUE);
                    g.fillRect(10, 0, 40, 40);
                    g.setColor(Color.orange);
                    g.fillRect(0, 0, 10, 40);
                    g.fillRect(40, 0, 10, 40);
                }
            };
        }
        comp.setToolTipText(info+"");
        comp.setPreferredSize(new Dimension(60,40));
        return comp;
  }
    
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }
    
}
