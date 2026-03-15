
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Torneos</title>
    <link rel="stylesheet" href="index.css">
</head>

<body>

    <#include "/templates/cabecera.ftl">


    <!--CONTENIDO-->
    <div class="contenido">
        <div class="imgIndex"><img src="imgs/LOGOFS5.jpg" alt=""></div>
        <div class="botonesMain">
        <#list listaTorneos as torneo>
            <div class="boton">
                <span>COMPETICIONES</span>
            </div>
            <div class="botonPeque">
                <a href="/admin/tablaEquipos/${torneo.idTorneo}"><span>${torneo.torneoName}</span></a>
            </div>
        </#list>
        </div>
    </div>

    <#include "/templates/footer.ftl">

</body>
</html>
