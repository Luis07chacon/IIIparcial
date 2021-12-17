
package ventana;

import AppPackage.AnimationClass;
import clases.Arrayinfo_tareas;
import clases.componentes;
import clases.crear_reporte_completados;
import clases.crear_reporte_pendientes;
import clases.enviar_correo_tarea;
import clases.info_tareas;
import clases.usuario;
import java.awt.BorderLayout;
import static java.awt.GridBagConstraints.BOTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static ventana.Registro.correo;


public class Tareas extends javax.swing.JFrame {
        
    public static String nombre_tarea = "";
    public static String encargado = "";
    public static String descrip = "";
    public static String fecha = "";
    
    DefaultTableModel t = new DefaultTableModel();
    public static DefaultTableModel t2 = new DefaultTableModel();
    public static DefaultTableModel t3 = new DefaultTableModel();
    public Tareas() throws IOException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
       tabla.setModel(t);
        t.addColumn("Nombre de Tarea");
        t.addColumn("Encargado");
        t.addColumn("Descripción");
        t.addColumn("Fecha");
        
        t2.addColumn("Nombre de Tarea");
        t2.addColumn("Encargado");
        t2.addColumn("Descripción");
        t2.addColumn("Fecha");
        tabla_tareascompletadas.setModel(t2);
        
        t3.addColumn("Nombre de Tarea");
        t3.addColumn("Encargado");
        t3.addColumn("Descripción");
        t3.addColumn("Fecha");
        tabla_tareasnocompletadas.setModel(t3);
        
