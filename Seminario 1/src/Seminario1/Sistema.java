/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Seminario1;

import ConexionSQL.ConexionBD;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Savepoint;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


/**
 *
 * @author Usuario
 */
public class Sistema extends javax.swing.JFrame {
    
    private final  ConexionBD conexion = new ConexionSQL.ConexionBD();
    private final Connection con;
    
    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
        con = conexion.conectar();
        //cargarTablas();
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formularioPedido = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoCodigoPedido = new javax.swing.JTextField();
        campoCodigoCliente = new javax.swing.JTextField();
        campoFechaPedido = new javax.swing.JTextField();
        campoCodigoProducto = new javax.swing.JTextField();
        campoCantidadProducto = new javax.swing.JTextField();
        botonTerminarPedido = new javax.swing.JButton();
        botonBorrarDetalles = new javax.swing.JButton();
        botonBorrarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaStock = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        botonAnadirStock = new javax.swing.JButton();
        botonAltaPedido = new javax.swing.JButton();
        botonCerrarSesión = new javax.swing.JButton();
        botonRecargar = new javax.swing.JButton();
        Borrar_Tabla = new javax.swing.JButton();
        Comprueba_con = new javax.swing.JButton();

        formularioPedido.setMinimumSize(new java.awt.Dimension(500, 700));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Dar de Alta un pedido");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Código de Producto:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Código de Cliente:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de pedido:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Añadir detalles(opcional)");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Código de Pedido:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Cantidad:");

        campoCodigoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoPedidoActionPerformed(evt);
            }
        });

        botonTerminarPedido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonTerminarPedido.setText("Guardar pedido");
        botonTerminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarPedidoActionPerformed(evt);
            }
        });

        botonBorrarDetalles.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonBorrarDetalles.setText("Borrar detalles de pedido");
        botonBorrarDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarDetallesActionPerformed(evt);
            }
        });

        botonBorrarPedido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonBorrarPedido.setText("Borrar pedido");
        botonBorrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioPedidoLayout = new javax.swing.GroupLayout(formularioPedido.getContentPane());
        formularioPedido.getContentPane().setLayout(formularioPedidoLayout);
        formularioPedidoLayout.setHorizontalGroup(
            formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPedidoLayout.createSequentialGroup()
                .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioPedidoLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel5))
                    .addGroup(formularioPedidoLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonTerminarPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBorrarDetalles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBorrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(formularioPedidoLayout.createSequentialGroup()
                                        .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioPedidoLayout.createSequentialGroup()
                                                .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoFechaPedido)
                                            .addComponent(campoCodigoProducto)
                                            .addComponent(campoCantidadProducto)
                                            .addComponent(campoCodigoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(campoCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formularioPedidoLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(309, 309, 309)))
        );
        formularioPedidoLayout.setVerticalGroup(
            formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPedidoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addComponent(campoCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(24, 24, 24)
                .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(botonTerminarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBorrarDetalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBorrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(formularioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formularioPedidoLayout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jLabel10)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("SISTEMA DE PEDIDOS");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Pedidos");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Stock");

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de pedido", "Cliente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPedidos);

        tablaStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de producto", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tablaStock);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Detalles de los pedidos");

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de pedido", "Código de producto", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tablaDetalle);

        botonAnadirStock.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonAnadirStock.setText("Añadir Stock");
        botonAnadirStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirStockActionPerformed(evt);
            }
        });

        botonAltaPedido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonAltaPedido.setText("Dar de Alta un nuevo pedido");
        botonAltaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaPedidoActionPerformed(evt);
            }
        });

        botonCerrarSesión.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonCerrarSesión.setText("Cerrar Sesión");
        botonCerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesiónActionPerformed(evt);
            }
        });

        botonRecargar.setText("Recargar Tablas");
        botonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargarActionPerformed(evt);
            }
        });

        Borrar_Tabla.setText("Borrar Tablas");
        Borrar_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_TablaActionPerformed(evt);
            }
        });

        Comprueba_con.setText("Comprueba conexión");
        Comprueba_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprueba_conActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(348, 348, 348))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonCerrarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(395, 395, 395)
                        .addComponent(botonRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonAnadirStock, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonAltaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Borrar_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Comprueba_con, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(botonRecargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Comprueba_con)
                        .addGap(18, 18, 18)
                        .addComponent(botonAnadirStock, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Borrar_Tabla)
                        .addGap(26, 26, 26)
                        .addComponent(botonAltaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(botonCerrarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void manejarError(String mensaje, Exception e) {
        
        JOptionPane.showMessageDialog(null, mensaje + ": " + e.toString());
        e.printStackTrace();
    }    

private void AnadirStock() throws SQLException{
        Savepoint savepoint = con.setSavepoint("Añadir el stock");
        try {
            String sql = "INSERT INTO STOCK (CPRODUCTO, CANTIDAD) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int codigo = 1000000 + random.nextInt(9000000); // Genera códigos aleatorios de 7 cifras
                int cantidad = random.nextInt(91) + 10; // Genera cantidades aleatorias entre 10 y 100

                pstmt.setInt(1, codigo);
                pstmt.setInt(2, cantidad);
                pstmt.executeUpdate();
                savepoint = con.setSavepoint("Elemento "+ i+1 +" del stock añadido");
            }
            con.commit();
        }
        catch(SQLException e){
            con.rollback(savepoint);
            manejarError("Error al añadir stock: ",e); 
        }
        cargarDatosDesdeDB("STOCK", (DefaultTableModel) tablaStock.getModel());
        
}
    
    private void botonAnadirStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirStockActionPerformed
        try {
            AnadirStock();
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAnadirStockActionPerformed

private int filasTabla(String nombreTabla) throws SQLException {
    int rowCount = 0;

    try (PreparedStatement countStatement = con.prepareStatement("SELECT COUNT(*) FROM " + nombreTabla);
         ResultSet resultSet = countStatement.executeQuery()) {

        if (resultSet.next()) {
            rowCount = resultSet.getInt(1);
            System.out.println("La tabla " + nombreTabla + " tiene " + rowCount + " filas.");
        }
    } catch (SQLException e) {  
        manejarError("Error al obtener el número de filas de la tabla " + nombreTabla + ": ",e);
    
    }

    return rowCount;
}
    
private void borrarContenidoTablas() throws SQLException{
    try {
        if(filasTabla("DETALLE_PEDIDO") > 0)
            borrarTabla("DETALLE_PEDIDO", tablaDetalle);
        if(filasTabla("STOCK") > 0)
            borrarTabla("STOCK", tablaStock);
        if(filasTabla("PEDIDO") > 0)
            borrarTabla("PEDIDO", tablaPedidos);

        JOptionPane.showMessageDialog(null, "Contenido de las tablas borrado correctamente.");
        con.commit();
    } catch (SQLException e) {
        manejarError("Error al borrar contenido de las tablas ",e);
        con.rollback();
    }
}

private void borrarTabla(String nombreTabla, JTable tabla_a_borrar) throws SQLException {
    con.setAutoCommit(false);
    Savepoint savepoint = con.setSavepoint();
    try {
        // Borrar contenido de la tabla
        String deleteQuery = "DELETE FROM " + nombreTabla;
        PreparedStatement deleteStatement = con.prepareStatement(deleteQuery);
        int rowsAffected = deleteStatement.executeUpdate();
        System.out.println("Filas afectadas: " + rowsAffected);
        // Limpiar modelo de la interfaz gráfica
        DefaultTableModel tabla = (DefaultTableModel) tabla_a_borrar.getModel();
        tabla.setRowCount(0);
        
    } catch (SQLException e) {
        con.rollback(savepoint);
        throw e; // Re-lanza la excepción para que sea manejada en el método principal
    }
}
    
    private void botonCerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesiónActionPerformed
        //Se cierra la ventana principal
        this.dispose();
        //Se cierra la conexión
        conexion.desconectar();
        System.out.println("Conexión cerrada correctamente.");
        formularioPedido.dispose();
         
    }//GEN-LAST:event_botonCerrarSesiónActionPerformed

    private void botonAltaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaPedidoActionPerformed
       formularioPedido.setVisible(true);
        try {
            IniciarPedido();
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAltaPedidoActionPerformed

    private void campoCodigoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoPedidoActionPerformed

private void IniciarPedido() throws SQLException {
    try{
        con.setAutoCommit(false);

        //Savepoint savepointCliente, savepointPedido, savepointFecha, savepointCantidad, savepointProducto;
        Savepoint savepoint;
        PreparedStatement cn = con.prepareStatement("INSERT INTO PEDIDO (CPEDIDO, CCLIENTE, FECHA_PEDIDO) VALUES(?,?,?)");

        int cpedido = Integer.parseInt(campoCodigoPedido.getText());
        cn.setInt(1, cpedido);

        savepoint =  con.setSavepoint("Savepoint_pedido");
        cn.executeUpdate();

        int ccliente = Integer.parseInt(campoCodigoCliente.getText());
        cn.setInt(2, ccliente);
        savepoint = con.setSavepoint("Savepoint_cliente");
        cn.executeUpdate();

        String fecha = campoFechaPedido.getText();
        cn.setString(3, fecha);
        savepoint = con.setSavepoint("Savepoint_fecha");
        cn.executeUpdate();



        if (!campoCodigoProducto.getText().isEmpty() && !campoCantidadProducto.getText().isEmpty()) {
            int cproducto = Integer.parseInt(campoCodigoProducto.getText());
            int cantidad = Integer.parseInt(campoCantidadProducto.getText());

            if (haySuficienteStock(cproducto, cantidad)) {
                cn = con.prepareStatement("INSERT INTO DETALLE_PEDIDO (CPEDIDO, CPRODUCTO, CANTIDAD) VALUES(?,?,?)");

                cn.setInt(1, cpedido);
                cn.setInt(2, cproducto);
                savepoint = con.setSavepoint("Savepoint_producto");
                cn.executeUpdate();

                cn.setInt(3, cantidad);
                savepoint = con.setSavepoint("Savepoint_cantidad");

                cn.executeUpdate();

                // Actualizar el stock restando la cantidad del pedido
                actualizarStock(cproducto, cantidad);
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock para el producto seleccionado");
            con.rollback(savepoint);
        }
    }

        campoCodigoPedido.setText("");
        campoCodigoCliente.setText("");
        campoFechaPedido.setText("");
        campoCantidadProducto.setText("");
        campoCodigoProducto.setText("");
        TerminarPedido();
        formularioPedido.dispose();
        cargarTablas();
    } catch (SQLException e) {
        manejarError("Error al iniciar pedido: ", e); 
        con.rollback();
    }
}

private void TerminarPedido() throws SQLException {
    try{
       con.commit();
       con.setAutoCommit(true);
    }
    catch (SQLException e){
        con.rollback();        
        manejarError("Error al terminar pedido: ", e);
    }
}

private void actualizarStock(int cproducto, int cantidad) throws SQLException {
    // Restar la cantidad del pedido al stock actual
    String sql = "UPDATE STOCK SET CANTIDAD = CANTIDAD - ? WHERE CPRODUCTO = ?";
    try (PreparedStatement pstmt = con.prepareStatement(sql)) {
        pstmt.setInt(1, cantidad);
        pstmt.setInt(2, cproducto);
        pstmt.executeUpdate();
    }
    catch (SQLException e) {
        manejarError("Error al actualizar el stock: ",e);
    }
}

private boolean haySuficienteStock(int cproducto, int cantidad) throws SQLException {
    // Consultar la cantidad de stock disponible para el producto
    String sql = "SELECT CANTIDAD FROM STOCK WHERE CPRODUCTO = ?";
    try (PreparedStatement pstmt = con.prepareStatement(sql)) {
        pstmt.setInt(1, cproducto);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                int stockDisponible = rs.getInt("CANTIDAD");
                return stockDisponible >= cantidad;
            }
        }
    }
    catch (SQLException e) {
        manejarError("Error al verificar el stock: ",e);
    }
    return false; // Si no se encuentra el producto en el stock, retornar false

}

    private void botonTerminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarPedidoActionPerformed
        try {
            TerminarPedido();
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonTerminarPedidoActionPerformed

    private void botonBorrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarPedidoActionPerformed
        campoCodigoPedido.setText("");
        campoCodigoCliente.setText("");
        campoFechaPedido.setText("");
        campoCantidadProducto.setText("");
        campoCodigoProducto.setText("");
        formularioPedido.setVisible(false);
    }//GEN-LAST:event_botonBorrarPedidoActionPerformed

    private void botonBorrarDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarDetallesActionPerformed
        campoCantidadProducto.setText("");
        campoCodigoProducto.setText("");
    }//GEN-LAST:event_botonBorrarDetallesActionPerformed

