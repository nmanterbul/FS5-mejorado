
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="/css/index.css">
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>
    
<#include "/templates/cabecera.ftl">
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
            <a href="login">
                <div class="boton">
                    <span>GESTIÓN</span>
                </div>
            </a>
        </div>
    </div>
 
<#include "/templates/footer.ftl">


</body>
</html>
