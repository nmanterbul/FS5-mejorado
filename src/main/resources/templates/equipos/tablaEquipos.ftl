
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="/css/tablaEquipos.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>

    <#include "/templates/cabecera.ftl">

    <!--CONTENIDO-->
    <div class="contenido">
        <#list listaEquipos as equipo>
            <div class="equipo">
            <a href="/equipo"><img src="imgs/FC_Barcelona.png" alt=""></a><span>${equipo.equipoName}</span>
            </div>
        </#list>
    </div>

    <#include "/templates/footer.ftl">


</body>
</html>
