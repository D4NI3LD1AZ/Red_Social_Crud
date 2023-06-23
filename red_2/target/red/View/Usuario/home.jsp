<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Inicio</title>
        <link rel="stylesheet" href="CSS/style_home.css">
    </head>
    <body>
        <header>
            <nav class="navbar">
                <div class="logo">
                  <img src="IMG/twit.PNG" alt="imagen" width="100px">
                </div>
                <div class="login">
                  <a href="usuario?ubicacion=index">Cerrar Sesion</a>
                </div>
                <div    >
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
            <div class="post">

          <h2>Bienvenido</h2>
    
          <div class="cont">
            <img src="../Assets/IMG/twit.PNG" alt="">
            <br>
            <label for="descripcion">Te damos bienvenida a nuestra red social espero que te guste y nos sigas utilizando para ver publicaciones y conoces mas gente
              En nuestra pagina podas ver y subir publicaciones para que tus amigos y otra gente pueda verlas
            </label>
            <br>
            <!--<textarea id="descripcion" name="descripcion"></textarea><br>-->
          </div>
  
          <button class="like-btn">Me gusta</button>
   
          <div class="like-count">0 Me gusta</div>
   
          </div>

          <div class="post">

            <h2>¿Que prefieres?</h2>
      
            <div class="cont">
              <img src="../Assets/IMG/twit.PNG" alt="">
              <br>
              <label for="descripcion"> Queremos saber que eligirias tu si estuvieras en esta situacion. Si estas con tus amigos 
                y van a un restaurante prefiririas pedir una ensalada verde y agua o preferirias pedirte una hamburguesa con doble carne y parapas a la francesa acompañada con una rica gaseosa
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