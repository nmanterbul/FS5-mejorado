<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="/css/login.css">


</head>
<body>

<div>
    <form class ="login" action="/gestion" method="POST">
        <div class="Titulo">
             <p>Sign In</p>
        </div>

        <br>
        <div class="Formulario">
            <div class="Usuario">
                <label name="username">Usuario: </label>
                <input type="text" name="username">
                <img src="img/Foto Usuario.png" width="100px">
                <br>
            </div>

            <div class="Contraseña">
                <label name="pass">Contraseña: </label>
                <input type="password" name="pass">
                <img src="img/Foto Contraseña.png" width="50px">
            </div>
            <br>
        </div>
         <div class="Login">
            <input type="submit" value="Login">
        </div>
    </form>
</div>
</body>
</html>