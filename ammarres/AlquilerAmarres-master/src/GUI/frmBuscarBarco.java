/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Main.ManejoPuertoBarquero;
import Clases.Cliente;
import Clases.Barco;
import Clases.Veleros;
import Clases.DeportivosMotor;
import Clases.Yates;
import Clases.Fecha;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Daniel
 */
public class frmBuscarBarco extends javax.swing.JInternalFrame {

    ManejoPuertoBarquero manejoPuerto;
    private JXDatePicker fecha;
    
    public frmBuscarBarco(Object manejoPuerto) {
        initComponents();
        this.manejoPuerto = (ManejoPuertoBarquero)manejoPuerto;
        this.boxInformacion.setVisible(false);
        this.boxInformacion2.setVisible(false);
        this.atributoCamarotes.setVisible(false);
        this.txtNroCamarotes.setVisible(false);
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        if(this.manejoPuerto.listarBarcosVeleros()==null&&this.manejoPuerto.listarBarcosDeportivos()==null&&this.manejoPuerto.listarBarcosYates()==null){
            JOptionPane.showMessageDialog(rootPane, "No existen barcos registrados todavia");
            this.dispose();
        }
        
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        matriculaBarco = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        boxInformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        valorEslora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxFecha = new javax.swing.JScrollPane();
        tipoBarco = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        boxInformacion2 = new javax.swing.JPanel();
        atributoCamarotes = new javax.swing.JLabel();
        lblAtributoBarco = new javax.swing.JLabel();
        atributoBarco = new javax.swing.JTextField();
        txtNroCamarotes = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar barco");
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
        jLabel6.setText("MANTENIMIENTO DE BARCOS");

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Numero de matricula del barco");

        matriculaBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaBarcoActionPerformed(evt);
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
                        .addComponent(matriculaBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
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
                    .addComponent(matriculaBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        boxInformacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Eslora");

        jLabel3.setText("Tipo de barco");

        jLabel7.setText("Año de Fabricacion");

        tipoBarco.setEnabled(false);

        javax.swing.GroupLayout boxInformacionLayout = new javax.swing.GroupLayout(boxInformacion);
        boxInformacion.setLayout(boxInformacionLayout);
        boxInformacionLayout.setHorizontalGroup(
            boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxInformacionLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(tipoBarco)
                .addContainerGap())
            .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(boxInformacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, boxInformacionLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(valorEslora, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, boxInformacionLayout.createSequentialGroup()
                            .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(boxFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        boxInformacionLayout.setVerticalGroup(
            boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxInformacionLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(tipoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(boxInformacionLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(valorEslora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(12, Short.MAX_VALUE)))
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

        boxInformacion2.setBackground(new java.awt.Color(255, 255, 255));

        atributoCamarotes.setText("Numero de camarotes");

        lblAtributoBarco.setText("Caracteristica");

        atributoBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atributoBarcoActionPerformed(evt);
            }
        });

        txtNroCamarotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroCamarotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxInformacion2Layout = new javax.swing.GroupLayout(boxInformacion2);
        boxInformacion2.setLayout(boxInformacion2Layout);
        boxInformacion2Layout.setHorizontalGroup(
            boxInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxInformacion2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(boxInformacion2Layout.createSequentialGroup()
                        .addComponent(atributoCamarotes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNroCamarotes))
                    .addGroup(boxInformacion2Layout.createSequentialGroup()
                        .addComponent(lblAtributoBarco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atributoBarco)))
                .addContainerGap())
        );
        boxInformacion2Layout.setVerticalGroup(
            boxInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxInformacion2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtributoBarco)
                    .addComponent(atributoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxInformacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroCamarotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atributoCamarotes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxInformacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxInformacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if(!this.manejoPuerto.existeBarco(this.matriculaBarco.getText())){
            JOptionPane.showMessageDialog(null, "Lo sentimos, el barco especificado no existe", "Datos erroneos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(this.valorEslora.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el valor de la eslora", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha.getDate());
        
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH)+1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        
        if(this.tipoBarco.getText().equals("BARCO VELERO")){
            
            if(this.atributoBarco.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese el numero de mastiles", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            Barco barco = new Veleros(this.matriculaBarco.getText(), Integer.parseInt(this.valorEslora.getText()), new Fecha(dia,
                    mes,anio), Integer.parseInt(this.atributoBarco.getText()));
            
            manejoPuerto.modificaBarco(barco);
        }
        else if(this.tipoBarco.getText().equals("BARCO DEPORTIVO")){
            if(this.atributoBarco.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese la Potencia CV", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Barco barco = new DeportivosMotor(this.matriculaBarco.getText(), Integer.parseInt(this.valorEslora.getText()), new Fecha(dia,
                    mes,anio), Integer.parseInt(this.atributoBarco.getText()));
            manejoPuerto.modificaBarco(barco);
            
        }
        else if(this.tipoBarco.getText().equals("BARCO YATE")){
            if(this.atributoBarco.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese la Potencia CV", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(this.txtNroCamarotes.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese el numero de camarotes", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Barco barco = new Yates(this.matriculaBarco.getText(), Integer.parseInt(this.valorEslora.getText()),new Fecha(dia, 
                        mes,anio), Integer.parseInt(this.atributoBarco.getText()), Integer.parseInt(this.txtNroCamarotes.getText()));
            manejoPuerto.modificaBarco(barco);
        }
        
        JOptionPane.showMessageDialog(null, "El barco se ha modificado satisfactoriamente");
        this.dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.CargarDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void CargarDatos(){
        if(!this.manejoPuerto.existeBarco(this.matriculaBarco.getText())){
            JOptionPane.showMessageDialog(null, "Lo sentimos, el barco especificado no existe", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.txtNroCamarotes.setVisible(false);
        //Datos del barco velero
        if(manejoPuerto.listarBarcosVeleros()!=null)
        {
            String[] lista = manejoPuerto.listarBarcosVeleros().split("-");
            String[] barco;
            for(int i = 0; i < lista.length; i++){
                barco = lista[i].split(",");
                if(barco[0].equals(this.matriculaBarco.getText())){
                    this.tipoBarco.setText("BARCO VELERO");
                    this.valorEslora.setText(barco[1]);
                    
                    //Fecha
                    String[] fech = barco[2].split("/");
                    Date date = new Date(Integer.parseInt(fech[2]), Integer.parseInt(fech[1]),Integer.parseInt(fech[0]));
                    this.fecha.setDate(date);
                    
                    this.lblAtributoBarco.setText("Mastiles: ");
                    this.atributoBarco.setText(barco[3]);
                    this.atributoCamarotes.setVisible(true);
                    this.matriculaBarco.setEditable(false);
                    break;
                }
            }
        }
        
        //Datos del barco deportivo
        if(manejoPuerto.listarBarcosDeportivos()!=null){
            String[] lista = manejoPuerto.listarBarcosDeportivos().split("-");
            String[] barco;
            for(int i = 0; i < lista.length; i++){
                barco = lista[i].split(",");
                if(barco[0].equals(this.matriculaBarco.getText())){
                    this.tipoBarco.setText("BARCO DEPORTIVO");
                    this.valorEslora.setText(barco[1]);
                    
                    //Fecha
                    String[] fech = barco[2].split("/");
                    Date date = new Date(Integer.parseInt(fech[2]), Integer.parseInt(fech[1]),Integer.parseInt(fech[0]));
                    this.fecha.setDate(date);
                    
                    this.lblAtributoBarco.setText("Potencia CV: ");
                    this.atributoBarco.setText(barco[3]);
                    this.atributoCamarotes.setVisible(true);
                    this.matriculaBarco.setEditable(false);
                    break;
                }
            }
        }

        //Datos del barco yate
        if(manejoPuerto.listarBarcosYates()!=null)
        {
            String[] lista = manejoPuerto.listarBarcosYates().split("-");
            String[] barco;
            for(int i = 0; i < lista.length; i++){
                barco = lista[i].split(",");
                if(barco[0].equals(this.matriculaBarco.getText())){
                    this.tipoBarco.setText("BARCO YATE");
                    this.valorEslora.setText(barco[1]);
                    
                    //Fecha
                    String[] fech = barco[2].split("/");
                    Date date = new Date(Integer.parseInt(fech[2]), Integer.parseInt(fech[1]),Integer.parseInt(fech[0]));
                    this.fecha.setDate(date);
                    
                    this.lblAtributoBarco.setText("Potencia CV: ");
                    this.atributoBarco.setText(barco[3]);
                    this.atributoCamarotes.setVisible(true);
                    this.txtNroCamarotes.setVisible(true);
                    this.txtNroCamarotes.setText(barco[4]);
                    this.boxInformacion2.setVisible(true);
                    this.matriculaBarco.setEditable(false);
                    break;
                }
            }
        }
        
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.boxInformacion.setVisible(true);
        this.boxInformacion2.setVisible(true);
    }
    
    private void matriculaBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaBarcoActionPerformed
        this.CargarDatos();
    }//GEN-LAST:event_matriculaBarcoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!manejoPuerto.existeBarco(this.matriculaBarco.getText())){
            JOptionPane.showMessageDialog(null, "Lo sentimos, ese barco no existe", "Barco no encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("Paso por aqui"); 
       if(manejoPuerto.eliminarBarco(this.matriculaBarco.getText()))
            JOptionPane.showMessageDialog(null, "El barco se ha eliminado satisfactoriamente");
        else
            JOptionPane.showMessageDialog(null, "Lo sentimos, el barco se encuentra asociado a un alquiler y no se puede eliminar");
        this.dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void atributoBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atributoBarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atributoBarcoActionPerformed

    private void txtNroCamarotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroCamarotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroCamarotesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atributoBarco;
    private javax.swing.JLabel atributoCamarotes;
    private javax.swing.JScrollPane boxFecha;
    private javax.swing.JPanel boxInformacion;
    private javax.swing.JPanel boxInformacion2;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAtributoBarco;
    private javax.swing.JTextField matriculaBarco;
    private javax.swing.JTextField tipoBarco;
    private javax.swing.JTextField txtNroCamarotes;
    private javax.swing.JTextField valorEslora;
    // End of variables declaration//GEN-END:variables
}
