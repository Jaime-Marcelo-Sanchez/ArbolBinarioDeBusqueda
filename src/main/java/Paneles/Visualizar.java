package Paneles;

import Principal.Arbol;
import Principal.Nodo;
import static Principal.Nodo.*;

import javax.swing.DefaultComboBoxModel;

public class Visualizar extends javax.swing.JFrame {

    /**
     * Creates new form Visualizar
     */
    Arbol accion = new Arbol();
    String options[] = {"Insertar", "Eliminar", "Buscar"};

    public Visualizar() {
        initComponents();
        this.setLocationRelativeTo(null);
        AreaGrafica.setEditable(false);
        AreaResultado.setEditable(false);

        DefaultComboBoxModel comboModel = new DefaultComboBoxModel<>(options);
        jComboBox1.setModel(comboModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonInsertar = new javax.swing.JButton();
        TxtData = new javax.swing.JTextField();
        botonInOrden = new javax.swing.JButton();
        botonPreOrden = new javax.swing.JButton();
        botonPostOrden = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaResultado = new javax.swing.JTextArea();
        botonMostrarArbol = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonVerLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaGrafica = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonInsertar.setText("ACEPTAR");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        TxtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDataActionPerformed(evt);
            }
        });

        botonInOrden.setText("InOrden");
        botonInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInOrdenActionPerformed(evt);
            }
        });

        botonPreOrden.setText("PreOrden");
        botonPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPreOrdenActionPerformed(evt);
            }
        });

        botonPostOrden.setText("PostOrden");
        botonPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPostOrdenActionPerformed(evt);
            }
        });

        AreaResultado.setColumns(20);
        AreaResultado.setRows(5);
        jScrollPane2.setViewportView(AreaResultado);

        botonMostrarArbol.setText("VER ARBOL");
        botonMostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarArbolActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        botonVerLista.setText("VER LISTA");
        botonVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonMostrarArbol)
                        .addGap(18, 18, 18)
                        .addComponent(botonVerLista, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                    .addComponent(TxtData))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonPostOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPreOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonInOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonInOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonPreOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonPostOrden)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonMostrarArbol)
                            .addComponent(botonVerLista))
                        .addGap(31, 31, 31))))
        );

        AreaGrafica.setColumns(20);
        AreaGrafica.setRows(5);
        jScrollPane1.setViewportView(AreaGrafica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPostOrdenActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == botonPostOrden) {
            AreaResultado.setText(null);
            AreaResultado.setText("RECORRIDO POSTORDEN" + "\n");
            AreaResultado.setText(AreaResultado.getText() + accion.RecoPostOrden());
        }

    }//GEN-LAST:event_botonPostOrdenActionPerformed

    private void botonPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreOrdenActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == botonPreOrden) {
            AreaResultado.setText(null);
            AreaResultado.setText("RECORRIDO PREORDEN" + "\n");
            AreaResultado.setText(AreaResultado.getText() + accion.RecoPreOrden());
        }
    }//GEN-LAST:event_botonPreOrdenActionPerformed

    private void botonInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInOrdenActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == botonInOrden) {
            AreaResultado.setText(null);
            AreaResultado.setText("RECORRIDO INORDEN" + "\n");
            AreaResultado.setText(AreaResultado.getText() + accion.RecoInOrden());
        }

    }//GEN-LAST:event_botonInOrdenActionPerformed

    private void TxtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDataActionPerformed
    double dato;
    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == botonInsertar) {

            switch (jComboBox1.getSelectedIndex()) {
                case 0: //INSERTAR
                    dato = Double.parseDouble(TxtData.getText());
                    TxtData.setText(null);
                    accion.Insercion(dato);
                    break;
                case 1: //ELIMINAR
                    dato = Double.parseDouble(TxtData.getText());
                    TxtData.setText(null);
                    accion.eliminar_total(dato,1,0);
                    break;
                case 2: //BUSCAR
                    double num = Double.parseDouble(TxtData.getText());
                    TxtData.setText(null);
                    accion.Busqueda(num);
                    
                    break;
            }
        }

    }//GEN-LAST:event_botonInsertarActionPerformed
    int cont = 0;
    private void botonMostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarArbolActionPerformed
        // TODO add your handling code here: 
        if (evt.getSource() == botonMostrarArbol) {
            AreaGrafica.setText("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
            this.mostrarArbol(accion.raizz, cont);
        }


    }//GEN-LAST:event_botonMostrarArbolActionPerformed

    private void botonVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerListaActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==botonVerLista){
            AreaGrafica.setText(null);
            for(int i=1; i<=accion.disp;i++){
                 AreaGrafica.setText(AreaGrafica.getText()+i+"\t"+Dato[i]+"\t"+Izq[i]+"\t"+Der[i]+"\n");
            }
            
            AreaGrafica.setText("ID"+"\t"+"DATO"+"\t"+"IZQUIERDA"+"\t"+"DERECHA"+"\n"
            +"========================================================"+"\n"+AreaGrafica.getText());            
        }
    }//GEN-LAST:event_botonVerListaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void mostrarArbol(int n, int contador) {
        if (n == 0) {
            return;
        } else {
            mostrarArbol(Der[n], contador + 1);
            for (int i = 0; i < contador; i++) {
                AreaGrafica.setText(AreaGrafica.getText() + "              ");

            }
            AreaGrafica.setText(AreaGrafica.getText() + Dato[n] + "\n" + "\n");

            mostrarArbol(Izq[n], contador + 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Visualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaGrafica;
    private javax.swing.JTextArea AreaResultado;
    private javax.swing.JTextField TxtData;
    private javax.swing.JButton botonInOrden;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonMostrarArbol;
    private javax.swing.JButton botonPostOrden;
    private javax.swing.JButton botonPreOrden;
    private javax.swing.JButton botonVerLista;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
