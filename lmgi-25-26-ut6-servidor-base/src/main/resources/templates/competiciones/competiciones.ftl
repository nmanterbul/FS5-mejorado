
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" href="index.css">
</head>

<body>

    <#include "/templates/cabecera.ftl">


    <!--CONTENIDO-->
    <div class="contenido">
        <div class="imgIndex"><img src="imgs/LOGOFS5.jpg" alt=""></div>
        <div class="botonesMain">
            <div class="boton">
                <span>COMPETICIONES</span>
            </div>
            <div class="botonPeque">
                <a href="/tablaEquipos/1"><span>1º DIVISIÓN</span></a>
            </div>
            <div class="botonPeque">
                <a href= "/tablaEquipos/2"><span>2º DIVISIÓN</span></a>
            </div>
        </div>
    </div>

    <#include "/templates/footer.ftl">

</body>
</html>
