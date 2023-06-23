<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Registrarse</title>
        <link rel="stylesheet" href="CSS/style_InstaRegistro.css">
    </head>
    <body>
        <header>
        
        </header>

        <main>
            <form action="controller" class="con" method="post">
                <h2>Registrarse</h2>

                <label for="name">Nombre completo:</label>
                <br>
                <input type="text" id="name" name="name" required>
                <br>
                <label for="age">Edad:</label>
                <br>
                <input type="number" id="age" name="age" required>
                <br>
                <label for="email">Correo electrónico:</label>
                <br>
                <input type="email" id="email" name="email" required>
                <br>
                <label for="phone">Telefono:</label>
                <br>
                <input type="number" id="phone" name="phone" required>
                <br>
                <label for="Date">Fecha de Nacimiento:</label>
                <br>
                <input type="date" id="date" name="date" required>
                <br>
                <label for="username">Nombre de usuario:</label>
                <br>
                <input type="text" id="username" name="username" required>
                <br>
                <label for="password">Contraseña:</label>
                <br>
                <input type="password" id="password" name="password" required>
                <br>
                <input type="submit" class="boton" name="ubicacion" value="registrarseIn">
            </form>
        </main>

        <footer >       
            <h6 > CREADORES DEL SITIO:</h6>
            <div> <p>Daniel Fernando Diaz Buitrago </p></div>
            <div> <p> ©Todos los derechos reservados 2023</P></div>
          </footer>
    </body>
</html>