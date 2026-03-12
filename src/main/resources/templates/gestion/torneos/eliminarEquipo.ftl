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
<form>
    <#list listaEquipos as equipo>
        <div class="lista-equipos">
            <label for="equipo_${equipo.idEquipo}"><img src="/img/Persona.jpg" width="40px"> ${equipo.equipoName} </label>
            <input type="radio" name="idEquipo" id="equipo_${equipo.idEquipo}" value="${equipo.idEquipo}">
        </div>
    </#list>
</form>
    Eliminar equipos seleccionados

<#include "/templates/footer.ftl">