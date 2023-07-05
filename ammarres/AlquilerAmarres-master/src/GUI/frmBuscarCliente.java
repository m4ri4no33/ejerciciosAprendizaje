/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Main.ManejoPuertoBarquero;
import Clases.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class frmBuscarCliente extends javax.swing.JInternalFrame {

    ManejoPuertoBarquero manejoPuerto;
    
    public frmBuscarCliente(Object manejoPuerto) {
        initComponents();
        this.manejoPuerto = (ManejoPuertoBarquero)manejoPuerto;
        this.boxInformacion.setVisible(false);
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        if(this.manejoPuerto.listaClientes()==null){
            JOptionPane.showMessageDialog(rootPane, "No existen clientes registrados todavia");
            this.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        identificacionCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        boxInformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombresCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidosCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonoCliente = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(221, 216, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANTENIMIENTO DE CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Numero de cedula o pasaporte:");

        identificacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionClienteActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(identificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        boxInformacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombres:");

        nombresCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Telefono:");

        javax.swing.GroupLayout boxInformacionLayout = new javax.swing.GroupLayout(boxInformacion);
        boxInformacion.setLayout(boxInformacionLayout);
        boxInformacionLayout.setHorizontalGroup(
            boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombresCliente))
                    .addGroup(boxInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidosCliente))
                    .addGroup(boxInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoCliente)))
                .addContainerGap())
        );
        boxInformacionLayout.setVerticalGroup(
            boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(221, 216, 255));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    }//GEN-LAST:event_formInternalFrameOpened

    private void nombresClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresClienteActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(this.nombresCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese los nombres del cliente", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(this.apellidosCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese los apellidos del cliente", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(this.telefonoCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el telefono del cliente", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!manejoPuerto.existeCliente(this.identificacionCliente.getText())){
            JOptionPane.showMessageDialog(null, "Lo sentimos, ese cliente no existe", "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        manejoPuerto.modificarCliente(new Cliente(this.identificacionCliente.getText(), this.nombresCliente.getText(), this.apellidosCliente.getText(), this.telefonoCliente.getText()));
        JOptionPane.showMessageDialog(null, "El cliente se ha modificado satisfactoriamente");
        this.dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(manejoPuerto.listaClientes()!=null)
        {
            String[] lista = manejoPuerto.listaClientes().split("-");
            String[] cliente;
            for(int i = 0; i < lista.length; i++){
                cliente = lista[i].split(",");
                if(cliente[0].equals(this.identificacionCliente.getText())){
                    this.nombresCliente.setText(cliente[1]);
                    this.apellidosCliente.setText(cliente[2]);
                    this.telefonoCliente.setText(cliente[3]);
                    this.boxInformacion.setVisible(true);
                    this.identificacionCliente.setEditable(false);
                    this.btnBuscar.setEnabled(false);
                    this.btnModificar.setEnabled(true);
                    this.btnEliminar.setEnabled(true);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Lo sentimos, el cliente especificado no existe", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void identificacionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionClienteActionPerformed
        if(manejoPuerto.listaClientes()!=null)
        {
            String[] lista = manejoPuerto.listaClientes().split("-");
            String[] cliente;
            for(int i = 0; i < lista.length; i++){
                cliente = lista[i].split(",");
                if(cliente[0].equals(this.identificacionCliente.getText())){
                    this.nombresCliente.setText(cliente[1]);
                    this.apellidosCliente.setText(cliente[2]);
                    this.telefonoCliente.setText(cliente[3]);
                    this.boxInformacion.setVisible(true);
                    this.identificacionCliente.setEditable(false);
                    this.btnBuscar.setEnabled(false);
                    this.btnModificar.setEnabled(true);
                    this.btnEliminar.setEnabled(true);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Lo sentimos, el cliente especificado no existe", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_identificacionClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!manejoPuerto.existeCliente(this.identificacionCliente.getText())){
            JOptionPane.showMessageDialog(null, "Lo sentimos, ese cliente no existe", "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("Paso por aqui"); 
       if(manejoPuerto.eliminarCliente(this.identificacionCliente.getText()))
            JOptionPane.showMessageDialog(null, "El cliente se ha eliminado satisfactoriamente");
        else
            JOptionPane.showMessageDialog(null, "Lo sentimos, cliente se encuentra asociado a un alquiler y no se puede eliminar");
        this.dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosCliente;
    private javax.swing.JPanel boxInformacion;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JButton btnRegistrar3;
    private javax.swing.JButton btnRegistrar4;
    private javax.swing.JButton btnRegistrar5;
    private javax.swing.JTextField identificacionCliente;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nombresCliente;
    private javax.swing.JTextField telefonoCliente;
    // End of variables declaration//GEN-END:variables
}
