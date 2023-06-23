<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Registrarse</title>
        
        <link rel="stylesheet" href="CSS/style_registro.css">
    </head>
    <body>
        <header>
        </header>

        <main>
            <form class="con" action="usuario" method="post">
                <h2>Actualizar</h2>
                <label for="id">Id Usuario:</label>
                <br>
                <input type="number" id="id" name="id" required>
                <br>
                <label for="name">Nombre completo:</label>
                <br>
                <input type="text" id="name" name="nombre" required>
                <br>
                <label for="phone">Telefono:</label>
                <br>
                <input type="number" id="phone" name="telefono" required>
                <br>
                <label for="email">Correo electrónico:</label>
                <br>
                <input type="email" id="email" name="correo" required>
                <br>
                <label for="username">Nombre de usuario:</label>
                <br>
                <input type="text" id="username" name="nomUsuario" required>
                <br>
                <label for="password">Contraseña:</label>
                <br>
                <input type="password" id="password" name="contra" required>
                <br>
                <input type="submit" class="boton" name="ubicacion" value="Actualizar Usuario">
            </form>
        </main>
        <footer >       
            <h6 > CREADORES DEL SITIO:</h6>
            <div> <p>Daniel Fernando Diaz Buitrago </p></div>
            <div> <p> ©Todos los derechos reservados 2023</P></div>
          </footer>
    </body>
</html>