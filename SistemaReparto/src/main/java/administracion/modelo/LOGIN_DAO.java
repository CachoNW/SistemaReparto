package administracion.modelo;

import administracion.controlador.LOGIN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LOGIN_DAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    private static final String SQL_QUERY = "SELECT pkidusuarios, Nomuser, Apelluser, Password FROM Usuarios WHERE Username = ?";

    public LOGIN query(LOGIN usuario) {
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, usuario.getUsername());
            //System.out.println(stmt);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("pkidusuarios");
                String nombre = rs.getString("Nomuser");
                String apellido = rs.getString("Apelluser");
                String password = rs.getString("Password");
                usuario = new LOGIN();
                usuario.setId(id);
                usuario.setNombre(nombre);
                usuario.setApellido(apellido);
                usuario.setPassword(password);
                rows++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuario;
    }
    
}
