<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/listarJugadores.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <div class="formulario">
            <form method="GET" action="/">
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
                    <a href="/listaJugadores/1">AÑADIR JUGADOR</a>
                    <br>
                    </div>
                    <div class="botonGestion">
                        <a href="/listaJugadores/1">ELIMINAR JUGADOR</a>
                        <br>
                    </div>
                </div>


                <br>
                <div class="opciones">
                    <#list listaEquipos as equipo>
                        <div class="equipo-item">
                            <label for="equipo_${equipo.idEquipo}"><img src="/img/Persona.jpg" width="40px"> ${equipo.equipoName} </label>
                            <input type="radio" name="idEquipo" id="equipo_${equipo.idEquipo}" value="${equipo.idEquipo}">
                        </div>
                    </#list>
                </div>

                <div class="guardar">
                    <a href="OpcionesDeEquipo">GUARDAR CAMBIOS</a>
                </div>



            </form>
        </div>
    </div>


    <#include "/templates/footer.ftl">

</body>
</html>