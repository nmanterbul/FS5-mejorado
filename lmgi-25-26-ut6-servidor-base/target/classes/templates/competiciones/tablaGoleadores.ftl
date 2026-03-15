<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla Goleadores</title>
    <link rel="stylesheet" type="text/css" href="/css/tablaGoleadores.css">
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>
    <#include "/templates/cabecera.ftl">

       <a href="/tablaJornadas/1/6" class="menu-item">
           JORNADAS
       </a>

       <a href="/tablaClasificacion/1" class="menu-item">
           CLASIFICACIÓN
       </a>

       <a href="/tablaGoleadores/1" class="menu-item activo">
           TABLA DE GOLEADORES
       </a>

       <table class="tabla-goleadores">
       <#assign contador = 1>
           <#list listaJugadores as jugador>
                <#if contador gt 11>
           <tr>
                <#assign contador = contador + 1>
                       <td class="posicion">
                           ${jugador.posicionGoleador}
                       </td>

                       <td class="jugador">
                           ${jugador.jugadorName}
                       </td>

                       <td class="goles">
                           ${jugador.numGoles}
                       </td>

                       <td class="equipo">

                       <#list listaEquipos as equipo>
                         <#if jugador.idEquipo == equipo.idEquipo>
                             ${equipo.equipoName}
                         </#if>
                       </#list>

                     </td>

                     <td class="logo">

                     </td>

                     </tr>
                </#if>
           </#list>

       </table>
    <#include "/templates/footer.ftl">
</body>
</html>