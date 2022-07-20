package administracion.vista;

import administracion.controlador.ProcesosRepetidos;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;

public class MDI_Administracion extends javax.swing.JFrame {
    
    ProcesosRepetidos procesoRepetido = new ProcesosRepetidos();

    public MDI_Administracion() {
        initComponents();
        Diseño();
    }

    public void Diseño(){
        Jdp_contenedor.setBackground(new Color(52, 78, 65));
        procesoRepetido.cursorMano(Mnb_menu);
        setTitle("[ USUARIO: " + LOGIN_Administracion.nomUsuario.toUpperCase() + "  [ "+procesoRepetido.getFechaActual("gt")+" ]  ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jdp_contenedor = new javax.swing.JDesktopPane();
        Mnb_menu = new javax.swing.JMenuBar();
        Sbm_actualizarPermisos = new javax.swing.JMenu();
        Sbm_archivos = new javax.swing.JMenu();
        Sbm_catalogo = new javax.swing.JMenu();
        Mnu_mantenimientos = new javax.swing.JMenu();
        MnI_modulos = new javax.swing.JMenuItem();
        MnI_aplicaciones = new javax.swing.JMenuItem();
        MnI_usuarios = new javax.swing.JMenuItem();
        MnI_puestosT = new javax.swing.JMenuItem();
        MnI_trabajadores = new javax.swing.JMenuItem();
        MnI_clientes = new javax.swing.JMenuItem();
        MnI_vahiculos = new javax.swing.JMenuItem();
        MnI_bodegas = new javax.swing.JMenuItem();
        Sbm_procesos = new javax.swing.JMenu();
        Mnu_procesos = new javax.swing.JMenu();
        Sbm_herramientas = new javax.swing.JMenu();
        Sbm_ayuda = new javax.swing.JMenu();
        Btn_cerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout Jdp_contenedorLayout = new javax.swing.GroupLayout(Jdp_contenedor);
        Jdp_contenedor.setLayout(Jdp_contenedorLayout);
        Jdp_contenedorLayout.setHorizontalGroup(
            Jdp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        Jdp_contenedorLayout.setVerticalGroup(
            Jdp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );

        Sbm_actualizarPermisos.setText("*");
        Sbm_actualizarPermisos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Sbm_actualizarPermisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sbm_actualizarPermisosMouseClicked(evt);
            }
        });
        Mnb_menu.add(Sbm_actualizarPermisos);

        Sbm_archivos.setText("Archivos");
        Sbm_archivos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_archivos);

        Sbm_catalogo.setText("Catalogo");
        Sbm_catalogo.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        Mnu_mantenimientos.setText("Mantenimientos");

        MnI_modulos.setText("Modulos");
        Mnu_mantenimientos.add(MnI_modulos);

        MnI_aplicaciones.setText("Aplicaciones");
        Mnu_mantenimientos.add(MnI_aplicaciones);

        MnI_usuarios.setText("Usuarios");
        Mnu_mantenimientos.add(MnI_usuarios);

        MnI_puestosT.setText("Puestos de Trabajos");
        Mnu_mantenimientos.add(MnI_puestosT);

        MnI_trabajadores.setText("Trabajadores");
        Mnu_mantenimientos.add(MnI_trabajadores);

        MnI_clientes.setText("Clientes");
        Mnu_mantenimientos.add(MnI_clientes);

        MnI_vahiculos.setText("Vehiculos");
        Mnu_mantenimientos.add(MnI_vahiculos);

        MnI_bodegas.setText("Bodegas");
        Mnu_mantenimientos.add(MnI_bodegas);

        Sbm_catalogo.add(Mnu_mantenimientos);

        Mnb_menu.add(Sbm_catalogo);

        Sbm_procesos.setText("Procesos");
        Sbm_procesos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        Mnu_procesos.setText("Procesos");
        Sbm_procesos.add(Mnu_procesos);

        Mnb_menu.add(Sbm_procesos);

        Sbm_herramientas.setText("Herramientas");
        Sbm_herramientas.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_herramientas);

        Sbm_ayuda.setText("Ayuda");
        Sbm_ayuda.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_ayuda);

        Btn_cerrarSesion.setText("Cerrar Sesión");
        Btn_cerrarSesion.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Btn_cerrarSesion);

        setJMenuBar(Mnb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdp_contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdp_contenedor)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

    }//GEN-LAST:event_formComponentResized

    private void Sbm_actualizarPermisosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sbm_actualizarPermisosMouseClicked
        
    }//GEN-LAST:event_Sbm_actualizarPermisosMouseClicked

    public static void main(String args[]) {
        //FLATLAF
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu Btn_cerrarSesion;
    private javax.swing.JDesktopPane Jdp_contenedor;
    public static javax.swing.JMenuItem MnI_aplicaciones;
    public static javax.swing.JMenuItem MnI_bodegas;
    public static javax.swing.JMenuItem MnI_clientes;
    public static javax.swing.JMenuItem MnI_modulos;
    public static javax.swing.JMenuItem MnI_puestosT;
    public static javax.swing.JMenuItem MnI_trabajadores;
    public static javax.swing.JMenuItem MnI_usuarios;
    public static javax.swing.JMenuItem MnI_vahiculos;
    public static javax.swing.JMenuBar Mnb_menu;
    public static javax.swing.JMenu Mnu_mantenimientos;
    public static javax.swing.JMenu Mnu_procesos;
    public static javax.swing.JMenu Sbm_actualizarPermisos;
    public static javax.swing.JMenu Sbm_archivos;
    public static javax.swing.JMenu Sbm_ayuda;
    public static javax.swing.JMenu Sbm_catalogo;
    public static javax.swing.JMenu Sbm_herramientas;
    public static javax.swing.JMenu Sbm_procesos;
    // End of variables declaration//GEN-END:variables
}