private void cargarTablas() {
    cargarDatosDesdeDB("PEDIDO", (DefaultTableModel) tablaPedidos.getModel());
    cargarDatosDesdeDB("STOCK", (DefaultTableModel) tablaStock.getModel());
    cargarDatosDesdeDB("DETALLE_PEDIDO",(DefaultTableModel) tablaDetalle.getModel());
}

private void cargarDatosDesdeDB(String nombreTabla, DefaultTableModel modelo) {
    try{
        modelo.setRowCount(0);
        String selectQuery = "SELECT * FROM " + nombreTabla;
   
        PreparedStatement preparedStatement = con.prepareStatement(selectQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnas = rsmd.getColumnCount();

        while (resultSet.next()) {
            Object[] fila = new Object[columnas];
            for (int indice = 0; indice < columnas; indice++) {
                fila[indice] = resultSet.getObject(indice + 1);

            }
            modelo.addRow(fila);
        }
    } catch (SQLException e) {
        manejarError("Error al cargar datos: ",e);
    }
}
 
    private void botonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargarActionPerformed
        cargarTablas();
    }//GEN-LAST:event_botonRecargarActionPerformed

    private void Borrar_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_TablaActionPerformed
        try {
            borrarContenidoTablas();
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Borrar_TablaActionPerformed

public boolean verificarConexion() {
    try {
        boolean conexion = con != null && !con.isClosed();
        if(conexion)
            JOptionPane.showMessageDialog(null, "Funciona la conexión");
        return conexion;
        
    } catch (SQLException e) {
        manejarError("Error al verificar la conexión: ",e);
        return false;
    }
}

    private void Comprueba_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprueba_conActionPerformed
    verificarConexion();
    }//GEN-LAST:event_Comprueba_conActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar_Tabla;
    private javax.swing.JButton Comprueba_con;
    private javax.swing.JButton botonAltaPedido;
    private javax.swing.JButton botonAnadirStock;
    private javax.swing.JButton botonBorrarDetalles;
    private javax.swing.JButton botonBorrarPedido;
    private javax.swing.JButton botonCerrarSesión;
    private javax.swing.JButton botonRecargar;
    private javax.swing.JButton botonTerminarPedido;
    private javax.swing.JTextField campoCantidadProducto;
    private javax.swing.JTextField campoCodigoCliente;
    private javax.swing.JTextField campoCodigoPedido;
    private javax.swing.JTextField campoCodigoProducto;
    private javax.swing.JTextField campoFechaPedido;
    private javax.swing.JFrame formularioPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTable tablaStock;
    // End of variables declaration//GEN-END:variables
}