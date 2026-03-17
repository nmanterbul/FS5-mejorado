
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/css/crearGestion.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <div class="formulario">
            <form method="POST" action="/admin/borrarTorneo">

                <div class="Titulo">
                    <label for="TORNEO">TORNEOS</label>
                </div>
                <#list listaTorneos as torneo>
                <br>
                    <div class="opciones">
                        <label for="torneoName">${torneo.torneoName}</label>
                        <input type="radio" name="torneoName" id="torneoName" value="${torneo.torneoName}">
                    </div>
                 </#list>
                    <div class="eliminar">
                        <button type="submit">ELIMINAR </button>
                    </div>

            </form>
        </div>
    </div>


    <#include "/templates/footer.ftl">

</body>
</html>
