<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/login.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "cabecera.ftl">

    <div class="contenedor">

        <form class="login" action="/gestion" type ="post">
            <div class="Titulo">
                 <p>Sign In</p>
            </div>

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

    <#include "footer.ftl">

</body>
</html>