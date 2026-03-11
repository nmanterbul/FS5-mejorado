<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" href="/public/tablaJornadas.css">
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>
<#include "/templates/cabecera.ftl">

<!-- MENU NAVEGACION -->
    <div class="menu-tabla">
        <a href="/tablaJornadas/1/6" class="menu-item activo"> JORNADAS </a>
        <a href="/tablaClasificacion/1" class="menu-item"> CLASIFICACIÓN </a>
        <a href="/tablaGoleadores/1" class="menu-item"> TABLA DE GOLEADORES </a>
    </div>

<#list listaPartidos as partido>
    <h2>JORNADA ${idJornada}</h2>

<table class="tabla-jornadas">
    <tr>

        <!-- Equipo Local -->
        <td class="equipo">
            <a href="/equipo/${partido.equipoLocal}">
                <img src="imgs/${partido.equipoLocal}" alt="${partido.equipoLocal}">
                <span>${partido.equipoLocal}</span>
            </a>
        </td>

        <!-- Resultado -->
        <td class="resultado">
            ${partido.golesLocal} - ${partido.golesVisitante}
        </td>

        <!-- Equipo Visitante -->
        <td class="equipo">
            <a href="/equipo/${partido.equipoVisitante}">
                <span>${partido.equipoVisitante}</span>
                <img src="imgs/${partido.equipoVisitante}" alt="${partido.equipoVisitante}">
            </a>
        </td>

    </tr>

</table>
</#list>
<#include "/templates/footer.ftl">

</body>
</html>