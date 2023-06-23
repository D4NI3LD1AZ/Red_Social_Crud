/*import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        String ubicacion=req.getParameter("ubicacion");
        System.out.println(ubicacion);

        switch(ubicacion){
            //Twitter
            case "loginT":
            req.getRequestDispatcher("View/Login.jsp").forward(req, resp);
            break;
            case "registrarseT":
            req.getRequestDispatcher("View/Registrarse.jsp").forward(req, resp);
            break;
            case "homeT":
            req.getRequestDispatcher("View/home.jsp").forward(req, resp);
            break;
            case "buscarT":
            req.getRequestDispatcher("View/BuscarU.jsp").forward(req, resp);
            break;
            case "usuarioT":
            req.getRequestDispatcher("View/Usuario.jsp").forward(req, resp);
            break;
            case "consultarT":
            req.getRequestDispatcher("View/ConsultarU.jsp").forward(req, resp);
            break;
            //Para los dos
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            //Instagram
            case "loginI":
            req.getRequestDispatcher("View/Login_Insta.jsp").forward(req, resp);
            break;
            case "registrarseI":
            req.getRequestDispatcher("View/Registrar_Insta.jsp").forward(req, resp);
            break;
            case "homeI":
            req.getRequestDispatcher("View/home_Insta.jsp").forward(req, resp);
            break;
            case "buscarI":
            req.getRequestDispatcher("View/Buscar_Amigo.jsp").forward(req, resp);
            break;
            default:
            System.out.println("No se capturó el servlet");
            break;
        }
    }

}*/