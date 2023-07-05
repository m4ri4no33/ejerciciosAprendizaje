package GUI;

import javax.swing.JOptionPane;
import Main.ManejoPuertoBarquero;
import Main.Serializacion;
/**
 *
 * @author Daniel
 */
public class frmAplicacionPrincipal extends javax.swing.JFrame {
    
    public ManejoPuertoBarquero manejoPuerto;
    
    public frmAplicacionPrincipal() {
        initComponents();
        cargarImagen();
        this.manejoPuerto = new Serializacion().cargarArchivo();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuAgregarCliente = new javax.swing.JMenuItem();
        mnuAgregarBarco = new javax.swing.JMenuItem();
        mnuArchivo1 = new javax.swing.JMenu();
        mnuMantenimientoCliente = new javax.swing.JMenuItem();
        mnuMantenimientoBarco = new javax.swing.JMenuItem();
        mnuAlquileres = new javax.swing.JMenu();
        mnuAlquilarAmarre = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuReporteClientes = new javax.swing.JMenuItem();
        mnuReporteBarcos = new javax.swing.JMenuItem();
        mnuReporteAlquileres = new javax.swing.JMenuItem();
        mnuAyudas = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Alquiler de Amarres");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnEscritorio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnEscritorioLayout = new javax.swing.GroupLayout(dpnEscritorio);
        dpnEscritorio.setLayout(dpnEscritorioLayout);
        dpnEscritorioLayout.setHorizontalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
        );
        dpnEscritorioLayout.setVerticalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(217, 227, 242));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 255));

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/nuevo.png"))); // NOI18N
        mnuArchivo.setText("Crear");

        mnuAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/agregar.png"))); // NOI18N
        mnuAgregarCliente.setText("Agregar cliente");
        mnuAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarClienteActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuAgregarCliente);

        mnuAgregarBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/agregar.png"))); // NOI18N
        mnuAgregarBarco.setText("Agregar barco");
        mnuAgregarBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarBarcoActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuAgregarBarco);

        jMenuBar1.add(mnuArchivo);

        mnuArchivo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/buscar.png"))); // NOI18N
        mnuArchivo1.setText("Buscar");

        mnuMantenimientoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/buscarLista.png"))); // NOI18N
        mnuMantenimientoCliente.setText("Buscar cliente");
        mnuMantenimientoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMantenimientoClienteActionPerformed(evt);
            }
        });
        mnuArchivo1.add(mnuMantenimientoCliente);

        mnuMantenimientoBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/buscarLista.png"))); // NOI18N
        mnuMantenimientoBarco.setText("Buscar barco");
        mnuMantenimientoBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMantenimientoBarcoActionPerformed(evt);
            }
        });
        mnuArchivo1.add(mnuMantenimientoBarco);

        jMenuBar1.add(mnuArchivo1);

        mnuAlquileres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/alquiler.png"))); // NOI18N
        mnuAlquileres.setText("Alquileres");

        mnuAlquilarAmarre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/barco.png"))); // NOI18N
        mnuAlquilarAmarre.setText("Alquilar amarre");
        mnuAlquilarAmarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlquilarAmarreActionPerformed(evt);
            }
        });
        mnuAlquileres.add(mnuAlquilarAmarre);

        jMenuBar1.add(mnuAlquileres);

        mnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/reporte.png"))); // NOI18N
        mnuReportes.setText("Reportes");

        mnuReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/listado.png"))); // NOI18N
        mnuReporteClientes.setText("Listado de clientes");
        mnuReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteClientesActionPerformed(evt);
            }
        });
        mnuReportes.add(mnuReporteClientes);

        mnuReporteBarcos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/listado.png"))); // NOI18N
        mnuReporteBarcos.setText("Listado de barcos");
        mnuReporteBarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteBarcosActionPerformed(evt);
            }
        });
        mnuReportes.add(mnuReporteBarcos);

        mnuReporteAlquileres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/listado.png"))); // NOI18N
        mnuReporteAlquileres.setText("Listado de alquileres");
        mnuReporteAlquileres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteAlquileresActionPerformed(evt);
            }
        });
        mnuReportes.add(mnuReporteAlquileres);

        jMenuBar1.add(mnuReportes);

        mnuAyudas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/acercade.png"))); // NOI18N
        mnuAyudas.setText("Acerca de");
        mnuAyudas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAyudasMouseClicked(evt);
            }
        });
        mnuAyudas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudasActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuAyudas);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/salir1.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarClienteActionPerformed
        frmAgregarCliente frm = new frmAgregarCliente(manejoPuerto);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuAgregarClienteActionPerformed

    private void mnuAgregarBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarBarcoActionPerformed
        frmAgregarBarco frm = new frmAgregarBarco(manejoPuerto);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuAgregarBarcoActionPerformed

    private void mnuReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteClientesActionPerformed
        frmListarClientes frm = new frmListarClientes(manejoPuerto);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuReporteClientesActionPerformed

    private void mnuAlquilarAmarreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlquilarAmarreActionPerformed
        frmAlquilarAmarres frm = new frmAlquilarAmarres(manejoPuerto, this);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuAlquilarAmarreActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void mnuReporteBarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteBarcosActionPerformed
        frmListarBarcos frm = new frmListarBarcos(manejoPuerto);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuReporteBarcosActionPerformed

    private void mnuReporteAlquileresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteAlquileresActionPerformed
        frmListarAlquileres frm = new frmListarAlquileres(manejoPuerto);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuReporteAlquileresActionPerformed

    private void mnuMantenimientoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMantenimientoClienteActionPerformed
        frmBuscarCliente frm = new frmBuscarCliente(manejoPuerto);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuMantenimientoClienteActionPerformed

    private void mnuMantenimientoBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMantenimientoBarcoActionPerformed
        frmBuscarBarco frm = new frmBuscarBarco(manejoPuerto);
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuMantenimientoBarcoActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuAyudasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudasActionPerformed
        
    }//GEN-LAST:event_mnuAyudasActionPerformed

    private void mnuAyudasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAyudasMouseClicked
        frmAcercade frm = new frmAcercade();
        this.dpnEscritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_mnuAyudasMouseClicked

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void cargarImagen(){
        try {
            dpnEscritorio.setBorder(new BackgroundImage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
            java.util.logging.Logger.getLogger(frmAplicacionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAplicacionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAplicacionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAplicacionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAplicacionPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAgregarBarco;
    private javax.swing.JMenuItem mnuAgregarCliente;
    private javax.swing.JMenuItem mnuAlquilarAmarre;
    private javax.swing.JMenu mnuAlquileres;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuArchivo1;
    private javax.swing.JMenu mnuAyudas;
    private javax.swing.JMenuItem mnuMantenimientoBarco;
    private javax.swing.JMenuItem mnuMantenimientoCliente;
    private javax.swing.JMenuItem mnuReporteAlquileres;
    private javax.swing.JMenuItem mnuReporteBarcos;
    private javax.swing.JMenuItem mnuReporteClientes;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables

}
