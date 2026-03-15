
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
            <form method="POST" action="/admin/crearJugador/${idTorneo}">
                <div class="Titulo">
                    <label for="jugadorName">NOMBRE DEL JUGADOR</label>
                    <input type="text" id="jugadorName" name="jugadorName">
                </div>
                <br>

                <br>
                    <div class="opciones">


                        <input type="radio" name="posicion" value="Portero">Portero

                        <input type="radio" name="posicion" value="Cierre">Cierre

                        <input type="radio" name="posicion" value="Ala">Ala

                        <input type="radio" name="posicion" value="Pivot">Pivot

                    </div>
                <br>

                <br>
                <div class="guardar">
                   <button type="submit">CREAR JUGADOR</button>
                </div>



            </form>
        </div>
    </div>

   <#include "/templates/footer.ftl">

</body>
</html>
