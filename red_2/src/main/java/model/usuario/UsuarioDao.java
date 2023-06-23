package model.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conexion;

public class UsuarioDao {
    Connection conectar; //objeto de conexión
    PreparedStatement ps; //objeto para sentencias preparadas
    ResultSet rs; //objeto para almacenar consultas
    String sql=null; //variable para guardar sentencias
    int r;//cantidad de filas que devuelve una sentencia

    public int register(UsuarioVo v) throws SQLException{
        sql="INSERT INTO Usuario(Nombre_Completo,Telefono,Correo,NomUsuario,Clave)  values(?,?,?,?,?)";
        try{
            conectar=Conexion.conectar();
            ps=conectar.prepareStatement(sql);
            ps.setString(1, v.getNombre());
            ps.setString(2, v.getTelefono()); 
            ps.setString(3, v.getCorreo());
            ps.setString(4, v.getNomUsuario());
            ps.setString(5, v.getContra());
            System.out.println(ps);
            ps.executeUpdate(); 
            ps.close();
            System.out.println("Se registro el usuario en la base de datos");
        }catch(Exception e){
            System.out.println("Error en el registro "+e.getMessage().toString());
        }
        finally{
            conectar.close();
        }
        return r;
    }

    public List<UsuarioVo> show() throws SQLException{
        List<UsuarioVo> usuario=new ArrayList<>();
        sql="SELECT * from Usuario";
        try{
            conectar=Conexion.conectar();
            ps=conectar.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                UsuarioVo ro=new UsuarioVo();
                ro.setId(rs.getInt("ID"));
                ro.setNombre(rs.getString("Nombre_Completo"));
                ro.setTelefono(rs.getString("Telefono"));
                ro.setCorreo(rs.getString("Correo"));
                ro.setNomUsuario(rs.getString("NomUsuario"));
                ro.setContra(rs.getString("Clave"));
                usuario.add(ro);
            }
            ps.close();
            System.out.println("consulta exitosa modelo");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            conectar.close();
        }
        return usuario;
    }

    public void delete(int ID) throws SQLException {
        sql="DELETE FROM Usuario WHERE ID="+ID;
        try {
            conectar=Conexion.conectar();
            ps=conectar.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            System.out.print("Se elimino el usuario exitosamente modelo");
        } catch (Exception e) {
            System.out.println("Error al eliminar registro "+e.getMessage().toString());
        }finally{
            conectar.close();
        }
    }

    public void update(int ID,String nombre, String telefono, String correo, String nomUsuario, String contra ) throws SQLException {
        sql="UPDATE `Usuario` SET `Nombre_Completo`='"+nombre+"',`Telefono`='"+telefono+"',`Correo`='"+correo+"',`NomUsuario`='"+nomUsuario+"',`Clave`='"+contra+"' WHERE ID="+ID;
        try {
            conectar=Conexion.conectar();
            ps=conectar.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            System.out.print("Se actualizo el usuario exitosamente modelo");
        } catch (Exception e) {
            System.out.println("Error al actualizar "+e.getMessage().toString());
        }finally{
            conectar.close();
        }
    }
}