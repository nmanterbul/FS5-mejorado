<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" type="text/css" href="/css/tablaJornadas.css">
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

    <#assign jornadaAnterior = idJornada - 1>
    <#assign jornadaSiguiente = idJornada + 1>

    <div class="navegacion-jornada">

       <#if jornadaAnterior gt 0>
               <a href="/tablaJornadas/${idTorneo}/${jornadaAnterior}">
                   <img src="/imgs/flechitaAtras.png" class="flecha-izq">
               </a>
       </#if>

       <h2>JORNADA ${idJornada}</h2>

            <a href="/tablaJornadas/${idTorneo}/${jornadaSiguiente}">
                   <img src="/imgs/flechita.png">
            </a>

    </div>

<#list listaPartidos as partido>


<table class="tabla-jornadas">
    <tr>

        <!-- Equipo Local -->
        <td class="equipo">
            <a href="/equipo/${partido.equipoLocal}">
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
            </a>
        </td>

    </tr>

    </table>
</#list>
<#include "/templates/footer.ftl">

</body>
</html>