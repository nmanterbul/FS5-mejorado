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
    <table>
        <div class="formulario">
            <form method="POST" action="/admin/borrarEquipo/${id}">
                <div class="Titulo">
                   <span>EQUIPOS</span>
                </div>
            <#list listaEquipos as equipo>
            <tr>
                <td>
                    ${equipo.equipoName}
                </td>

                <br>
                <div class="opciones">
                     <input type="radio" name="equipoName" id="equipoName" value="equipoName">
                    <label for="equipoName">${equipo.equipoName}</label>

                </div>

                <div class="guardar">
                    <button type="submit">ELIMINAR EQUIPO</button>
                </div>

            </tr>
            </#list>
            </form>
        </div>
    </table>
    </div>

    <#include "/templates/footer.ftl">

</body>
</html>