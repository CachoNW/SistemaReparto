

package administracion.controlador;

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

 /**
 * @author H. Leonel Dominguez C.
 * @github https://github.com/leoneldc
 */

public class ProcesosRepetidos {
    
    java.util.Date fecha = new java.util.Date();
    
    Color sVerde = new Color(114, 243, 227);
    Color dsVerde = new Color(97, 212, 195);
    Color sAmarillo = new Color(255, 255, 153);
    Color dsAmarillo = new Color(255, 255, 102);
    Color sRojo = new Color(255, 102, 102);
    Color dsRojo = new Color(255, 51, 51);
    Color fLogin = new Color(52, 78, 65);
    
    
    //diseño
    public void pintarComponente(String accion, Component... componentes){
        for (Component componente : componentes) {
            switch (accion) {
                case "sVerde":
                    componente.setBackground(sVerde);
                break;
                case "dsVerde":
                    componente.setBackground(dsVerde);
                break;
                case "sAmarillo":
                    componente.setBackground(sAmarillo);
                break;
                case "dsAmarillo":
                    componente.setBackground(dsAmarillo);
                break;
                case "sRojo":
                    componente.setBackground(sRojo);
                break;
                case "dsRojo":
                    componente.setBackground(dsRojo);
                break;
                case "fLogin":
                    componente.setBackground(fLogin);
                break;
            }
        }
    }

    public void cursorMano(Component... componentes) {
        java.awt.Cursor cursor = java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR);
        for (Component componente : componentes) {
            componente.setCursor(cursor);
        }
    }
    
    //funciones 
    public String getFechaActual(String formato) {
        SimpleDateFormat formatoFecha=null;
        if (formato.equals("gt")) {
            formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        }
        if (formato.equals("us")) {
            formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
        }
        return formatoFecha.format(fecha);
    }

    public String getHoraActual() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("hh:mm:ss");
        return formatoFecha.format(fecha);
    }
    
    //funciones de validaciones de campos
    public boolean isNumeric(JTextField... texto) {
        for (JTextField jTextField : texto) {
            try {
                Integer.parseInt(jTextField.getText());
            } catch (Exception e) {
                accionErronea("Existen campos que únicamente acepta unicamente números, revise e intentelo nuevamente", "¡ERROR!");
                return false;
            }
        }
        return true;
    }

    public boolean isEmptyTxf(JTextField... texto) {
        for (JTextField jTextField : texto) {
            String palabra = jTextField.getText();
            palabra = palabra.replaceAll(" ", "");
            if (palabra.isEmpty()) {
                accionErronea("Existen campos que estan vaciós, revise e intentelo nuevamente", "¡ERROR!");
                return false;
            }
        }
        return true;
    }

    public boolean isSelectedCbx(JComboBox... texto) {
        for (JComboBox jComboBox : texto) {
            if (jComboBox.getSelectedIndex() == 0) {
                accionErronea("Existen campos que no se ah seleccionado una opción, revise e intentelo nuevamente", "¡ERROR!");
                return false;
            }
        }
        return true;
    }

    public boolean isEmptyTxa(JTextArea... texto) {
        for (JTextArea jTextArea : texto) {
            String palabra = jTextArea.getText();
            palabra = palabra.replaceAll(" ", "");
            if (palabra.isEmpty()) {
                accionErronea("Existen campos que estan vaciós, revise e intentelo nuevamente", "¡ERROR!");
                return false;
            }
        }
        return true;
    }

    //limpieza de componentes
    public void limpiarTxf(JTextField... texto){
        for (JTextField jTextField : texto) {
            jTextField.setText("");
        }
    }
    
    public void limpiarCbx(JComboBox... texto){
        for (JComboBox jComboBox : texto) {
            jComboBox.setSelectedIndex(0);
        }
    }
    
    public void limpiarTxa(JTextArea... texto){
        for (JTextArea jTextArea : texto) {
            jTextArea.setText("");
        }
    }
    
    //funciones de alertas
    public void accionExitosa(String titulo, String descripcion) {
        ImageIcon icon = new ImageIcon("src/main/java/assets/alerta_ok.png");
        JOptionPane.showMessageDialog(null, descripcion, titulo, 0, icon);
    }
    
    public void accionErronea( String titulo, String descripcion) {
        JOptionPane.showMessageDialog(null, descripcion, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean confirmarEliminación(String objeto){
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar " + objeto + "?", "Verifiación de Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmar == 0) {
            return true;
        }
        return false;
    }
    
}
