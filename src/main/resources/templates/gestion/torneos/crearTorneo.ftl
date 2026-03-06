<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/crearGestion.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">
        <div class="formulario">
            <form>
                <div class="titulo">
                    <label for="torneo">NOMBRE DEL TORNEO</label>
                    <input type="text" name="torneo">
                </div>
                <div class="botonGestion">
                    <a href="EquiposIndex">+ AÑADIR EQUIPO</a>
                </div>
                <div class="guardar">
                    <a href="OpcionesDeEquipo.html">GUARDAR CAMBIOS</a>
                </div>
            </form>
        </div>
    </div>



    <#include "/templates/footer.ftl">

</body>
</html>