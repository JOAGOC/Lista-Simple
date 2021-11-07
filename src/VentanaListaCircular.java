import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angel
 */
public class VentanaListaCircular extends javax.swing.JFrame {

    public static VentanaListaCircular getInstance() {
        if (instance == null)
            instance = new VentanaListaCircular();
        return instance;
    }

    private VentanaListaCircular() {
        initComponents();
        ldc = new ListaDobleCircular();
        addWindowListener(VentanaPrincipal.escuchaHijo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnAgregar = new javax.swing.JButton();
        txtAgregar = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        txtDel = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRemplazar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlNodos = new javax.swing.JPanel();

        setTitle("Lista Circular Flotante");
        setPreferredSize(new java.awt.Dimension(753, 418));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(btnAgregar, gridBagConstraints);

        txtAgregar.setMinimumSize(new java.awt.Dimension(70, 22));
        txtAgregar.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(txtAgregar, gridBagConstraints);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(btnBorrar, gridBagConstraints);

        txtDel.setMinimumSize(new java.awt.Dimension(70, 22));
        txtDel.setName("Borrar"); // NOI18N
        txtDel.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(txtDel, gridBagConstraints);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(btnEditar, gridBagConstraints);

        jLabel1.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel1, gridBagConstraints);

        txtBuscar.setMinimumSize(new java.awt.Dimension(70, 22));
        txtBuscar.setName("Buscar"); // NOI18N
        txtBuscar.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(txtBuscar, gridBagConstraints);

        jLabel2.setText("Remplazar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jLabel2, gridBagConstraints);

        txtRemplazar.setMinimumSize(new java.awt.Dimension(70, 22));
        txtRemplazar.setName("Remplazar"); // NOI18N
        txtRemplazar.setPreferredSize(new java.awt.Dimension(70, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(txtRemplazar, gridBagConstraints);

        pnlNodos.setBackground(new java.awt.Color(255, 255, 255));
        pnlNodos.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(pnlNodos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (txtAgregar.getText().equals("")) {
                throw new Exception("Rellena el campo");
            }
            ldc.agregar(Float.parseFloat(txtAgregar.getText()));
            txtAgregar.setText("");
        } catch (Exception e) {
            if (e instanceof NumberFormatException)
            {
                showMessageDialog(this, "Inserta un flotante válido");
                return;
            }
            showMessageDialog(this, e.getMessage());
        }
        actualizarLista();
        super.repaint();
        validate();
    }// GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBorrarActionPerformed
        try {
            if (txtDel.getText().equals("")) {
                throw new Exception("Rellena el campo");
            }
            if (!ldc.borrar(Float.parseFloat(txtDel.getText()))){
                throw new Exception("No se encontró el nodo");
            }    
            actualizarLista();
            super.repaint();
            validate();
        } catch (Exception e) {
            if (e instanceof NumberFormatException) {
                showMessageDialog(this, "Inserta un flotante válido");
                return;
            }
            showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditarActionPerformed
        try {
            javax.swing.JTextField x[] = { txtBuscar, txtRemplazar };
            for (javax.swing.JTextField txt : x) {
                if (txt.getText().equals("")) {
                    throw new Exception("Rellena el campo " + txt.getName());
                }
            }
            if (!ldc.editar(Float.parseFloat(txtBuscar.getText()),Float.parseFloat(txtRemplazar.getText()))) {
                throw new Exception("No se encontró el nodo");
            }
            showMessageDialog(this, "Editado correctamente");
            for (javax.swing.JTextField txt : x)
                txt.setText("");
        } catch (Exception e) {
            if (e instanceof NumberFormatException){
                showMessageDialog(this, "Inserta un flotante válido");
                return;
            }
            showMessageDialog(this, e.getMessage());
        }
        actualizarLista();
        validate();
    }// GEN-LAST:event_btnEditarActionPerformed

    public void actualizarLista() {
        for (Component x : pnlNodos.getComponents())
            pnlNodos.remove(x);
        if(ldc.getInicio()!=null)
        for (NodoCircular n = ldc.getInicio(); ; n = n.getSig()) {
            pnlNodos.add(n.getComponent());
            if (n == ldc.getFin())
                return;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaListaSimple.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListaSimple.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListaSimple.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListaSimple.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListaCircular().setVisible(true);
            }
        });
    }

    private ListaDobleCircular ldc;
    private static VentanaListaCircular instance;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlNodos;
    private javax.swing.JTextField txtAgregar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDel;
    private javax.swing.JTextField txtRemplazar;
    // End of variables declaration//GEN-END:variables
}
