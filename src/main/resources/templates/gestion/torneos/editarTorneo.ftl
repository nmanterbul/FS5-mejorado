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
                    <label for="TORNEO">NOMBRE DEL TORNEO</label>
                    <input type="text" name="torneo">
                </div>
                <div class="addOpcion">
                    <div class="botonGestion">
                         <a href="EquiposIndex.html">AÑADIR EQUIPO</a>
                    </div>
                    <br>
                    <div class="botonGestion">
                        <a href="borrarTorneo.html"> ELIMINAR EQUIPO</a>
                    </div>
                </div>
                <div class="guardar">
                    <a href="OpcionesDeGestión.html">GUARDAR CAMBIOS</a>
                </div>
            </form>
        </div>
    </div>

     <#include "/templates/footer.ftl">

</body>
</html>