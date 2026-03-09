<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet"  type="text/css" href="/css/crearJugador.css"/>
        <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
        <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>

    <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <div class="formulario">
            <form action="gestionJugadores">
                <div class="Titulo">
                    <label for="TORNEO">NOMBRE DEL JUGADOR</label>
                </div>
                <div>
                    <br>
                    <input type="text" name="TORNEO">
                </div>

                <br>
                <div class="añadirOpcion">
                    <div class="botonGestion">
                         <a href="/equiposIndex">AÑADIR FOTO JUGADOR</a>
                    </div>

                </div>

                <br>

                <div class="foto">
                    <img src="/img/Persona.jpg" width="100px">
                </div>


                

                <button class="guardar">
                    <input type="submit" value="CREAR JUGADOR">
                    
                </button>



            </form>
        </div>
    </div>

   <#include "/templates/footer.ftl">

</body>
</html>