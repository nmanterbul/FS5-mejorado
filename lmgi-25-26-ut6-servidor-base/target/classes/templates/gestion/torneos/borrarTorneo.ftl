
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
            <form>
                <#list listaTorneos as torneo>
                <div class="Titulo">
                    <label for="TORNEO">TORNEOS</label>
                </div>

                <br>
                <div class="opciones">
                    <label for="torneoName">${torneo.torneoName}</label>
                    <input type="radio" name="torneoName" id="torneoName" value="${torneo.torneoName}">
                </div>

                <div class="eliminar">
                    <a href="/admin/listaTorneos">ELIMINAR </a>
                    <span></span>
                </div>
               </#list>
            </form>
        </div>
    </div>


    <#include "/templates/footer.ftl">

</body>
</html>
