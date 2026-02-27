<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/crearGestion.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">


    <div class="contenedor">
        <div class="formulario">
            <form>
                <div class="Titulo">
                    <label for="TORNEO"> JUGADORES</label>
                </div>
                <div>
                    <br>
                    <input type="text" name="TORNEO">
                </div>
                <br>
                <br>
                <div class="opciones">
                     <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Persona.jpg" width="40px"> Pablo García </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Persona.jpg" width="40px"> Pablo García </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Persona.jpg" width="40px"> Pablo García </label>
                </div>
                <div class="eliminar">
                     <a href="OpcionesDeJugadores.html">ELIMINAR</a>
                </div>
            </form>
        </div>
    </div>

   <#include "/templates/footer.ftl">

</body>
</html>