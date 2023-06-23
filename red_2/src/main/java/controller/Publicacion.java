package controller;

import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.publicacion.PublicacionDao;
import model.publicacion.PublicacionVo;

public class Publicacion extends HttpServlet {
      
      PublicacionVo p = new PublicacionVo();
      PublicacionDao pd=new PublicacionDao();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String accion=req.getParameter("accion");
            System.out.println(accion);
            switch(accion){
                  case"consultarP":
                  mostrar(req, resp);
                        break;
            }
    }
      private void mostrar(HttpServletRequest req, HttpServletResponse resp) {
            try {
                  List<PublicacionVo> arrayPublicacion =pd.tolist();
                  req.setAttribute("publi", arrayPublicacion);
                  req.getRequestDispatcher("View/Publicacion/ConsultarP.jsp").forward(req, resp);
                  System.out.println("Datos listados correctamente");
                  
              } catch (Exception e) {
                  System.out.println("Hay problemas al listar los datos"+e.getMessage().toString());
              }
      }


protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String accion=req.getParameter("accion");
      System.out.println(accion);
      switch (accion) {
          case "agregar":
            agregar(req,resp);  
          break;
          case "eliminar":
            eliminar(req, resp);
          break;
          default:
              break;
      }
    }

      
      private void agregar(HttpServletRequest req, HttpServletResponse resp) {
            if (req.getParameter("titulo")!=null ) {
                  p.setTitulo((req.getParameter("titulo"))); 
            }
            if (req.getParameter("descripcion")!=null ) {
                  p.setDescripcion((req.getParameter("descripcion"))); 
            }
            if (req.getParameter("imagen")!=null ) {
                  p.setImagen((req.getParameter("imagen"))); 
            }
              try {
                  pd.Register(p);
                  req.getRequestDispatcher("View/Usuario/home.jsp").forward(req, resp);
                  System.out.println("Se registraron los datos en el controlador");
              } catch (Exception e) {
                  System.out.println("Error en la insercción del registro");
              }
      }
      private void eliminar(HttpServletRequest req, HttpServletResponse resp) {
            
            if (req.getParameter("IdPEliminar")!= null ) {
                  p.setIdP(Integer.parseInt(req.getParameter("IdPEliminar")));
            }
            try {
                  pd.deleteP(p.getIdP());
                  req.setAttribute("proceso",true);
                  resp.sendRedirect("genero?accion=listarPublicaciones");
                  System.out.println("Rol eliminado");
            } catch (Exception e) {
                  req.setAttribute("msg","No se puede eliminar el registro "+e.getMessage());
                 System.out.println("No se puede eliminar el registro"+e.getMessage());
            }
      }
}

