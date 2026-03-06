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
        <form class="login" action="admin/gestion" method ="post">
            <div class="titulo">
                 <p>Sign In</p>
            </div>
            <div class="formulario">
                <div class="campo">
                    <label name="username">Usuario: </label>
                    <input type="text" name = "username">
                    <span>👤</span>
                </div>
                <div class="campo">
                    <label name = "pass">Contraseña: </label>
                    <input type="password" name = "pass">
                    <span>🔒</span>
                </div>
            </div>
            <div class="login">
                <input name="login" type="submit" value="LOGIN">
            </div>
        </form>
    </div>

    <#include "/templates/footer.ftl">

</body>
</html>