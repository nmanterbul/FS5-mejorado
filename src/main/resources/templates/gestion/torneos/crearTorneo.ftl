
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/crearTorneo.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

<#include "/templates/cabecera.ftl">
    <h2>Crear nuevo torneo</h2>

    <div class="contenedor">
        <div class="formulario">
            <form action="/crearTorneo" method="POST">
                <div class="Titulo">
                    <label for="torneoName">NOMBRE DEL TORNEO</label>
                    <input type="text" id="torneoName" name="torneoName" required>
                    <button type="submit">CREAR TORNEO</button>
                </div>
                <br>

                <div class="guardar">
                    <a href="/anadirEquipo">AÑADIR EQUIPOS AL TORNEO</a>
                </div>
            </form>
        </div>
    </div>
<#include "/templates/footer.ftl">

</body>
</html>