
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/anadirEquipo.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

<h2>Añadir equipos al torneo:${torneo.torneoName} </h2>
<form action="/torneos/${torneo.idTorneo}/equipos" method="POST">

    <label for="idEquipo">Selecciona un equipo:</label>
    <select id="idEquipo" name="idEquipo" required>

        <#list listaEquipos as equipo>
            <div class="lista-equipos">
                <label for="equipo_${equipo.idEquipo}" class="equipo-label">
                    <span class="nombre-equipo">
                        ${equipo.equipoName}
                    </span>
                </label>
                <input type="radio" name="idEquipo" id="equipo_${equipo.idEquipo}" value="${equipo.idEquipo}">
            </div>
        </#list>

    </select>
    <button type="submit">Añadir equipo</button>
</form>

<#include "/templates/footer.ftl">

</body>
</html>
