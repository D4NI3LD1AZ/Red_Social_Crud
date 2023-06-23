package controller;

import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.usuario.UsuarioDao;
import model.usuario.UsuarioVo;

public class Usuario extends HttpServlet {
      
      UsuarioVo r=new UsuarioVo();
      UsuarioDao rd=new UsuarioDao();
      @Override
      protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
            String ubicacion=req.getParameter("ubicacion");
            System.out.println(ubicacion);
            switch(ubicacion){
                  case"consultarT":
                  listar(req, resp);
                        break;
                  case"registrarseT":
                  req.getRequestDispatcher("View/Usuario/Registrarse.jsp").forward(req, resp);      
                        break;
                  case"loginT":
                  req.getRequestDispatcher("View/Usuario/Login.jsp").forward(req, resp);      
                        break;
                  case"actualizar":
                  req.getRequestDispatcher("View/Usuario/Actualizar.jsp").forward(req, resp);      
                        break;
                  case "homeT":
                  req.getRequestDispatcher("View/Usuario/home.jsp").forward(req, resp);
                        break;
                  case "usuarioT":
                  req.getRequestDispatcher("View/Publicacion/Usuario.jsp").forward(req, resp);
                        break;
                   
                  case "index":
                  req.getRequestDispatcher("index.jsp").forward(req, resp);
                        break;
                  
                  case"registrarseI":
                  req.getRequestDispatcher("View/Usuario_ins/Registrar_Insta.jsp").forward(req, resp);      
                        break;
                  case"loginI":
                  req.getRequestDispatcher("View/Usuario_ins/Login_Insta.jsp").forward(req, resp);      
                        break;
                  case"actualizarI":
                  req.getRequestDispatcher("View/Usuario/Actualizar.jsp").forward(req, resp);      
                        break;
                  case "homeI":
                  req.getRequestDispatcher("View/Usuario_ins/home_Insta.jsp").forward(req, resp);
                        break;

            }
                   
      
      }
      private void listar(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
            try {
                  List<UsuarioVo> ArrayUsuarios=rd.show();
                  req.setAttribute("datos", ArrayUsuarios);
                  System.out.println("Se listaron los usuarios controlador");
                  req.getRequestDispatcher("View/Usuario/ConsultarU.jsp").forward(req, resp);
            } 
            catch (Exception e) {
                  System.out.println("No se listar los usuarios "+e.getMessage().toString());
            }
      }

      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String ubicacion=req.getParameter("ubicacion");
            System.out.println(ubicacion);
            switch (ubicacion) {
                  case"loginTin":
                  req.getRequestDispatcher("View/Usuario/home.jsp").forward(req, resp);
                        break;
                  case "registrarse":
                  registrar(req,resp);
                        break;
                  case "eliminar":
                  eliminar(req, resp);
                        break;
                  case "Actualizar Usuario":
                  actualizar(req, resp);
                        break;
                  default:
                        break;
            }
      }

      private void registrar(HttpServletRequest req, HttpServletResponse resp) {
            if (req.getParameter("nombre")!=null ) {
                  r.setNombre(req.getParameter("nombre"));
            }
            if (req.getParameter("correo")!=null) {
                  r.setCorreo(req.getParameter("correo"));
            }
            if (req.getParameter("telefono")!=null) {
                  r.setTelefono(req.getParameter("telefono"));
            }
            if (req.getParameter("nomUsuario")!=null) {
                  r.setNomUsuario(req.getParameter("nomUsuario"));
            }
            if (req.getParameter("contra")!=null) {
                  r.setContra(req.getParameter("contra"));
            }
            try {
                  rd.register(r);
                  req.getRequestDispatcher("View/Usuario/Login.jsp").forward(req, resp);
                  System.out.println("Se registraron los datos en el controlador");
            } 
            catch (Exception e) {
                  System.out.println("Error en la insercción del registro");
            }
      }

      private void eliminar(HttpServletRequest req, HttpServletResponse resp) {
            if (req.getParameter("id")!=null) {
                  r.setId(Integer.parseInt(req.getParameter("id")));
            }
            try {
                  rd.delete(r.getId());
                  resp.sendRedirect("usuario?ubicacion=consultarT");
                  System.out.println("Se elimino correctamente el usuario controlador");
            } 
            catch (Exception e) {
                  System.out.println("No se puede eliminar el registro"+e.getMessage());
            }
      }

      private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
            if (req.getParameter("id")!=null) {
                  r.setId(Integer.parseInt(req.getParameter("id")));
            }
            if (req.getParameter("nombre")!=null) {
                  r.setNombre(req.getParameter("nombre"));
            }
            if (req.getParameter("telefono")!=null) {
                  r.setTelefono((req.getParameter("telefono")));
            }
            if (req.getParameter("correo")!=null) {
                  r.setCorreo(req.getParameter("correo"));
            }
            if (req.getParameter("nomUsuario")!=null) {
                  r.setNomUsuario(req.getParameter("nomUsuario"));
            }
            if (req.getParameter("contra")!=null) {
                  r.setContra(req.getParameter("contra"));
            }
            try {
                  rd.update(r.getId(), r.getNombre() , r.getTelefono(), r.getCorreo(), r.getNomUsuario(), r.getContra());
                  resp.sendRedirect("usuario?ubicacion=consultarT");
                  System.out.println("Información actualizada exitosamente controlador");
            } 
            catch (Exception e) {
                  System.out.println("No se puede actualizar el registro"+e.getMessage());
            }
      }
}
