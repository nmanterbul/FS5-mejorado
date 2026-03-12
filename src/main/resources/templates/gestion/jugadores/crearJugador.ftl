
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

        <div class="formulario">
            <form method="POST">
                <div class="Titulo">
                    <label for="jugadorName">NOMBRE DEL JUGADOR</label>
                    <input type="text" name="jugadorName" value="jugadorName">
                </div>
                <div>
                    <br>
                </div>

                <br>
                <div class="añadirOpcion">
                    <div class="botonGestion">
                         <a href="/equiposIndex">AÑADIR FOTO JUGADOR</a>
                    </div>

                </div>
                <br>
                    <div class="opciones">

                       <input type="radio" name="pos" value="posicion"> Portero
                       <input type="radio" name="pos" value="posicion"> Cierre
                       <input type="radio" name="pos" value="posicion"> Ala
                       <input type="radio" name="pos" value="posicion"> Pivot
                    </div>
                <br>

                <br>

                <div class="foto">
                    <img src="/img/Persona.jpg" width="100px">
                </div>


                <div class="guardar">
                    <a href="/listarJugadores/1">CREAR JUGADOR</a>
                </div>



            </form>
        </div>
    </div>

   <#include "/templates/footer.ftl">

</body>
</html>