        layeredpane.removeAll();
        layeredpane.add(Panel_principal);
        layeredpane.repaint();
        layeredpane.revalidate();
        
    }

        public void cargar() {
        t.setRowCount(0);
        for (int i = 0; i < Arrayinfo_tareas.Arraytareas.size(); i++) {
            t.addRow(new Object[]{
                Arrayinfo_tareas.Arraytareas.get(i).getNombre_tarea(),
                Arrayinfo_tareas.Arraytareas.get(i).getEncargado(),
                Arrayinfo_tareas.Arraytareas.get(i).getDescrip(),
                Arrayinfo_tareas.Arraytareas.get(i).getFecha()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_agregar = new javax.swing.JLabel();
        label_incompletas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_completadas = new javax.swing.JLabel();
        label_agenda = new javax.swing.JLabel();
        layeredpane = new javax.swing.JLayeredPane();
        panel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bt_registrar2 = new javax.swing.JButton();
        bt_registrar3 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_tareascompletadas = new javax.swing.JTable();
        bt_registrar4 = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_tareasnocompletadas = new javax.swing.JTable();
        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_descrip = new javax.swing.JTextField();
        txt_nombre_tarea = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        bt_registrar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_encargado = new javax.swing.JTextField();
        Panel_principal = new javax.swing.JPanel();
        lb_fecha = new javax.swing.JLabel();
        lb_descrip = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recordatorio de Tareas");
        setBackground(new java.awt.Color(51, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_agregar.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        label_agregar.setForeground(new java.awt.Color(51, 51, 51));
        label_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        label_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_agregarMouseClicked(evt);
            }
        });
        jPanel1.add(label_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 180));

        label_incompletas.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        label_incompletas.setForeground(new java.awt.Color(51, 51, 51));
        label_incompletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_incompletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/incompletas.jpeg"))); // NOI18N
        label_incompletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_incompletasMouseClicked(evt);
            }
        });
        jPanel1.add(label_incompletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, 180, 160));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TAREAS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 90));

        label_completadas.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        label_completadas.setForeground(new java.awt.Color(51, 51, 51));
        label_completadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_completadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Completadas.png"))); // NOI18N
        label_completadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_completadasMouseClicked(evt);
            }
        });
        jPanel1.add(label_completadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 180, 160));

        label_agenda.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        label_agenda.setForeground(new java.awt.Color(51, 51, 51));
        label_agenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agenda.png"))); // NOI18N
        label_agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_agendaMouseClicked(evt);
            }
        });
        jPanel1.add(label_agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, 180));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 1030));

        layeredpane.setLayout(new java.awt.CardLayout());

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Tareas Registradas");
        panel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 400, 70));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setRowHeight(30);
        jScrollPane1.setViewportView(tabla);

        panel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 1530, 720));

        bt_registrar2.setBackground(new java.awt.Color(0, 204, 204));
        bt_registrar2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        bt_registrar2.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar2.setText("Tarea incompleta");
        bt_registrar2.setBorder(null);
        bt_registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrar2ActionPerformed(evt);
            }
        });
        panel2.add(bt_registrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 890, 300, 70));

        bt_registrar3.setBackground(new java.awt.Color(0, 204, 204));
        bt_registrar3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        bt_registrar3.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar3.setText("Tarea completada");
        bt_registrar3.setBorder(null);
        bt_registrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrar3ActionPerformed(evt);
            }
        });
        panel2.add(bt_registrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 890, 300, 70));

        layeredpane.add(panel2, "card3");

        panel3.setBackground(new java.awt.Color(204, 204, 204));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Tareas completadas");
        panel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 410, 70));

        tabla_tareascompletadas.setBackground(new java.awt.Color(255, 255, 255));
        tabla_tareascompletadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de tarea", "Encargado ", "Descripción", "Fecha"
            }
        ));
        tabla_tareascompletadas.setRowHeight(30);
        jScrollPane2.setViewportView(tabla_tareascompletadas);

        panel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 1470, 740));

        bt_registrar4.setBackground(new java.awt.Color(0, 204, 204));
        bt_registrar4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        bt_registrar4.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar4.setText("Crear Reporte");
        bt_registrar4.setBorder(null);
        bt_registrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrar4ActionPerformed(evt);
            }
        });
        panel3.add(bt_registrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 890, 280, 60));

        layeredpane.add(panel3, "card4");

        panel4.setBackground(new java.awt.Color(204, 204, 204));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Tareas no completadas");
        panel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 470, 70));

        tabla_tareasnocompletadas.setBackground(new java.awt.Color(255, 255, 255));
        tabla_tareasnocompletadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_tareasnocompletadas.setRowHeight(30);
        jScrollPane3.setViewportView(tabla_tareasnocompletadas);

        panel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 1470, 800));

        layeredpane.add(panel4, "card5");

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Agregar Tarea");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 280, 70));

        jLabel7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha:");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, 100, 50));

        txt_descrip.setBackground(new java.awt.Color(255, 255, 255));
        txt_descrip.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        txt_descrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        panel1.add(txt_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 830, 60));

        txt_nombre_tarea.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_tarea.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        txt_nombre_tarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        panel1.add(txt_nombre_tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 830, 60));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nombre de la tarea:");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 290, 50));

        txt_fecha.setBackground(new java.awt.Color(204, 204, 204));
        txt_fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        txt_fecha.setDateFormatString("d/MM/yy");
        panel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 750, 270, 50));

        jLabel9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Descripción:");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 190, 50));

        bt_registrar1.setBackground(new java.awt.Color(0, 204, 204));
        bt_registrar1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        bt_registrar1.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar1.setText("Agregar Tarea");
        bt_registrar1.setBorder(null);
        bt_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrar1ActionPerformed(evt);
            }
        });
        panel1.add(bt_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 850, 300, 70));

        jLabel13.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Encargado de la tarea:");
        panel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 330, 50));

        txt_encargado.setBackground(new java.awt.Color(255, 255, 255));
        txt_encargado.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        txt_encargado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        panel1.add(txt_encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 830, 60));

        layeredpane.add(panel1, "card2");

        Panel_principal.setBackground(new java.awt.Color(204, 204, 204));
        Panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_fecha.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lb_fecha.setForeground(new java.awt.Color(102, 102, 102));
        Panel_principal.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 126, 90, 20));

        lb_descrip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lb_descrip.setForeground(new java.awt.Color(102, 102, 102));
        Panel_principal.add(lb_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 350, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono_principal.png"))); // NOI18N
        Panel_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 1500, 660));

        layeredpane.add(Panel_principal, "card6");

        jPanel3.add(layeredpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 1700, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void label_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_agregarMouseClicked
        layeredpane.removeAll();
        layeredpane.add(panel1);
        layeredpane.repaint();
        layeredpane.revalidate();
    }//GEN-LAST:event_label_agregarMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        AnimationClass agregar = new AnimationClass();
        agregar.jLabelXRight(-200, 10, 10, 5, label_agregar);
        agregar.jLabelXLeft(10, -200, 10, 5, label_agregar);

        AnimationClass agenda = new AnimationClass();
        agenda.jLabelXRight(-200, 10, 10, 5, label_agenda);
        agenda.jLabelXLeft(10, -200, 10, 5, label_agenda);
        
        AnimationClass completas = new AnimationClass();
        completas.jLabelXRight(-200, 10, 10, 5, label_completadas);
        completas.jLabelXLeft(10, -200, 10, 5, label_completadas);
        
        AnimationClass incompletas = new AnimationClass();
        incompletas.jLabelXRight(-200, 10, 10, 5, label_incompletas);
        incompletas.jLabelXLeft(10, -200, 10, 5, label_incompletas);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void label_agendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_agendaMouseClicked
        layeredpane.removeAll();
        layeredpane.add(panel2);
        layeredpane.repaint();
        layeredpane.revalidate();
    }//GEN-LAST:event_label_agendaMouseClicked

    private void label_completadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_completadasMouseClicked
        layeredpane.removeAll();
        layeredpane.add(panel3);
        layeredpane.repaint();
        layeredpane.revalidate();
    }//GEN-LAST:event_label_completadasMouseClicked

    private void label_incompletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_incompletasMouseClicked
        layeredpane.removeAll();
        layeredpane.add(panel4);
        layeredpane.repaint();
        layeredpane.revalidate();
    }//GEN-LAST:event_label_incompletasMouseClicked

    private void bt_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrar1ActionPerformed
        
        String dia = Integer.toString(txt_fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(txt_fecha.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(txt_fecha.getCalendar().get(Calendar.YEAR));
        String fecha = (dia + "-" + mes+ "-" + year);
        
        String nombre_tarea = txt_nombre_tarea.getText();
        String encargado = txt_encargado.getText();
        String descripcion = txt_descrip.getText();
        String fechafinal = fecha;
                
        info_tareas m = new info_tareas(txt_nombre_tarea.getText(),txt_encargado.getText(),txt_descrip.getText(),fecha);
        
        m.setNombre_tarea(nombre_tarea);
        m.setEncargado(encargado);
        m.setDescrip(descripcion);
        m.setFecha(fecha);

        try {            
            Arrayinfo_tareas.Arraytareas.add(m);
            JOptionPane.showMessageDialog(rootPane, "Tarea agregada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. Tarea no agregada");
        }
        nombre_tarea = nombre_tarea;
        encargado = encargado;
        descrip = descripcion;
        fecha = fecha;
        
        txt_nombre_tarea.setText("");
        txt_encargado.setText("");
        txt_descrip.setText("");
        cargar();
    }//GEN-LAST:event_bt_registrar1ActionPerformed

    private void bt_registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrar2ActionPerformed
                int Filaselect = tabla.getSelectedRow();
        
        if(Filaselect>=0){
            String info_tareas []= new String[4];
            info_tareas[0]=tabla.getValueAt(Filaselect, 0).toString();
            info_tareas[1]=tabla.getValueAt(Filaselect, 1).toString();
            info_tareas[2]=tabla.getValueAt(Filaselect, 2).toString();
            info_tareas[3]=tabla.getValueAt(Filaselect, 3).toString();
            
            Tareas.t3.addRow(info_tareas);
            t.removeRow(Filaselect);            
        }
    }//GEN-LAST:event_bt_registrar2ActionPerformed

    private void bt_registrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrar3ActionPerformed
        int Filaselect = tabla.getSelectedRow();
        
        if(Filaselect>=0){
            String info_tareas []= new String[4];
            info_tareas[0]=tabla.getValueAt(Filaselect, 0).toString();
            info_tareas[1]=tabla.getValueAt(Filaselect, 1).toString();
            info_tareas[2]=tabla.getValueAt(Filaselect, 2).toString();
            info_tareas[3]=tabla.getValueAt(Filaselect, 3).toString();
            
            Tareas.t2.addRow(info_tareas);
            t.removeRow(Filaselect);            
        }
        enviar_correo_tarea m = new enviar_correo_tarea(correo);
        try {
            m.enviarcorreo_completa();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Tareas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Tareas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_registrar3ActionPerformed

    private void bt_registrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrar4ActionPerformed
        crear_reporte_completados m = new crear_reporte_completados(new Date().toString(),Arrayinfo_tareas.Arraytareas);
        m.CrearReporte_comple();
    }//GEN-LAST:event_bt_registrar4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JButton bt_registrar1;
    private javax.swing.JButton bt_registrar2;
    private javax.swing.JButton bt_registrar3;
    private javax.swing.JButton bt_registrar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_agenda;
    private javax.swing.JLabel label_agregar;
    private javax.swing.JLabel label_completadas;
    private javax.swing.JLabel label_incompletas;
    private javax.swing.JLayeredPane layeredpane;
    private javax.swing.JLabel lb_descrip;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla_tareascompletadas;
    private javax.swing.JTable tabla_tareasnocompletadas;
    private javax.swing.JTextField txt_descrip;
    private javax.swing.JTextField txt_encargado;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JTextField txt_nombre_tarea;
    // End of variables declaration//GEN-END:variables
}
