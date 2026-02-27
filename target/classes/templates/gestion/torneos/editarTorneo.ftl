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
                <div class="Titulo">
                    <label for="TORNEO">NOMBRE DEL TORNEO</label>
                </div>
                <div>
                    <br>
                    <input type="text" name="TORNEO">
                </div>

                <br>
                <div class="añadirOpcion">
                    <div class="botonGestion">
                         <a href="EquiposIndex.html">AÑADIR EQUIPO</a>
                    </div>

                    <div class="botonGestion">
                        <a href="borrarTorneo.html"> ELIMINAR EQUIPO</a>
                    </div>

                </div>

                <br>
                <div class="opciones">
                     <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Logo Barsa.png" width="40px"> FC Barcelona </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Logo Ribera.png" width="40px"> Ribera Navarra </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Logo Real Madrid.png" width="40px"> Real Madrid </label>

                </div>

                <div class="guardar">
                    <a href="OpcionesDeGestión.html">GUARDAR CAMBIOS</a>
                </div>

               <!--<button type="submit" class="crear">
                    GUARDAR CAMBIOS
               </button>-->

            </form>
        </div>
    </div>

     <#include "/templates/footer.ftl">

</body>
</html>