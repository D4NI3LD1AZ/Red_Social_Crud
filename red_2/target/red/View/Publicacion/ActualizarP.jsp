<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>Usuario</title>
        <link rel="stylesheet" href="../../CSS/style_usuario.css">
        <link rel="stylesheet" href="">
    </head>
    <body>
        <header>
            <nav>
                <div class="logo">
                    <img src="IMG/twit.PNG" alt="imagen" width="100px">
                </div>
            </nav>
        </header>

        <main>
            <h1>Subir publicación</h1>
	<form action="controller" method="post">
		<label for="titulo">Título:</label>
		<input type="text" id="titulo" name="titulo"><br>

		<label for="descripcion">Descripción:</label>
		<textarea id="descripcion" name="descripcion"></textarea><br>

		<label for="imagen">Imagen:</label>
		<input type="file" id="imagen" name="imagen"><br>

		<button type="submit" name="ubicacion" value="usuarioTin">Actualizar publicación </button>
	</form>
        </main>

        <footer >       
            <h6 > CREADORES DEL SITIO:</h6>
            <div> <p>Daniel Fernando Diaz Buitrago </p></div>
            <div> <p> ©Todos los derechos reservados 2023</P></div>
          </footer>
    </body>
</html>