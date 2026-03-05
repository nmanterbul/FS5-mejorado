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
                    <label for="TORNEO">TORNEOS</label>
                </div>

                <br>
                <div class="opciones">
                    <label for="torneo">LIGA </label>
                     <input type="radio" name="torneo">
                    <label for="torneo"> PLAY OFF TÍTULO</label>
                    <input type="radio" name="torneo">
                    <label for="torneo"> PLAY OFF ASCENSO </label>
                    <input type="radio" name="torneo">


                </div>

                <div class="eliminar">
                    <a href="OpcionesDeGestión.html">ELIMINAR </a>
                    <span></span>
                </div>
            </form>
        </div>
    </div>


    <#include "/templates/footer.ftl">

</body>
</html>