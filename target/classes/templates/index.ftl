<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>

    <!--CABECERA-->
    <div class="cabecera">
        <div class="backButton" style="opacity: 0;"><a href="index.html"><img src="imgs/backButton.png" alt=""></a></div>
        <div><h1>FS5</h1></div>
        <div class="logo"><img src="imgs/LOGOFS5.jpg" alt=""></div>
    </div>

    <!--CONTENIDO-->
    <div class="contenido">
        <div class="imgIndex"><img src="imgs/LOGOFS5.jpg" alt=""></div>
        <div class="botonesMain">
            <a href="/competicionesIndex">
                <div class="boton">
                    <span>COMPETICIONES</span>
                </div>
            </a>
            <a href="/equiposIndex">
                <div class="boton">
                    <span>EQUIPOS</span>
                </div>
            </a>
            <a href="/login">
                <div class="boton">
                    <span>GESTIÓN</span>
                </div>
            </a>
        </div>
    </div>

    <#include "footer.ftl">

</body>
</html>