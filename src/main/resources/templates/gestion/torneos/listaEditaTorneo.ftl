
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/crearTorneo.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

<#include "/templates/cabecera.ftl">

<#list listaTorneos as torneo>
    <div class="añadirOpcion">
        <div class="botonGestion">
            <a href="/anadirEquipo/${torneo.idTorneo}">AÑADIR EQUIPO</a>
        </div>

        <div class="botonGestion">
            <a href="/eliminarEquipo/${torneo.idTorneo}"> ELIMINAR EQUIPO</a>
        </div>

    </div>
</#list>

<#include "/templates/footer.ftl">

</body>
</html>