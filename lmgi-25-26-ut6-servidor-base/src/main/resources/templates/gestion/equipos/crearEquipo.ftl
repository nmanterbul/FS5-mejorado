
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Equipo</title>
    <link rel="stylesheet" type="text/css" href="/css/crearGestion.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <div class="formulario">
            <form method="POST" action="/admin/crearEquipo/${id}">
                <div class="Titulo">
                    <label for="equipoName">NOMBRE DEL EQUIPO</label>
                    <input type="text" id="equipoName" name="equipoName" value="">
                </div>
                <br>
                <div class="botonGestion">
                    <a href="/admin/listarJugadores/${id}">AÑADIR JUGADOR</a>
                    <br>
                </div>
                <br>
                <div class="crear">
                    <button type="submit">CREAR EQUIPO</button>
                </div>
            </form>
        </div>
    </div>
     <#include "/templates/footer.ftl">
</body>
</html>
