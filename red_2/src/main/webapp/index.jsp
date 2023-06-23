<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<HTMl>
    <head>
        <title>index</title>
        <link rel="stylesheet" href="CSS/style_index.css">
    </head>

    <body>
        <header>
            <nav class="navbar">
                <div class="logo">
                  <img src="IMG/Net_Social.PNG" alt="imagen" width="200px">
                </div>
            </nav>

            <form>
                <label class="lab" for="search">Buscar Red:</label>
                <input class="bus" type="text" id="search" name="search">
                <button type="submit" class="button2">Buscar</button>
                </form>
        </header>

        <main>
            <a class="container" href="usuario?ubicacion=loginI" >
                <img src="IMG/INSTA.png" alt="Imagen" height="200px" width="200px">
              </a>

              <a class="container2" href="usuario?ubicacion=loginT">
                <img src="IMG/twit.PNG" alt="Imagen" height="200px" width="200px">
              </a>
        </main>

        <footer >       
            <h6 > CREADORES DEL SITIO:</h6>
            <div> <p>Daniel Fernando Diaz Buitrago </p></div>
            <div> <p> ©Todos los derechos reservados 2023</P></div>
          </footer>
    </body>
</HTMl>