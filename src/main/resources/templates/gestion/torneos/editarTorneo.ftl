
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
            <form>
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
                         <a href="/anadirEquipo">AÑADIR EQUIPO</a>
                    </div>

                    <div class="botonGestion">
                        <a href="/eliminarEquipo"> ELIMINAR EQUIPO</a>
                    </div>

                </div>

                <br>
                  <!--CONTENIDO-->
                    <div class="contenido">
                        <div class="imgIndex"><img src="imgs/LOGOFS5.jpg" alt=""></div>
                        <div class="botonesMain">
                        <#list torneos as torneo>
                            <div class="boton">
                                <span>COMPETICIONES</span>
                            </div>
                            <div class="botonPeque">
                                <span>${torneo.torneoName}</span>
                            </div>
                        </#list>
                        </div>
                    </div>

                <div class="guardar">
                    <a href="/listaEditarTorneos">EDITAR</a>
                </div>

               <!--<button type="submit" class="crear">
                    GUARDAR CAMBIOS
               </button>-->

            </form>
        </div>
    </div>

     <#include "/templates/footer.ftl">

</body>
</html>
