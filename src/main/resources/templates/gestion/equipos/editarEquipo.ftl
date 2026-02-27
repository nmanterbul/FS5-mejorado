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
                    <label for="TORNEO">NOMBRE DEL EQUIPO</label>
                </div>
                <div>
                    <br>
                    <input type="text" name="TORNEO">
                </div>

                <br>
                <div class="añadirOpcion">
                    <div class="botonGestion">
                    <a href="ListaJugador.html">AÑADIR JUGADOR</a>
                    <br>
                    </div>
                    <div class="botonGestion">
                        <a href="ListaJugador.html">ELIMINAR JUGADOR</a>
                        <br>
                    </div>
                </div>


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

                <div class="guardar">
                    <a href="OpcionesDeEquipo.html">GUARDAR CAMBIOS</a>
                </div>



            </form>
        </div>
    </div>


    <#include "/templates/footer.ftl">

</body>
</html>