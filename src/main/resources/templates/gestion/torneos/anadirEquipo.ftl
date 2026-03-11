
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/añadirEquipo.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">



<h2>Añadir equipos al torneo:${torneo.torneoName} </h2>
<form action="/torneos/${torneo.idTorneo}/equipos" method="POST">
    <label for="idEquipo">Seleccion un equipo:</label>
    <select id="idEquipo" name="idEquipo" required>
        <#list listaEquipos as equipo>
            <option value="${equipo.idEquipo}">
                ${equipo.equipoName}
            </option>
        </#list>
    </select>
    <button type="submit">Añadir equipo</button>
</form>

<#include "/templates/footer.ftl">

</body>
</html>
