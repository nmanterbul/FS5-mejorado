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
                   <span>EQUIPOS</span>
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

                <div class="eliminar">
                    <a href="OpcionesDeEquipo.html">ELIMINAR</a>
                </div>



            </form>
        </div>
    </div>

    <#include "/templates/footer.ftl">

</body>
</html>