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
                    <label for="torneo">NOMBRE DEL JUGADOR</label>
                    <input type="text" name="torneo">
                </div>
                <div class="addOpcion">
                    <div class="botonGestion">
                         <a href="EquiposIndex.html">CAMBIAR FOTO</a>
                    </div>
                </div>
                <div class="foto">
                    <img src="/img/Persona.jpg" width="100px">
                </div>
                <div class="opciones">
                    <input type="radio" name="pos"> Portero
                    <input type="radio" name="pos"> Cierre
                    <input type="radio" name="pos"> Ala
                    <input type="radio" name="pos"> Pivot
                </div>
                <div class="guardar">
                    <a href="OpcionesDeJugadores.html">GUARDAR CAMBIOS</a>
                </div>
            </form>
        </div>
    </div>

  <#include "/templates/footer.ftl">

</body>
</html>