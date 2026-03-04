<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BorrarTorneo</title>
    <link rel="stylesheet"  type="text/css" href="/css/borrarTorneo.css"/>
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
                    <a href="gestionTorneos">ELIMINAR </a>
                    <span></span>
                </div>
            </form>
        </div>
    </div>


      <#include "/templates/footer.ftl">
</body>
</html>