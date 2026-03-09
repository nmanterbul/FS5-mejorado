<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/editarJugador.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <div class="formulario">
            <form>
                <div class="Titulo">
                    <label for="TORNEO">NOMBRE DEL JUGADOR</label>
                </div>
                <div>
                    <br>
                    <input type="text" name="TORNEO">
                </div>

                <br>
                <div class="añadirOpcion">
                    <div class="botonGestion">
                         <a href="/equiposIndex">CAMBIAR FOTO</a>
                    </div>

                </div>

                <br>

                <div class="foto">
                    <img src="/img/Persona.jpg" width="100px">
                </div>


                <div class="guardar">
                    <a href="/gestionJugadores">GUARDAR CAMBIOS</a>
                </div>



            </form>
        </div>
    </div>

  <#include "/templates/footer.ftl">

</body>
</html>