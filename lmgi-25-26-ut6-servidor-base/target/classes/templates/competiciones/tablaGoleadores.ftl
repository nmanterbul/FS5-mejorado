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

       <div class="menu-tabla">
           <a href="/tablaJornadas/1/6" class="menu-item"> JORNADAS </a>
           <a href="/tablaClasificacion/1" class="menu-item "> CLASIFICACIÓN </a>
           <a href="/tablaGoleadores/1" class="menu-item activo"> TABLA DE GOLEADORES </a>
       </div>
        <#assign posicion = 1>
       <table class="tabla-goleadores">

           <#list listaJugadores as jugador>

           <tr>

                       <td class="posicion">
                           ${posicion}
                       </td>
                       <#assign posicion = posicion + 1>
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


           </tr>

           </#list>

       </table>
    <#include "/templates/footer.ftl">
</body>
</html>