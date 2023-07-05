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
import Clases.Fecha;
import Clases.Alquiler;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Daniel
 */
public class frmAlquilarAmarres extends javax.swing.JInternalFrame {

    private final ManejoPuertoBarquero manejoPuerto;
    private final frmAplicacionPrincipal aplicacion;
    private JXDatePicker fechaInicial;
    private JXDatePicker fechaFinal;
    private boolean alquiler = false;
    private int montoEspecial = 0;
    private int total = 0;
    
    
    public frmAlquilarAmarres(Object manejoPuerto, frmAplicacionPrincipal aplicacion) {
        initComponents();
        this.boxBarco.setVisible(false);
        this.boxCliente.setVisible(false);
        this.boxMontos.setVisible(false);
        this.manejoPuerto = (ManejoPuertoBarquero)manejoPuerto;
        this.aplicacion = aplicacion;
        this.tipoBarco.setEnabled(false);
        fechaInicial = new JXDatePicker();
        fechaInicial.setDate(Calendar.getInstance().getTime());
        fechaInicial.setFormats(new SimpleDateFormat("dd,MM,yyyy"));
        this.boxFechaInicial.setViewportView(fechaInicial);
        
        fechaFinal = new JXDatePicker();
        fechaFinal.setDate(Calendar.getInstance().getTime());
        fechaFinal.setFormats(new SimpleDateFormat("dd,MM,yyyy"));
        this.boxFechaFinal.setViewportView(fechaFinal);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        boxVelero = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedulaCliente = new javax.swing.JTextField();
        boxCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nombresCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        apellidosCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telefonoCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        boxVelero1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        boxFechaInicial = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        boxFechaFinal = new javax.swing.JScrollPane();
        boxVelero2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        matriculaBarco = new javax.swing.JTextField();
        boxBarco = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        tipoBarco = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        valorEslora = new javax.swing.JTextField();
        lblAtributoBarco = new javax.swing.JLabel();
        atributoBarco = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        posicionAmarre = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        montoTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxMontos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCostos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        numeroDias = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alquilar amarre");
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
        jLabel6.setText("ALQUILAR AMARRE");

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

        jPanel2.setBackground(new java.awt.Color(221, 216, 255));

        btnRegistrar.setText("Alquilar");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        boxVelero.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("DATOS DEL CLIENTE");

        jLabel5.setText("Cedula o pasaporte");

        cedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteActionPerformed(evt);
            }
        });
        cedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaClienteKeyPressed(evt);
            }
        });

        jLabel8.setText("Nombres");

        jLabel9.setText("Apellidos");

        jLabel10.setText("Telefono");

        javax.swing.GroupLayout boxClienteLayout = new javax.swing.GroupLayout(boxCliente);
        boxCliente.setLayout(boxClienteLayout);
        boxClienteLayout.setHorizontalGroup(
            boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombresCliente))
                    .addGroup(boxClienteLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidosCliente))
                    .addGroup(boxClienteLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoCliente)))
                .addContainerGap())
        );
        boxClienteLayout.setVerticalGroup(
            boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(apellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("Presione enter despues de ingresar la identificacion");

        javax.swing.GroupLayout boxVeleroLayout = new javax.swing.GroupLayout(boxVelero);
        boxVelero.setLayout(boxVeleroLayout);
        boxVeleroLayout.setHorizontalGroup(
            boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVeleroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxVeleroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel16))
                    .addGroup(boxVeleroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedulaCliente))
                    .addComponent(boxCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        boxVeleroLayout.setVerticalGroup(
            boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVeleroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxVeleroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxVelero1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("FECHAS DEL ALQUILER");

        jLabel18.setText("Fecha inicial");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxFechaInicial)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setText("Fecha final");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxFechaFinal)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout boxVelero1Layout = new javax.swing.GroupLayout(boxVelero1);
        boxVelero1.setLayout(boxVelero1Layout);
        boxVelero1Layout.setHorizontalGroup(
            boxVelero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVelero1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxVelero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(boxVelero1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        boxVelero1Layout.setVerticalGroup(
            boxVelero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVelero1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxVelero2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Datos del barco");

        jLabel22.setText("Matricula del barco");

        matriculaBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaBarcoActionPerformed(evt);
            }
        });
        matriculaBarco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matriculaBarcoKeyPressed(evt);
            }
        });

        jLabel23.setText("Tipo de barco");

        jLabel24.setText("Valor de Eslora");

        lblAtributoBarco.setText("Atributo");

        javax.swing.GroupLayout boxBarcoLayout = new javax.swing.GroupLayout(boxBarco);
        boxBarco.setLayout(boxBarcoLayout);
        boxBarcoLayout.setHorizontalGroup(
            boxBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxBarcoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAtributoBarco)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoBarco)
                    .addComponent(valorEslora)
                    .addComponent(atributoBarco))
                .addContainerGap())
        );
        boxBarcoLayout.setVerticalGroup(
            boxBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxBarcoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tipoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(valorEslora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxBarcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtributoBarco)
                    .addComponent(atributoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel26.setText("Presione enter despues de ingresar la matricula");

        jLabel12.setText("Posicion de Amarre:");

        javax.swing.GroupLayout boxVelero2Layout = new javax.swing.GroupLayout(boxVelero2);
        boxVelero2.setLayout(boxVelero2Layout);
        boxVelero2Layout.setHorizontalGroup(
            boxVelero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVelero2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxVelero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxVelero2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jLabel26))
                    .addComponent(boxBarco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(boxVelero2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(boxVelero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boxVelero2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matriculaBarco))
                            .addGroup(boxVelero2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicionAmarre)))))
                .addContainerGap())
        );
        boxVelero2Layout.setVerticalGroup(
            boxVelero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxVelero2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxVelero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxVelero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(matriculaBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(boxBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxVelero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(posicionAmarre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("COSTOS DE ALQUILER Y MONTO TOTAL");

        montoTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        montoTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        montoTotal.setText("000.00");

        jLabel3.setText("TOTAL");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(montoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(montoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaCostos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaCostos);

        jLabel2.setText("Numero de dias: ");

        javax.swing.GroupLayout boxMontosLayout = new javax.swing.GroupLayout(boxMontos);
        boxMontos.setLayout(boxMontosLayout);
        boxMontosLayout.setHorizontalGroup(
            boxMontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxMontosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxMontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxMontosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroDias))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        boxMontosLayout.setVerticalGroup(
            boxMontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxMontosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boxMontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numeroDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxMontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxVelero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxVelero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxVelero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxVelero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxVelero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxVelero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
//        txtTtitulo.requestFocusInWindow();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cargarDatos(){
        
        //Datos del cliente
        if(manejoPuerto.listaClientes()!=null)
        {
            String[] lista = manejoPuerto.listaClientes().split("-");
            String[] cliente;
            for(int i = 0; i < lista.length; i++){
                cliente = lista[i].split(",");
                if(cliente[0].equals(this.cedulaCliente.getText())){
                    this.nombresCliente.setText(cliente[1]);
                    this.apellidosCliente.setText(cliente[2]);
                    this.telefonoCliente.setText(cliente[3]);
                    this.boxCliente.setVisible(true);
                    break;
                }
            }
        }
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
                    this.lblAtributoBarco.setText("Mastiles: ");
                    this.atributoBarco.setText(barco[3]);
                    this.boxBarco.setVisible(true);
                    this.montoEspecial = Integer.parseInt(barco[3]);
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
                    this.lblAtributoBarco.setText("Potencia: ");
                    this.atributoBarco.setText(barco[3]);
                    this.boxBarco.setVisible(true);
                    this.montoEspecial = Integer.parseInt(barco[3]);
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
                    this.lblAtributoBarco.setText("Potencia CV: ");
                    this.atributoBarco.setText(barco[3]);
                    this.boxBarco.setVisible(true);
                    this.montoEspecial = Integer.parseInt(barco[4]) + Integer.parseInt(barco[3]);
                    break;
                }
            }
        }
        
        //Montos totales del alquiler
        if(this.alquiler)
        {
            String titulos[] = {"Descripcion","Monto"};

            DefaultTableModel tabla = new DefaultTableModel(null, titulos){
                @Override
                public boolean isCellEditable(int row, int col){return false;}
            };

            try {
                
                Date fech1 = this.fechaInicial.getDate();
                Date fech2 = this.fechaFinal.getDate();
                
                final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
                Calendar antes = new GregorianCalendar(fechaInicial.getDate().getYear(), fechaInicial.getDate().getMonth(), fechaInicial.getDate().getDay()); 
                Calendar despues = new GregorianCalendar(fechaFinal.getDate().getYear(), fechaFinal.getDate().getMonth(), fechaFinal.getDate().getDay());
                long diferencia = ( despues.getTimeInMillis() - antes.getTimeInMillis() )/MILLSECS_PER_DAY; 
                if(diferencia==0)
                    diferencia=1;
                else diferencia++;
                
                int costo1 = 0;
                this.numeroDias.setText(diferencia + " dias");
                if(diferencia>0) {
                    costo1 = (int) (Integer.parseInt(this.valorEslora.getText())*1200*10*diferencia);}
                int costo2 = this.montoEspecial;
                total = costo1 + costo2;
                
                if(diferencia>0) this.montoTotal.setText("$" + total+".00");
                else this.montoTotal.setText("$" + "0.00");
                
                Object[] reg1 = {"Concepto por eslora", " $" + costo1};
                tabla.addRow(reg1);
                Object[] reg2 = {"Modulos especiales", " $" +  costo2};
                tabla.addRow(reg2);
                
            } catch (Exception ex) {}
            tablaCostos.setModel(tabla);
            this.boxMontos.setVisible(true);
        }
            
    }
    
    private void cedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaClienteActionPerformed
        if(!this.manejoPuerto.existeCliente(this.cedulaCliente.getText())){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            if (JOptionPane.showConfirmDialog(null, "Ese cliente no existe, desea registrarlo?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                frmAgregarCliente frm = new frmAgregarCliente(manejoPuerto);
                frm.txtCedula.setText(this.cedulaCliente.getText());
                this.aplicacion.dpnEscritorio.add(frm);
                frm.show();
            }
        }
        else
            this.cargarDatos();
        
        
    }//GEN-LAST:event_cedulaClienteActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.cedulaCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese los nombres del cliente", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.matriculaBarco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese la matricula del barco", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.posicionAmarre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese la posicion de amarre", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(manejoPuerto.getCliente(this.cedulaCliente.getText())==null){
            JOptionPane.showMessageDialog(null, "Lo sentimos, el cliente especificado no existe", "Dato erroneo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(manejoPuerto.getBarco(this.matriculaBarco.getText())==null){
            JOptionPane.showMessageDialog(null, "Lo sentimos, el barco especificado no existe", "Dato erroneo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
        Calendar antes = new GregorianCalendar(fechaInicial.getDate().getYear(), fechaInicial.getDate().getMonth(), fechaInicial.getDate().getDay()); 
        Calendar despues = new GregorianCalendar(fechaFinal.getDate().getYear(), fechaFinal.getDate().getMonth(), fechaFinal.getDate().getDay());
        long diferencia = ( despues.getTimeInMillis() - antes.getTimeInMillis() )/MILLSECS_PER_DAY; 
        
        if(diferencia<0){
            JOptionPane.showMessageDialog(null, "Lo sentimos, la fecha final no puede ser anterior a la inicial", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(diferencia==0)
            diferencia = 1;
        else diferencia++;
        
        Alquiler alquiler = new Alquiler(manejoPuerto.getCliente(this.cedulaCliente.getText()),(int)diferencia, this.posicionAmarre.getText(), manejoPuerto.getBarco(this.matriculaBarco.getText()), total);
        manejoPuerto.AgregarAlquiler(alquiler);
        this.dispose();
        
        frmReciboAlquiler frm = new frmReciboAlquiler();
        this.aplicacion.dpnEscritorio.add(frm);
        frm.diasAlquiler.setText(diferencia + " dias");
        frm.identificacionCliente.setText(this.cedulaCliente.getText());
        frm.nombresCliente.setText(this.nombresCliente.getText());
        frm.matriculaBarco.setText(this.matriculaBarco.getText());
        frm.tipoBarco.setText(this.tipoBarco.getText());
        frm.montoTotal.setText(this.montoTotal.getText());
        frm.posicionAmarre.setText(this.posicionAmarre.getText());
        frm.show();
        
            
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void matriculaBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaBarcoActionPerformed
        if(!this.manejoPuerto.existeBarco(this.matriculaBarco.getText())){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            if (JOptionPane.showConfirmDialog(null, "Ese barco no existe, desea registrarlo?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                frmAgregarBarco frm = new frmAgregarBarco(manejoPuerto);
                frm.txtMatricula.setText(this.matriculaBarco.getText());
                this.aplicacion.dpnEscritorio.add(frm);
                frm.show();
            }
            this.boxMontos.setVisible(false);
            this.boxBarco.setVisible(false);
        }
        else{
            this.alquiler = true;
            this.cargarDatos();
        }
            
    }//GEN-LAST:event_matriculaBarcoActionPerformed

    private void cedulaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaClienteKeyPressed
        this.boxCliente.setVisible(false);
    }//GEN-LAST:event_cedulaClienteKeyPressed

    private void matriculaBarcoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculaBarcoKeyPressed
        this.boxMontos.setVisible(false);
        this.boxBarco.setVisible(false);
        this.alquiler = false;
    }//GEN-LAST:event_matriculaBarcoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosCliente;
    private javax.swing.JTextField atributoBarco;
    private javax.swing.JPanel boxBarco;
    private javax.swing.JPanel boxCliente;
    private javax.swing.JScrollPane boxFechaFinal;
    private javax.swing.JScrollPane boxFechaInicial;
    private javax.swing.JPanel boxMontos;
    public javax.swing.JPanel boxVelero;
    public javax.swing.JPanel boxVelero1;
    public javax.swing.JPanel boxVelero2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cedulaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAtributoBarco;
    private javax.swing.JTextField matriculaBarco;
    private javax.swing.JLabel montoTotal;
    private javax.swing.JTextField nombresCliente;
    private javax.swing.JTextField numeroDias;
    private javax.swing.JTextField posicionAmarre;
    private javax.swing.JTable tablaCostos;
    private javax.swing.JTextField telefonoCliente;
    private javax.swing.JTextField tipoBarco;
    private javax.swing.JTextField valorEslora;
    // End of variables declaration//GEN-END:variables
}
