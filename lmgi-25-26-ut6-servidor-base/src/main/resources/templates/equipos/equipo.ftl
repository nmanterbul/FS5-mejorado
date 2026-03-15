
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EquiposIndex</title>
    <link rel="stylesheet" type="text/css" href="/css/equipo.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>

    <#include "/templates/cabecera.ftl">


    <!--CONTENIDO-->
         <div class="contenido">
             <div class="tablaEquipo">
                 <table>
                     <tr>
                         <td rowspan="2"><div class="barcelona"></div></td>
                         <td colspan="2"><div class="nombreEquipo"><span>${equipo.equipoName}</span></div></td>
                     </tr>
                     <tr>
                         <td><div class="posicion"><span>Posición Actual:</span></div></td>
                         <td><div><span>${equipo.posicion}</span></div></td>
                     </tr>
                 </table>
             </div>
             <div class="palmares">
                 <span>Palmarés: </span>
                 <div class="titulos">
                     <table>
                         <tr>
                             <td><ul><li>Copas del Rey:</li></ul></td>
                             <td>12</td>
                         </tr>
                         <tr>
                             <td><ul><li>Copas de España:</li></ul></td>
                             <td>10</td>
                         </tr>
                         <tr>
                             <td><ul><li>Ligas:</li></ul></td>
                             <td>15</td>
                         </tr>
                         <tr>
                             <td><ul><li>Supercopas de España:</li></ul></td>
                             <td>7</td>
                         </tr>
                     </table>
                 </div>
             </div>
             <div class="jugadores">
                 <div class="porteros">
                     <span>Porteros:</span>
                     <div class="imgsJugadores">
                     <#list listaJugadores as jugador>
                     <#if jugador.posicion == "Portero">
                         <div class="imgJugador"><span>${jugador.jugadorName}</span></div>
                     </#if>
                     </#list>
                     </div>
                 </div>
                 <div class="cierres">
                     <span>Cierres:</span>
                     <div class="imgsJugadores">
                     <#list listaJugadores as jugador>
                     <#if jugador.posicion == "Cierre">
                         <div class="imgJugador"><span>${jugador.jugadorName}</span></div>
                     </#if>
                     </#list>
                     </div>
                 </div>
                 <div class="alas">
                     <span>Alas:</span>
                     <div class="imgsJugadores">
                     <#list listaJugadores as jugador>
                     <#if jugador.posicion == "Ala">
                         <div class="imgJugador"><span>${jugador.jugadorName}</span></div>
                     </#if>
                     </#list>
                     </div>
                 </div>
                 <div class="pivots">
                     <span>Pivots:</span>
                     <div class="imgsJugadores">
                     <#list listaJugadores as jugador>
                     <#if jugador.posicion == "Pivot">
                         <div class="imgJugador"><span>${jugador.jugadorName}</span></div>
                     </#if>
                     </#list>
                     </div>
                 </div>
             </div>
         </div>
    <#include "/templates/footer.ftl">

</body>
</html>
