<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CrearTorneo</title>
    <link rel="stylesheet"  type="text/css" href="/css/editarTorneo.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cabecera.css"/>
    <link rel="stylesheet" type="text/css" href="/css/footer.css"/>
</head>
<body>
  <#include "/templates/cabecera.ftl">

    <div class="contenedor">

        <div class="formulario">
            <form action="gestionTorneos">
                <div class="Titulo">
                    <label for="TORNEO">NOMBRE DEL TORNEO</label>
                </div>
                <div>
                    <br>
                    <input type="text" name="TORNEO">
                </div>

                <br>
                <div class="añadirOpcion">
                    <div class="botonGestion">
                         <a href="equiposIndex">AÑADIR EQUIPO</a>
                    </div>

                    <div class="botonGestion">
                        <a href="borrarEquipo"> ELIMINAR EQUIPO</a>
                    </div>

                </div>

                <br>
                <div class="opciones">
                     <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Logo Barsa.png" width="40px"> FC Barcelona </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Logo Ribera.png" width="40px"> Ribera Navarra </label>
                    <br>
                    <input type="radio" name="Logo">
                    <label for="Logo"><img src="/img/Logo Real Madrid.png" width="40px"> Real Madrid </label>

                </div>

                


                 <button class="guardar">
                    <input type="submite">
                    <label>GUARDAR CAMBIOS</label>
                </button>
                



            </form>
        </div>
    </div>

    <!--PIE-->
    <div class="pie">
        <div class="copy">
            <span>COPYRIGHT</span>
            <div  class="content"><span>© 2026 FS5. Todos los derechos reservados.</span></div>
        </div>
        <div class="contacto">
            <span>CONTACTO</span>
            <div class="content"><span>📧 contacto@FS5.com</span></div>
            <div class="content"><span>📞 +34 900 123 456</span></div>
        </div>
        <div class="rrss">
            <span>REDES SOCIALES</span>
            <div  class="content"><img src="/img/insta.jpg" alt=""><img src="/img/X.png" alt=""><img src="/img/Youtube.png" alt=""></div>
        </div>
    </div>

</body>
</html>