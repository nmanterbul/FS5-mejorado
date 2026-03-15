
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Inicio</title>
            <link rel="stylesheet" type="text/css"     href="/css/index.css">
            <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
            <link rel="stylesheet" type="text/css" href="/css/footer.css"/>


    </head>

    <body>

        <#include "/templates/cabecera.ftl">


        <!--CONTENIDO-->
        <div class="contenido">

            <div class="botonesMain">
                <div class="boton">
                    <span>COMPETICIONES</span>
                </div>
                <#list listaTorneos as torneo>
                    <div class="botonPeque">
                        <a href="/tablaJornadas/1/6"><span>${torneo.torneoName}</span></a>
                    </div>
                </#list>
            </div>
        </div>

        <#include "/templates/footer.ftl">

    </body>
    </html>
