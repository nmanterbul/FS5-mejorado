<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Eliminar Equipos</title>

    <link rel="stylesheet" type="text/css" href="/css/eliminarEquipo.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>

<body>

<#include "/templates/cabecera.ftl">

<div class="contenedor-equipos">

    <h2>Seleccionar equipo para eliminar</h2>

    <form action="/admin/eliminarEquipo/{idEquipo}" method="POST">

        <div class="lista-equipos-container">
            <#list listaEquipos as equipo>

                <div class="lista-equipos">
                    <label for="equipo_${equipo.idEquipo}" class="equipo-label">
                        <span class="nombre-equipo">
                            ${equipo.equipoName}
                        </span>
                    </label>
                    <input type="radio" name="idEquipo" id="equipo_${equipo.idEquipo}" value="${equipo.idEquipo}">
                </div>

            </#list>
        </div>

        <div class="botones-formulario">

            <button type="submit" class="boton-eliminar">
                Eliminar equipo seleccionado
            </button>
        </div>
    </form>

</div>

<#include "/templates/footer.ftl">

</body>
</html>