<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Buscar</title>
        <link rel="stylesheet" href="CSS/style_buscar.css">
    </head>
    <body>
        <header>
            <nav class="navbar">
                <div class="logo">
                    <img src="IMG/twit.PNG" alt="imagen" width="100px">
                </div>

                <div class="login">
                    <a href="controller?ubicacion=index">Cerrar Sesion</a>
                    <a href="controller?ubicacion=registrarseT">Registrarse</a>
                </div>
                
                <div    >
                    <ul class="list">
                        <li><a href="controller?ubicacion=homeT">Inicio</a></li>
                        <li><a href="controller?ubicacion=buscarT">Buscar Usuario</a></li>
                        <li><a href="controller?ubicacion=usuarioT">Usuario</a></li>
                        <li><a href="controller?ubicacion=consultarT">Consultar Usuarios</a></li>
                    </ul>
                </div>
            </nav>
        </header>

        <main>
            <form>
              <label class="lab" for="search">Buscar:</label>
              <input class="bus" type="text" id="search" name="search">
              <button type="submit" class="button2">Buscar</button>
              </form>
        </main>

        <footer >       
            <h6 > CREADORES DEL SITIO:</h6>
            <div> <p>Daniel Fernando Diaz Buitrago </p></div>
            <div> <p> ©Todos los derechos reservados 2023</P></div>
          </footer>
    </body>    
</html>