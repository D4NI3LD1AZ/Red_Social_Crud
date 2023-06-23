<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Consultar</title>
        <link rel="stylesheet" href="CSS/style_consultar.css">
    </head>
    <body>
        <header>
            <nav class="navbar">
                <div class="logo">
                    <img src="IMG/twit.PNG" alt="imagen" width="100px">
                </div>
                
                <div>
                    <ul class="list">
                        <li><a href="usuario?ubicacion=homeT">Inicio</a></li>
                        <li><a href="usuario?ubicacion=usuarioT">Usuario</a></li>
                        <li><a href="usuario?ubicacion=consultarT">Consultar Usuarios</a></li>
                        <li><a href="publicacion?accion=consultarP">Consultar Publicacion</a></li>
                      </ul>
                </div>
            </nav>
        </header>

        <main>
                <table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Titulo</th>
                            <th>Decripcion</th>
                            <th>Imagen</th>
                            <th>Operaciones</th>
                        </tr>
                    </thead>
                
                    <tbody>
                        <c:forEach var="Publicacion" items="${publi}">
                            <tr>
                                <td>${Publicacion.getIdP()}</td>
                                <td>${Publicacion.getTitulo()}</td>
                                <td>${Publicacion.getDescripcion()}</td>
                                <td>${Publicacion.getImagen()}</td>
                                
                                <td>
                                    <form action="usuario" method="post">
                                    <input type="hidden" name="id" value="${dato.getId()}">
                                    <input type="submit" name="ubicacion" value="eliminar">
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
        </main>

        <footer >       
            <h6 > CREADORES DEL SITIO:</h6>
            <div> <p>Daniel Fernando Diaz Buitrago </p></div>
            <div> <p> ©Todos los derechos reservados 2023</P></div>
          </footer>
    </body>
</html>