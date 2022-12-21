package Panels;

import Controlador.Ctrl_Producto;
import Modelo.entidad.Producto;
import Conexion.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JTable;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class PnlNuevoProducto extends javax.swing.JPanel {

    int obtenerIdCategoriaCombo = 0;
    Conexion conexion = new Conexion();

    public PnlNuevoProducto() {
        initComponents();

        this.CargarComboCategoria();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new Vistas.TextField();
        txtCantidad = new Vistas.TextField();
        txtPrecio = new Vistas.TextField();
        txtDescripcion = new Vistas.TextField();
        jCbxIGV = new javax.swing.JComboBox<>();
        jCbxCategoria = new javax.swing.JComboBox<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(870, 634));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        roundPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        roundPanel1.setPreferredSize(new java.awt.Dimension(474, 424));
        roundPanel1.setRound(10);

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrar-categoria.png"))); // NOI18N
        jLabel1.setText("Nuevo Producto");

        btnGuardar.setBackground(new java.awt.Color(255, 145, 56));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Descripción:");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("IGV:");

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Categoría:");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Precio:");

        txtNombre.setLabelText("");

        txtCantidad.setLabelText("");

        txtPrecio.setLabelText("");

        txtDescripcion.setLabelText("");

        jCbxIGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Sin IGV", "18%" }));

        jCbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoría" }));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(60, 60, 60)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCbxIGV, 0, 320, Short.MAX_VALUE)
                                    .addComponent(jCbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1))
                        .addContainerGap(305, Short.MAX_VALUE))))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCbxIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String igv = "";
        String categoria = "";

        igv = jCbxIGV.getSelectedItem().toString().trim();
        categoria = jCbxCategoria.getSelectedItem().toString().trim();

        //Validar campos
        if (txtNombre.getText().equals("") || txtCantidad.getText().equals("") || txtPrecio.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            //Consulta para saber si producto existe
            if (!controlProducto.existeProducto(txtNombre.getText().trim())) {

                if (igv.equalsIgnoreCase("Seleccione una opción")) {
                    JOptionPane.showMessageDialog(null, "Seleccione IGV");
                } else {

                    if (categoria.equalsIgnoreCase("Seleccione categoría")) {
                        JOptionPane.showMessageDialog(null, "Seleccione categoría");
                    } else {

                        try {
                            producto.setNombre(txtNombre.getText().trim());
                            producto.setCantidad(Integer.parseInt(txtCantidad.getText().trim()));

                            String precioTxt = "";
                            double Precio = 0.0;

                            precioTxt = txtPrecio.getText().trim();

                            boolean aux = false;

                            //Validamos puntos decimales
                            for (int i = 0; i < precioTxt.length(); i++) {

                                if (precioTxt.charAt(i) == ',') {
                                    String precioNuevo = precioTxt.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux = true;
                                }
                            }

                            //Evaluamos la condición
                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(precioTxt);
                                producto.setPrecio(Precio);
                            }

                            producto.setDescripcion(txtDescripcion.getText().trim());

                            if (igv.equalsIgnoreCase("Sin IGV")) {
                                producto.setIgv(0);
                            } else if (igv.equalsIgnoreCase("18%")) {
                                producto.setIgv(18);
                            }

                            //Carga método ID de Categoría
                            this.IdCategoria();
                            producto.setIdCategoria(obtenerIdCategoriaCombo);

                            producto.setEstado(1);

                            if (controlProducto.guardar(producto)) {
                                JOptionPane.showMessageDialog(null, "Producto guardado");
                                this.CargarComboCategoria();
                                this.jCbxIGV.setSelectedItem("Seleccione una opción");
                                this.Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al guardar");
                            }

                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " + e);
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jCbxCategoria;
    private javax.swing.JComboBox<String> jCbxIGV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private Vistas.TextField txtCantidad;
    private Vistas.TextField txtDescripcion;
    private Vistas.TextField txtNombre;
    private Vistas.TextField txtPrecio;
    // End of variables declaration//GEN-END:variables

//Limpiar campos
    private void Limpiar() {
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
    }

//Método para cargar las categorías
    private void CargarComboCategoria() {
        Connection cn = conexion.getConexion();
        String sql = "select * from tb_categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jCbxCategoria.removeAllItems();
            jCbxCategoria.addItem("Seleccione categoría");

            while (rs.next()) {
                jCbxCategoria.addItem(rs.getString("descripcion"));
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categoría: " + e);
        }
    }

    //Método para obtener ID Categoría
    private int IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.jCbxCategoria.getSelectedItem() + "'";
        Statement st;

        try {
            Connection cn = conexion.getConexion();

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener ID de categoría");
        }

        return obtenerIdCategoriaCombo;
    }
}