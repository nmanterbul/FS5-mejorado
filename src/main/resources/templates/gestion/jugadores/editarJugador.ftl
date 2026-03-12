
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
            <form method="POST" action="/editarJugador/ jugador.idJugador">
                <input type="hidden">

                <div class="Titulo">
                 <#list listaJugadores as jugador>
                    <label for="jugadorName">NOMBRE DEL JUGADOR</label>
                    <input type="text" name="jugadorName" id="jugadorName" value="${jugador.jugadorName}">

                    <label for="posicion">POSICION DEL JUGADOR</label>
                    <input type="text" name="posicion" id="posicion" value="${jugador.posicion}">

                 </#list>
                </div>
                <div>

                    <br>
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
                    <button type="submit">GUARDAR CAMBIOS</button>
                </div>



            </form>
        </div>
    </div>

  <#include "/templates/footer.ftl">

</body>
</html>
