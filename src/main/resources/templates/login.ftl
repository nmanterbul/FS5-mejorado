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

    <div class="login">
        <form>
            <div class="Titulo">
                 <p>Sign In</p>
            </div>

            <br>
            <div class="Formulario">
                <div class="Usuario">
                    <label name="Usuario">Usuario: </label>
                    <input type="text" >
                    <img src="img/Foto Usuario.png" width="100px">
                    <br>
                </div>
                <div class="Contraseña">
                    <label>Contraseña: </label>
                    <input type="password">
                    <img src="img/Foto Contraseña.png" width="50px">
                </div>
                <br>

            </div>
             <div class="Login">
                <input name="Login" type="submit" value="Login">
            </div>

        </form>
    </div>

    <#include "footer.ftl">

</body>
</html>