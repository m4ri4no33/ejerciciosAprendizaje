/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;
import Main.ManejoPuertoBarquero;
import Clases.Barco;
import Clases.Veleros;
import Clases.DeportivosMotor;
import Clases.Yates;
import Clases.Fecha;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 *
 * @author Daniel
 */
public class frmAgregarBarco extends javax.swing.JInternalFrame {

    private ManejoPuertoBarquero manejoPuerto;
    private JXDatePicker fecha;
    
    
    public frmAgregarBarco(Object manejoPuerto) {
        initComponents();
        this.boxDeportivo.setVisible(false);
        this.boxVelero.setVisible(false);
        this.boxYate.setVisible(false);
        this.manejoPuerto = (ManejoPuertoBarquero)manejoPuerto;
        
        fecha = new JXDatePicker();
        fecha.setDate(Calendar.getInstance().getTime());
        fecha.setFormats(new SimpleDateFormat("dd,MM,yyyy"));
        this.boxFecha.setViewportView(fecha);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEslora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        listBarco = new javax.swing.JComboBox<>();
        boxVelero = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMastilesVelero = new javax.swing.JTextField();
        boxDeportivo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPotenciaDeportivo = new javax.swing.JTextField();
        boxYate = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPotenciaYate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNroCamarotes = new javax.swing.JTextField();
        boxFecha = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar un nuevo barco");
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
        jLabel6.setText("REGISTRAR BARCO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jLabel1.setText("Matricula");

        jLabel2.setText("Eslora");

        jLabel3.setText("Tipo de barco");

        jPanel2.setBackground(new java.awt.Color(221, 216, 255));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listBarco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barco Velero", "Barco Deportivo a motor", "Barco Yate" }));
        listBarco.setSelectedIndex(-1);
        listBarco.setSelectedItem(null);
        listBarco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBarcoMouseClicked(evt);
            }
        });
        listBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBarcoActionPerformed(evt);
            }
        });

        boxVelero.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Informacion del barco velero");

        jLabel5.setText("Numero de mastiles: ");

        txtMastilesVelero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMastilesVeleroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxVeleroLayout = new javax.swing.GroupLayout(boxVelero);
        boxVelero.setLayout(boxVeleroLayout);
        boxVeleroLayout.setHorizontalGroup(
            boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVeleroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxVeleroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMastilesVelero))
                    .addGroup(boxVeleroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        boxVeleroLayout.setVerticalGroup(
            boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVeleroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMastilesVelero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxDeportivo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Informacion del barco deportivo a motor");

        jLabel12.setText("Potencia CV");

        txtPotenciaDeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaDeportivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxDeportivoLayout = new javax.swing.GroupLayout(boxDeportivo);
        boxDeportivo.setLayout(boxDeportivoLayout);
        boxDeportivoLayout.setHorizontalGroup(
            boxDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxDeportivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxDeportivoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPotenciaDeportivo))
                    .addGroup(boxDeportivoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        boxDeportivoLayout.setVerticalGroup(
            boxDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxDeportivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPotenciaDeportivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxYate.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Informacion del yate");

        jLabel14.setText("Potencia CV");

        txtPotenciaYate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaYateActionPerformed(evt);
            }
        });

        jLabel15.setText("Numero de camarotes");

        txtNroCamarotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroCamarotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxYateLayout = new javax.swing.GroupLayout(boxYate);
        boxYate.setLayout(boxYateLayout);
        boxYateLayout.setHorizontalGroup(
            boxYateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxYateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxYateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxYateLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(boxYateLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(boxYateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boxYateLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNroCamarotes))
                            .addGroup(boxYateLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPotenciaYate)))))
                .addContainerGap())
        );
        boxYateLayout.setVerticalGroup(
            boxYateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxYateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxYateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPotenciaYate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxYateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNroCamarotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel7.setText("Año de Fabricacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boxVelero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEslora))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMatricula))
                            .addComponent(boxDeportivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxYate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(listBarco, javax.swing.GroupLayout.Alignment.TRAILING, 0, 318, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEslora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(listBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVelero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDeportivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxYate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
//        txtTtitulo.requestFocusInWindow();
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtMastilesVeleroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMastilesVeleroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMastilesVeleroActionPerformed

    private void txtPotenciaDeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaDeportivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaDeportivoActionPerformed

    private void txtPotenciaYateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaYateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaYateActionPerformed

    private void txtNroCamarotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroCamarotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroCamarotesActionPerformed

    private void listBarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBarcoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listBarcoMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.txtMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese la matricula del barco", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.txtEslora.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese la eslora del barco", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(manejoPuerto.existeBarco(this.txtMatricula.getText())){
            JOptionPane.showMessageDialog(null, "Lo sentimos, ese barco ya se encuentra registrado","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(fecha.getDate()==null){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el año de fabricacion", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha.getDate());
        
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH)+1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        
        switch (this.listBarco.getSelectedIndex()) {
            case 0: //Velero
                if(this.txtMastilesVelero.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Por favor ingrese el numero de mastiles del velero", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                else{
                    Barco barco = new Veleros(this.txtMatricula.getText(), Integer.parseInt(this.txtEslora.getText()), new Fecha(dia,
                    mes,anio), Integer.parseInt(this.txtMastilesVelero.getText()));
                    
                    this.manejoPuerto.AgregarBarco(barco);
                    
                    JOptionPane.showMessageDialog(null, "El Velero se ha registrado satisfactoriamte");
                    
                }
                break;
            case 1: //Deportivo a motor
                if(this.txtPotenciaDeportivo.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Por favor ingrese la potencia del barco deportivo", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                else{
                    Barco barco = new DeportivosMotor(this.txtMatricula.getText(), Integer.parseInt(this.txtEslora.getText()), new Fecha(dia,
                    mes,anio), Integer.parseInt(this.txtPotenciaDeportivo.getText()));
                    
                    this.manejoPuerto.AgregarBarco(barco);
                    
                    JOptionPane.showMessageDialog(null, "El Barco deportivo se ha registrado satisfactoriamte");
                    
                }
                break;
            case 2: //Yate
                if(this.txtPotenciaYate.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Por favor ingrese la potencia del yate", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                else if (this.txtNroCamarotes.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Por favor el numero de camarotes", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                else{
                    Barco barco = new Yates(this.txtMatricula.getText(), Integer.parseInt(this.txtEslora.getText()),new Fecha(dia,
                    mes,anio), Integer.parseInt(this.txtPotenciaYate.getText()), Integer.parseInt(this.txtNroCamarotes.getText()));
                    
                    this.manejoPuerto.AgregarBarco(barco);
                    JOptionPane.showMessageDialog(null, "El Yate se ha registrado satisfactoriamte");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor seleccione el tipo de barco", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
        }
        
        this.dispose();
        
            
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void listBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBarcoActionPerformed
        
        this.boxVelero.setVisible(false);
        this.boxDeportivo.setVisible(false);
        this.boxYate.setVisible(false);
        
        switch (this.listBarco.getSelectedIndex()) {
            case 0:
                this.boxVelero.setVisible(true);
                break;
            case 1:
                this.boxDeportivo.setVisible(true);
                break;
            case 2:
                this.boxYate.setVisible(true);
                break;
            default:
                break;
        }
            
    }//GEN-LAST:event_listBarcoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel boxDeportivo;
    private javax.swing.JScrollPane boxFecha;
    public javax.swing.JPanel boxVelero;
    public javax.swing.JPanel boxYate;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listBarco;
    private javax.swing.JTextField txtEslora;
    private javax.swing.JTextField txtMastilesVelero;
    public javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNroCamarotes;
    private javax.swing.JTextField txtPotenciaDeportivo;
    private javax.swing.JTextField txtPotenciaYate;
    // End of variables declaration//GEN-END:variables
}
