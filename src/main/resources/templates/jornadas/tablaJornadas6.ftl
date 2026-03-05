<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de Jornadas</title>
     <link rel="stylesheet"  type="text/css" href="/css/TablaJornada.css"/>
            <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
            <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>
    <#include "/templates/cabecera.ftl">
    <div class="cabecera2">
        <div class="eleccion">
            <a  id="JORNADAS">JORNADAS</a>
            <a href="tablaClasificacion" id="CLASIFICACIÓN">CLASIFICACIÓN</a>
            <a href="tablaGoleadores" id="GOLEADORES">TABLA DE GOLEADORES</a>
        </div>
    </div>
    <div class="jornadas">
        <div class="cambiar">
            <a href="tablaJornadas5" id="atras"><img src="img/flechitaAtras.png" width="60"/></a>
            <span>Jornada 6</span>
            <a href="tablaJornadas7" id="siguiente"><img src="img/flechita.png" width="60"/></a>
        </div>
    </div>
        <div class="equipos">
            <table>
                <tr>
                    <th><img src="/img/FC_Barcelona.png" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/elPozo.png" width="60"/></th>
                </tr>
                <tr>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/FC_Barcelona.png" width="60"/></th>
                </tr>
                <tr>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                </tr>
                <tr>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                </tr>
                <tr>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                </tr>
                <tr>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                </tr>
                <tr>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                </tr>
                <tr>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                    <td>2 - 5</td>
                    <th><img src="/img/ribera.jpg" width="60"/></th>
                </tr>

            </table>
        </div>
    </div>
    <#include "/templates/footer.ftl">
    </div>
</body>
</html>