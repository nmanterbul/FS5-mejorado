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
                        <label for="jugador">JUGADORES</label>
                    </div>
                    <div class="opciones">
                        <img src="/imgs/nofotolnfs.jpg" width="30vh"><input type="checkbox" name="pos"> Pablo <br>
                        <img src="/imgs/nofotolnfs.jpg" width="30vh"><input type="checkbox" name="pos"> Pedro <br>
                        <img src="/imgs/nofotolnfs.jpg" width="30vh"><input type="checkbox" name="pos"> Andrés <br>
                        <img src="/imgs/nofotolnfs.jpg" width="30vh"><input type="checkbox" name="pos"> Martín <br>
                    </div>
                    <div class="guardar">
                        <a href="OpcionesDeJugadores.html">ELIMINAR</a>
                    </div>
                </form>
            </div>
        </div>

   <#include "/templates/footer.ftl">

</body>
</html>