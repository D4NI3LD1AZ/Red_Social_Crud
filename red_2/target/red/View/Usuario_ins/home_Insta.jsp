<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Inicio</title>
        <link rel="stylesheet" href="CSS/style_insta_home.css">
    </head>
    <body>
        <header>
            <nav class="navbar">
                <div class="logo">
                  <img src="IMG/INSTA.png" alt="imagen" width="100px">
                </div>

                <div class="login">
                  <a href="controller?ubicacion=index">Cerrar Sesion</a>
                  <a href="controller?ubicacion=registrarseI">Registrarse</a>
                </div>
                
                <div    >
                    <ul class="list">
                        <li><a href="controller?ubicacion=homeI">Inicio</a></li>
                        <li><a href="controller?ubicacion=buscarI">Buscar Amigo</a></li>
                    </ul>
                </div>
            </nav>
        </header>
        
        <main>
            <div class="post">

          <h2>Bienvenido</h2>
    
          <div class="cont">
            <img src="../Assets/IMG/INSTA.png" alt="">
            <br>
            <label for="descripcion">Te damos bienvenida a nuestra red social, somos una red social principalmente visual, donde un usuario
            puede publicar fotos y videos de corta duración, aplicarles efectos y también interactuar con las publicaciones de otras personas, a través de comentarios y me gusta.
            </label>
            <br>
            <!--<textarea id="descripcion" name="descripcion"></textarea><br>-->
          </div>
  
          <button class="like-btn">Me gusta</button>
   
          <div class="like-count">0 Me gusta</div>
   
          </div>
    
            <script>
            const likeBtn = document.querySelector('.like-btn');
            const likeCount = document.querySelector('.like-count');
            let likes = 0;    
                likeBtn.addEventListener('click', () => {
                  likes++;
                  likeCount.textContent = `${likes} Me gusta`;
                });

              </script>
        </main>

        <footer >       
            <h6 > CREADORES DEL SITIO:</h6>
            <div> <p>Daniel Fernando Diaz Buitrago </p></div>
            <div> <p> ©Todos los derechos reservados 2023</P></div>
          </footer>
    </body>
</html>