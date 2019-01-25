package vista;

import t8p1e2.T8p1e2;
import Excepciones.*;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;


public class VentanaAltaPersona extends javax.swing.JFrame {

    /** Creates new form VentanaAltaPersona */
    public VentanaAltaPersona() {
        initComponents();
        // Centrar la ventana
        setLocationRelativeTo(null);
        // Ocultar etiqueta
        lErrorApellidos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        lErrorApellidos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCurso = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Dni");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ALTA DE PERSONAS");

        lErrorApellidos.setForeground(new java.awt.Color(255, 0, 51));
        lErrorApellidos.setText("** Este dato es obligatorio **");

        jLabel5.setText("Curso");

        tfCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(bAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfApellidos)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(tfDni)
                                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addComponent(lErrorApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lErrorApellidos))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bSalir))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
    // Caja en la que colocar el cursor
    JTextField problema = null;
    try{
         // Validaciones que puede hacer la ventana
         // Validar el nombre
         if (tfNombre.getText().isEmpty())
         {
             tfNombre.setBackground(Color.red);
             problema = tfNombre;
             throw new DatoObligatorio(1);
         }
         else
             if (tfNombre.getBackground()== Color.red)
                  tfNombre.setBackground(Color.white);
         
         // Si no está vacío compruebo que tiene un formato adecuado.
         Pattern patron = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)*$");
         Matcher m = patron.matcher(tfNombre.getText());
         if (!m.matches()){
             problema = tfNombre;
             throw new DatoNoValido(1);
         }
         
         // Validar apellidos
         if (tfApellidos.getText().isEmpty())
         {
             lErrorApellidos.setVisible(true);
             problema = tfApellidos;
             throw new DatoObligatorio(2);
         }
         else
             // Por si acaso
             lErrorApellidos.setVisible(false);
         
         // Si no está vacío compruebo que tiene un formato adecuado.
         patron = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)+$");
         m = patron.matcher(tfApellidos.getText());
         if (!m.matches()){
             problema = tfApellidos;
             throw new DatoNoValido(2);
         }
         
         // Validamos el dni
         if (tfDni.getText().isEmpty())
         {
             problema = tfDni;
             throw new DatoObligatorio(3);
         }
         if (validarFormatoDni()== false)
         {
             tfDni.selectAll();
             problema = tfDni;
             throw new DatoNoValido(3);
         }
          
          // Validar con "base de datos"
         if (T8p1e2.validarDni(tfDni.getText())== false){
             problema = tfDni;
             throw new DatoNoValido(4);
         }
         
         // = tenDatos
         boolean alta = T8p1e2.altaPersona(tfNombre.getText(),tfApellidos.getText(),tfDni.getText());
         if (alta)
         {
             JOptionPane.showMessageDialog(this,"Persona dada de alta");
             limpiarVentana();
         }
         else
             throw new Exception();
         
     }
     catch(DatoObligatorio e)
     {
         JOptionPane.showMessageDialog(this,e.getMessage());
         problema.requestFocus();
     }
     catch(DatoNoValido e)
     {
         JOptionPane.showMessageDialog(this,e.getMessage());
         problema.requestFocus();
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(this,"Problemas \n" + e.getMessage());
     }
}//GEN-LAST:event_bAceptarActionPerformed

public boolean validarFormatoDni(){
   // Falta lo de %23
   String dniRegexp = "^[0-9]{8}[A-HJ-NP-TV-Z]$";
   return Pattern.matches(dniRegexp, tfDni.getText());
   if(tfDni.equals(this))
}

public void limpiarVentana(){
    tfNombre.setText("");
    tfApellidos.setText("");
    tfDni.setText(null);
    // Orden para colocar el cursor
    tfNombre.requestFocus();
}

private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
      T8p1e2.salir();
}//GEN-LAST:event_bSalirActionPerformed

    private void tfCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCursoActionPerformed
        if
    }//GEN-LAST:event_tfCursoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaAltaPersona().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lErrorApellidos;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCurso;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
