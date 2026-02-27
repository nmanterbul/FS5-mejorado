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

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <form class="login" action="/gestion" method ="post">
            <div class="Titulo">
                 <p>Sign In</p>
            </div>

            <div class="Formulario">
                <div class="campo">
                    <label name="username">Usuario: </label>
                    <input type="text" name = "username">
                    <span>👤</span>
                    <br>
                </div>

                <div class="campo">
                    <label name = "pass">Contraseña: </label>
                    <input type="password" name = "pass">
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

    <#include "/templates/footer.ftl">

</body>
</html>