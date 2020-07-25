
        
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author estef
 */
public class Usuario {
   
    private Connection cn;
    private Integer ID_usuario;
    private String nombre_usuario;
    private String apPaterno;
    private String apMaterno;
    private Integer telefono;
    private String correo;
    private String domicilio;
    private String Usuario;
    private String Contraseña;
    private String Rcontraseña;
    private Integer ID_tipoUsuario;
   
    public Connection getcn(){
        return cn;
    }
    
    public void setcn(Connection cn){
        this.cn = cn;
    }
    
    public Integer getId_usuario(){
        return ID_usuario;
    }
    
    public void setID_usuario(Integer ID_usuario){
        this.ID_usuario = ID_usuario;
    }
    
    public String getnobre_usuario(){
        return nombre_usuario;
    }
    
    public void setnombre_usuario(String nombre_usuario){
        this.nombre_usuario = nombre_usuario;
    }
    
     public String aPaterno(){
        return apPaterno;
    }
    
    public void setapPaterno(String apPaterno){
        this.apPaterno = apPaterno;
    }
    
    public String apMaterno(){
        return apMaterno;
    }
    
    public void setapMaterno(String apMaterno){
        this.apMaterno = apMaterno;
    }
    
    public Integer telefono(){
        return telefono;
    }
    
    public void settelefono( Integer telefono){
        this.telefono = telefono;
    }
    
    public String correo(){
        return correo;
    }
    
    public void setcorreo(String correo){
        this.correo = correo;
    }
    
    public  String domicilio(){
        return domicilio;
    }
    
    public void setdomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public String Usuario(){
        return Usuario;
    }
    
    public void setUsuario(String Usuario){
        this.Usuario = Usuario;
    }
    
     public String Contraseña(){
        return Contraseña;
    }
    
    public void setContraseña(String Contraseña){
        this.Contraseña = Contraseña;
    }
    
    public String Rcontraseña(){
        return correo;
    }
    
    public void setRcontraseña(String Rcontraseña){
        this.Rcontraseña = Rcontraseña;
    }
    
    public Integer ID_tipoUsuario(){
        return ID_tipoUsuario;
    }
    
    public void setID_tipoUsuario(Integer ID_tipoUsuario){
        this.ID_tipoUsuario = ID_tipoUsuario;
    }
    
    public Usuario() {
        conexion u = new conexion();
        cn = u.conectar();
    }
    
    
     
    
    public boolean modificar() {
         boolean resp = false;
        try {String sql = "UPDATE SET Usuarios , nombre_usuario = ?, contrasenia_usuario = = ?"
                + " nombre_empleado = ?, empleado_apPaterno = ?, empleadoapMaterno = ?, empleado_telefono = ? "
                + "empleado_domicilio = ?, empleado_correo = ?, ID_tipoUsuarios = ? ,ID_usuario = ?";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
       
        cmd.setInt(1, ID_usuario);
        cmd.setString(2, nombre_usuario);
        cmd.setString(3,apPaterno );
        cmd.setInt(4,telefono);
        cmd.setString(5, correo);
        cmd.setString(2, domicilio);
        cmd.setString(6, Usuario);
        cmd.setString(7, Contraseña);
        cmd.setInt(8, ID_tipoUsuario);
        
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    
    public boolean Consultar() {
        boolean resp = false;
        try {String sql = "SELECT ID_usuario, nombre_usuario, contrasenia_usuario"
                + " nombre_empleado, empleado_apPaterno, empleadoapMaterno, empleado_telefono "
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios FROM Usuarios WERE ID_usuario = ? ";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setInt(1, ID_usuario);
        
        ResultSet rs = cmd.executeQuery();
        
        if (rs.next()) {
            resp = true;
             ID_usuario = rs.getInt(1);
             nombre_usuario = rs.getString(1);
             apPaterno = rs.getString(2);
             telefono = rs.getInt(3);
             correo = rs.getString(4);
             domicilio = rs.getString(5);
             Usuario = rs.getString(6);
             Contraseña = rs.getString(7);
             ID_tipoUsuario = rs.getInt(8);
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
        }

    public boolean guardar() {
        boolean resp = false;
        try {String sql = "INSERT INTO Usuarios(ID_usuario, nombre_usuario, contrasenia_usuario"
                + " nombre_empleado, empleado_apPaterno, empleadoapMaterno, empleado_telefono "
                + "empleado_domicilio, empleado_correo, ID_tipoUsuarios)"+" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        
        cmd.setInt(1, ID_usuario);
        cmd.setString(2, nombre_usuario);
        cmd.setString(3,apPaterno );
        cmd.setInt(4,telefono);
        cmd.setString(5, correo);
        cmd.setString(2, domicilio);
        cmd.setString(6, Usuario);
        cmd.setString(7, Contraseña);
        cmd.setInt(8, ID_tipoUsuario);
        
        if (!cmd.execute()) {
            resp = true;
        }
        cmd.close();
        cn.close();
        }catch(Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    }

    
    
        
        
    
        
