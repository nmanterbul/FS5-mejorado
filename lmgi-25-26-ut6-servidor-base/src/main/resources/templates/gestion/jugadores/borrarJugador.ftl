
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
        <table>

            <form method="POST" action="/admin/borrarJugador/{idJugador}">

                <#list listaJugadores as jugador>
                <tr>
                <td>
                    ${jugador.idJugador}
                </td>
                <td>
                    <div class="Titulo">
                        <input type="radio" id="jugadorName" name="jugadorName">
                        <label for="jugadorName">${jugador.jugadorName}</label>
                    </div>
                </td>

                    <br>
                    <br>
                </tr>
                    <div class="eliminar">
                         <button type="submit">ELIMINAR</button>
                    </div>
            </form>
        </div>
    </div>

   <#include "/templates/footer.ftl">

</body>
</html>
