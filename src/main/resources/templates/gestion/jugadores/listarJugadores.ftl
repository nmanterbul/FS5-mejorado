<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ListaJugadores</title>

    <link rel="stylesheet"  type="text/css" href="/css/listarJugador.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>
   <#include "/templates/cabecera.ftl">
    <div class="contenedor">

        <div class="formulario">
            <form method="GET" action="/editarJugador">
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
                    <#list listaJugadores as jugador>
                        <div class="jugador-item">
                            <label for="jugador_${jugador.idJugador}"><img src="/img/Persona.jpg" width="40px"> ${jugador.jugadorName} </label>
                            <input type="radio" name="idJugador" id="jugador_${jugador.idJugador}" value="${jugador.idJugador}">

                        </div>
                    </#list>
                </div>
                <div class="añadir">
                    <button type="submit">AÑADIR</button>
                </div>
            </form>
        </div>
    </div>
</body>