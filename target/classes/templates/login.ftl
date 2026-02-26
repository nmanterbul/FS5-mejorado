<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="/login.css">


</head>
<body>

    <!--CABECERA-->
    <div class="cabecera">
        <div class="backButton"><a href="index.html"><img src="doc/img/backButton.png" alt=""></a></div>
        <div><h1>FS5</h1></div>
        <div class="logo"><img src="/img/LOGOFS5.jpg" alt=""></div>
    </div>


<div class="contenedor">

    <form class="login-form" action="/gestion">
        <div class="Titulo">
             <p>Sign In</p>

        </div>


        <br>
        <div class="Formulario">
            <div class="campo">
                <label name="Usuario">Usuario: </label>
                <input type="text" >
                <span>👤</span>
                <br>
            </div>

            <div class="campo">
                <label>Contraseña: </label>
                <input type="password">
                <span>🔒</span>
            </div>
            <br>


        </div>
         <div class="Login">
            <input name="Login" type="submit" value="Login">
        </div>
    </form>
</div>
<br>

    <!--PIE-->
    <div class="pie">
        <div class="copy">
            <span>COPYRIGHT</span>
            <div  class="content"><span>© 2026 FS5. Todos los derechos reservados.</span></div>
        </div>
        <div class="contacto">
            <span>CONTACTO</span>
            <div class="content"><span>📧 contacto@FS5.com</span></div>
            <div class="content"><span>📞 +34 900 123 456</span></div>
        </div>
        <div class="rrss">
            <span>REDES SOCIALES</span>
            <div  class="content"><img src="/img/insta.jpg" alt=""><img src="/img/X.png" alt=""><img src="/img/Youtube.png" alt=""></div>
        </div>
    </div>
</body>
</html>