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
                <div class="titulo">
                    <label for="torneo">NOMBRE DEL EQUIPO</label>
                    <input type="text" name="torneo">
                </div>

                <div class="addOpcion">
                    <div class="botonGestion">
                        <a href="EquiposIndex.html">CAMBIAR ESCUDO</a>
                    </div>
                    <div class="foto">
                        <img src="/imgs/nofotolnfs.jpg" width="100px">
                    </div>
                    <div class="botonGestion">
                        <a href="ListaJugador.html">AÑADIR JUGADOR</a>
                    </div>
                    <div class="botonGestion">
                        <a href="ListaJugador.html">ELIMINAR JUGADOR</a>
                    </div>
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