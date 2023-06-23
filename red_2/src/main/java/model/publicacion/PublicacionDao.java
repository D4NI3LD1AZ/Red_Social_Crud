package model.publicacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Conexion;

public class PublicacionDao {
     //Atributos para realizar operaciones sobre la base de datos
     Connection conectar; //Objeto de conexión
     PreparedStatement ps; //Preparar las sentencias
     ResultSet rs; //objeto para almacenar consultas
     String sql=null; //variable para guardar sentencias
     int r;//cantidad de filas que devuelve una sentencia
    // 
    public int Register(PublicacionVo v) throws SQLException {
        //consulta preparada
        sql="INSERT INTO Publicacion( `Titulo`, `Descripcion`, `Imagen`) values (?,?,?)";
        try {
            conectar=Conexion.conectar();//abrir conexion
            //preparar sentencia
            ps=conectar.prepareStatement(sql);
            ps.setString(1, v.getTitulo());
            ps.setString(2, v.getDescripcion());
            ps.setString(3, v.getImagen());
            System.out.println(sql);
            ps.executeUpdate();

            ps.close(); //cerrar sentencia
            System.out.println("Se registro en la base de datos");
        } catch (Exception e) {//definicion de objeto
            System.out.println("Error en el registro "+e.getMessage().toString());
        }
        finally{
            conectar.close();//cerrando conexion
        }
        return r;
    }
    

    public List<PublicacionVo> tolist() throws SQLException {
        // arraylist-almacena datos en memoria-guardar de manera diferente,forma dinamica
        List<PublicacionVo> ListaP= new ArrayList<>();
        sql="SELECT * FROM Publicacion";
        try {
            conectar=Conexion.conectar();
            ps=conectar.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while (rs.next()) {
               PublicacionVo row = new PublicacionVo();
               //Escribir en el setter de cada valor encontrado
               row.setTitulo(rs.getString("titulo")); 
               row.setDescripcion(rs.getString("descripcion")); 
               row.setImagen(rs.getString("imagen"));
               
               ListaP.add(row);
            }
            ps.close();
            System.out.println("Consulta Exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutada"+e.getMessage().toString());
        } finally{
            conectar.close();
        }
        return ListaP;
    }
    public void deleteP(int Id_Pub) throws SQLException {
        sql="DELETE FROM Publicacion WHERE Id_Pub="+Id_Pub;
        try {
            conectar=Conexion.conectar();
            ps=conectar.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            System.out.print("Se elimino el rol exitosamente");

        } catch (Exception e) {
            System.out.println("Error al eliminar registro "+e.getMessage().toString());
        }finally{
            conectar.close();
        }
    
    }
    
}
