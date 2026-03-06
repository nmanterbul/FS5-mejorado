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
                    <label for="torneo">TORNEOS</label>
                </div>
                <div class="opciones">
                   <input type="checkbox" name="pos"> Barcelona <br>
                   <input type="checkbox" name="pos"> Barcelona <br>
                   <input type="checkbox" name="pos"> Barcelona <br>
                   <input type="checkbox" name="pos"> Barcelona <br>
                </div>
                <div class="guardar">
                    <a href="OpcionesDeEquipo.html">ELIMINAR</a>
                </div>
            </form>
        </div>
    </div>

    <#include "/templates/footer.ftl">

</body>
</html>