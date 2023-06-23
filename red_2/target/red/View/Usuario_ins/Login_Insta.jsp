<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="es" lang="¿?">
<head>
    <title>Formulario Login</title>
    <link rel="stylesheet" href="CSS/style_login_Insta.css">
</head>

<body>
    <header>
        <div class="logo">
            <img src="IMG/INSTA.png" alt="imagen" width="120px">
                </div>
    </header>

    <main>
       <form action="controller" method="post">
        <div class="login-form">
            <h1>Iniciar sesión</h1>
            <input type="text" placeholder="Nombre de usuario" required>
            <input type="password" placeholder="Contraseña" required>
            <button type="submit" name="ubicacion" value="loginIn">Iniciar Sesión</button>

            <a class="al" href="controller?ubicacion=registrarseI">¿No tienes cuenta? Registrate</a>
            <a class="al" href="controller?ubicacion=index">Volver a la página principal</a>
        </div> 
       </form>
    </main>
</body>
</html>