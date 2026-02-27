
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EquiposIndex</title>
    <link rel="stylesheet" type="text/css" href="/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>

<#include "/templates/cabecera.ftl">
    <!--CONTENIDO-->
    <div class="contenido">
        <div class="imgIndex"><img src="imgs/LOGOFS5.jpg" alt=""></div>
        <div class="botonesMain">
            <div class="boton">
                <span>EQUIPOS</span>
            </div>
            <div class="botonPeque">
                <a href="/tablaEquipos/1"><span>1º DIVISIÓN</span></a>
            </div>
            <div class="botonPeque">
                <a href="/tablaEquipos/2"><span>2º DIVISIÓN</span></a>
            </div>
        </div>
    </div>

<#include "/templates/footer.ftl">

</body>
</html>
