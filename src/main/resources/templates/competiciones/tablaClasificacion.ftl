<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" href="/public/tablaClasificacion.css">
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>

<#include "/templates/cabecera.ftl">

<!-- MENU NAVEGACION -->
<div class="menu-tabla">
    <a href="/tablaJornadas/1/6" class="menu-item"> JORNADAS </a>
    <a href="/tablaClasificacion/1" class="menu-item activo"> CLASIFICACIÓN </a>
    <a href="/tablaGoleadores/1" class="menu-item"> TABLA DE GOLEADORES </a>
</div>

<div class="tabla-container">

    <table class="tabla-clasificacion">

        <#list listaEquipos as equipo>
        <tr>

            <td class="posicion">
                ${equipo.posicion}
            </td>

            <td class="logo">
                <a href="/equipo/${equipo.idEquipo}">
                    <img src="imgs/${equipo.equipoName}" alt="">
                </a>
            </td>

            <td class="nombre">
                <a href="/equipo/${equipo.equipoName}">
                    ${equipo.equipoName}
                </a>
            </td>

            <td class="puntos">
                ${equipo.cantidadPuntos}
            </td>

        </tr>
        </#list>

    </table>

    <div class="leyenda">

        <div class="playoff">
            PLAY-OFF
        </div>

        <div class="segura">
            ZONA SEGURA
        </div>

        <div class="descenso">
            A 2ª
        </div>

    </div>

</div>

<#include "/templates/footer.ftl">

</body>
</html>