
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
<form action="GET" action="/paginaEnProceso">
    <#list listaTorneos as torneo>
        <div class="añadirOpcion">
            <div class="torneo-item">
                <label for="torneo_${torneo.idTorneo}"> ${torneo.torneoName} </label>
                <input type="radio" name="idTorneo" id="torneo_${jugador.idTorneo}" value="${torneo.idTorneo}">
            </div>
        </div>
    </#list>
    <div class="añadir">
    <button type="submit">EDITAR</button>
    </div>
</from>

<#include "/templates/footer.ftl">

</body>
</html>