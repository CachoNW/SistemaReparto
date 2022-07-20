package administracion.vista;

import administracion.controlador.Hash;
import administracion.controlador.LOGIN;
import administracion.controlador.ProcesosRepetidos;
import administracion.modelo.LOGIN_DAO;
import com.formdev.flatlaf.FlatLightLaf;

public class LOGIN_Administracion extends javax.swing.JFrame {

    int xMouse, yMouse;

    public static String idUsuario, nomUsuario;
    LOGIN_DAO ldao = new LOGIN_DAO();
    LOGIN login = new LOGIN();
    ProcesosRepetidos procesoRepetido = new ProcesosRepetidos();

    public LOGIN_Administracion() {
        initComponents();
        diseño();
    }
    
    private void diseño(){
        procesoRepetido.cursorMano(Pnl_iniciarSesion, Pnl_barraSuperior, Btn_salir);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lbl_titulo = new javax.swing.JLabel();
        Lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        Lbl_contraseña = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        Pnl_iniciarSesion = new javax.swing.JPanel();
        Btn_iniciarSesion = new javax.swing.JLabel();
        Btn_cambiarContraseña = new javax.swing.JLabel();
        Pnl_barraSuperior = new javax.swing.JPanel();
        Pnl_salir = new javax.swing.JPanel();
        Btn_salir = new javax.swing.JLabel();
        Lbl_marca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 78, 65));

        Lbl_titulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_titulo.setText("Iniciar Sesión");

        Lbl_usuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_usuario.setText("Usuario:");

        txt_usuario.setBackground(new java.awt.Color(52, 78, 65));
        txt_usuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Escribe tu usuario...");
        txt_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_usuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });

        Lbl_contraseña.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Lbl_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_contraseña.setText("Contraseña:");

        txt_password.setBackground(new java.awt.Color(52, 78, 65));
        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_password.setText("***************");
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passwordMousePressed(evt);
            }
        });

        Pnl_iniciarSesion.setBackground(new java.awt.Color(97, 212, 195));
        Pnl_iniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_iniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        Btn_iniciarSesion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Btn_iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        Btn_iniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_iniciarSesion.setText("Iniciar Sesion");
        Btn_iniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_iniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_iniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_iniciarSesionMouseExited(evt);
            }
        });
        Pnl_iniciarSesion.add(Btn_iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, 160, 40));

        Btn_cambiarContraseña.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Btn_cambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        Btn_cambiarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_cambiarContraseña.setText("Restablecer Contraseña");
        Btn_cambiarContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        Pnl_barraSuperior.setBackground(new java.awt.Color(52, 78, 65));
        Pnl_barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pnl_barraSuperiorMouseDragged(evt);
            }
        });
        Pnl_barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pnl_barraSuperiorMousePressed(evt);
            }
        });

        Pnl_salir.setBackground(new java.awt.Color(52, 78, 65));

        Btn_salir.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        Btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_salir.setText("X");
        Btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Pnl_salirLayout = new javax.swing.GroupLayout(Pnl_salir);
        Pnl_salir.setLayout(Pnl_salirLayout);
        Pnl_salirLayout.setHorizontalGroup(
            Pnl_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_salirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Pnl_salirLayout.setVerticalGroup(
            Pnl_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Pnl_barraSuperiorLayout = new javax.swing.GroupLayout(Pnl_barraSuperior);
        Pnl_barraSuperior.setLayout(Pnl_barraSuperiorLayout);
        Pnl_barraSuperiorLayout.setHorizontalGroup(
            Pnl_barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_barraSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Pnl_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pnl_barraSuperiorLayout.setVerticalGroup(
            Pnl_barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Lbl_marca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Lbl_marca.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_marca.setText("Administración®");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_barraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_cambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbl_marca)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_titulo)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_contraseña)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_usuario))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Pnl_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Pnl_barraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(Lbl_titulo)
                .addGap(51, 51, 51)
                .addComponent(Lbl_usuario)
                .addGap(5, 5, 5)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Lbl_contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(Pnl_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_cambiarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(Lbl_marca)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Btn_salirMouseClicked

    private void Pnl_barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_barraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pnl_barraSuperiorMousePressed

    private void Pnl_barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pnl_barraSuperiorMouseDragged

    private void Btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_salirMouseExited
        procesoRepetido.pintarComponente("fLogin", Pnl_salir);
    }//GEN-LAST:event_Btn_salirMouseExited

    private void Btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_salirMouseEntered
        procesoRepetido.pintarComponente("sRojo", Pnl_salir);
    }//GEN-LAST:event_Btn_salirMouseEntered

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Escribe tu usuario...")) {
            txt_usuario.setText("");
        }
        if (txt_password.getText().isEmpty()) {
            txt_password.setText("***************");
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMousePressed
        if (txt_password.getText().equals("***************")) {
            txt_password.setText("");
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Escribe tu usuario...");
        }
    }//GEN-LAST:event_txt_passwordMousePressed

    private void Btn_iniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_iniciarSesionMouseEntered
        procesoRepetido.pintarComponente("sVerde", Pnl_iniciarSesion);
    }//GEN-LAST:event_Btn_iniciarSesionMouseEntered

    private void Btn_iniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_iniciarSesionMouseExited
        procesoRepetido.pintarComponente("dsVerde", Pnl_iniciarSesion);
    }//GEN-LAST:event_Btn_iniciarSesionMouseExited

    private void Btn_iniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_iniciarSesionMouseClicked
        String password = txt_password.getText(), usuario = txt_usuario.getText();
        String newPassword = Hash.sha1(password);

        login.setUsername(usuario);
        login = ldao.query(login);
        if (newPassword.equals(login.getPassword())) {
            idUsuario=login.getId();
            nomUsuario=login.getNombre()+" "+login.getApellido();
            MDI_Administracion mdiAdministracion = new MDI_Administracion();
            mdiAdministracion.setVisible(true);
            this.dispose();
        }else{
            procesoRepetido.accionErronea("Usuario o Contraseña erronea.", "No haz podido acceder debido a que tu usuario o contraseña estan erroneos, verificalo e intenta nuevamente.");
        }
    }//GEN-LAST:event_Btn_iniciarSesionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_cambiarContraseña;
    private javax.swing.JLabel Btn_iniciarSesion;
    private javax.swing.JLabel Btn_salir;
    private javax.swing.JLabel Lbl_contraseña;
    private javax.swing.JLabel Lbl_marca;
    private javax.swing.JLabel Lbl_titulo;
    private javax.swing.JLabel Lbl_usuario;
    private javax.swing.JPanel Pnl_barraSuperior;
    private javax.swing.JPanel Pnl_iniciarSesion;
    private javax.swing.JPanel Pnl_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
