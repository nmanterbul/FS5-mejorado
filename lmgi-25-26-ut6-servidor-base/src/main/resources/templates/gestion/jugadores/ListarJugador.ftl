<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CrearTorneo</title>

    <link rel="stylesheet"  type="text/css" href="/css/listarJugador.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>
   <#include "/templates/cabecera.ftl">
    <div class="contenedor">

        <div class="formulario">
            <form>
                <div class="Titulo">
                    <label for="TORNEO"> JUGADORES</label>
                </div>
                <div>
                    <br>
                    <input type="text" name="TORNEO">
                </div>



                <br>

                <br>
                <div class="opciones">
                     <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Persona.jpg" width="40px"> Pablo García </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Persona.jpg" width="40px"> Pablo García </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Persona.jpg" width="40px"> Pablo García </label>

                </div>


             <#if x == 1>
               <div class="añadir">
                 <a href="/crearEquipo">AÑADIR</a>
               </div>
             <#else>d
             <div class="añadir">
                <a href="/editarEquipo">AÑADIR</a>
             </div>
             </#if>


                <div class="añadir">
                    <a href="/crearEquipo">AÑADIR</a>
                </div>



            </form>
        </div>
    </div>

    <#include "/templates/footer.ftl">

</body>
</html>