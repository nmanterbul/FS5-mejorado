package edu.masanz.FS5.controller;

import edu.masanz.FS5.model.*;
import edu.masanz.FS5.service.*;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FS5controller {

    private static final FS5Service FS5Service = new FS5Service();
    private static final User user = new User();

    public static void ejemplo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/index.ftl",model);
    }

    public static void servirLogin(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/login.ftl", model);
    }

    public static void servirCompeticionesIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        List<Torneo> listaTorneos = EquiposService.obtenerTorneos();
        model.put("backURL", "/gestionJugadores");
        model.put("listaTorneos", listaTorneos);

        context.render("templates/competiciones/competiciones.ftl", model);
    }

    public static void servirTablaJornadas(@NotNull Context context) {
        int idTorneo = Integer.parseInt(context.pathParam("idTorneo"));
        int idJornada = Integer.parseInt(context.pathParam("idJornada"));
        Map<String, Object> model = new HashMap<>();
        List<Partido> partido = PartidosService.obtenerPartidos(idTorneo,idJornada);
        model.put("backURlL", "/competiciones");
        model.put("listaPartidos",partido);

        context.render("templates/competiciones/tablaJornadas.ftl",model);

    }

    public static void servirTablaClasificacion(@NotNull Context context) {
        int idTorneo = Integer.parseInt(context.pathParam("id"));
        Map<String, Object> model = new HashMap<>();
        List<Equipo> listaEquipos = EquiposService.obtenerEquipos(idTorneo);
        model.put("backURL", "/competiciones");
        model.put("listaEquipos", listaEquipos);

        context.render("/templates/competiciones/tablaClasificacion.ftl", model);

    }

    public static void servirEquiposIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/equipos/equiposIndex.ftl", model);
    }

    public static void servirTablaEquipos(@NotNull Context context) {
        int idTorneo = Integer.parseInt(context.pathParam("id"));
        Map<String, Object> model = new HashMap<>();
        List<Equipo> equipo = EquiposService.obtenerEquipos(idTorneo);
        model.put("backURL", "/equiposIndex");
        model.put("listaEquipos", equipo);

        context.render("/templates/equipos/tablaEquipos.ftl", model);

    }

    public static void servirEquipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        int idEquipo = Integer.parseInt(context.pathParam("id"));
        Equipo equipo = EquiposService.obtenerEquipo(idEquipo);
        List<Jugador> jugador = JugadorService.obtenerJugadoresDeEquipo(idEquipo);
        model.put("backURL", "/gestionEquipos");
        model.put("listaEquipos", equipo);
        model.put("listaJugadores", jugador);

        if (equipo != null){
            context.render("/templates/equipos/equipo.ftl", model);
        }
        context.render("/templates/error.ftl",model);
    }

    public static void servirGestion(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/login");
        context.render("/templates/gestion/gestion.ftl", model);
    }

    public static void servirGestionTorneos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/torneos/gestionTorneos.ftl", model);
    }

    public static void servirGestionEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/equipos/gestionEquipos.ftl", model);
    }

    public static void servirGestionJugadores(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/jugadores/gestionJugadores.ftl", model);
    }

    public static void servirTorneos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        List<Torneo> listaTorneos = EquiposService.obtenerTorneos();
        model.put("backURL", "/gestionJugadores");
        model.put("listaTorneos", listaTorneos);

        context.render("/templates/gestion/equipos/listaTorneos.ftl", model);
    }

    public static void servirCrearTorneo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        Torneo torneo = new Torneo();
        model.put("backURL", "/gestionTorneos");
        model.put("agregar", true);
        model.put("torneo", torneo);
        context.render("/templates/gestion/torneos/crearTorneo.ftl", model);
    }

    public static void CrearTorneo(@NotNull Context context) {

        String torneoName = context.formParam("torneoName"); // El name del input en FTL

        boolean exito = TorneoService.crearTorneo(torneoName);

        if (exito) {
            context.redirect("/listaTorneos"); // Redirige a la lista de torneos
        } else {
            context.redirect("/error"); // O página de error que tengas
        }
    }

    public static void servirEditarTorneo(@NotNull Context context){

        Map<String, Object> model = new HashMap<>();

        int idTorneo = Integer.parseInt(context.pathParam("id"));

        Torneo torneo = TorneoService.obtenerTorneo(idTorneo);

        model.put("backURL", "/listaEditaTorneo");
        model.put("torneo", torneo);

        if(torneo != null){

            context.render("/templates/gestion/torneos/editarTorneo.ftl", model);

        }else{

            context.render("/templates/error.ftl", model);

        }

    }

    public static void servirBorrarTorneo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionTorneos");
        context.render("/templates/gestion/torneos/borrarTorneo.ftl", model);
    }

    //region gestion

        //region gestion equipos
    public static void servirCrearEquipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/equipos/crearEquipo.ftl", model);
    }

    public static void elegirEditarEquipo(@NotNull Context context){
        int idTorneo = Integer.parseInt(context.pathParam("id"));
        Map<String, Object> model = new HashMap<>();
        List<Equipo> listaEquipos = EquiposService.obtenerEquipos(idTorneo);
        model.put("backURL", "/gestionJugadores");
        model.put("listaEquipos", listaEquipos);

        context.render("/templates/gestion/equipos/listaEditaEquipos.ftl", model);

    }

    public static void servirEditarEquipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        int idEquipo = Integer.parseInt(context.pathParam("id"));
        Equipo equipo = EquiposService.obtenerEquipo(idEquipo);
        List<Jugador> jugador = JugadorService.obtenerJugadoresDeEquipo(idEquipo);
        model.put("backURL", "/gestionEquipos");
        model.put("listaEquipos", equipo);
        model.put("listaJugadores", jugador);

        if (equipo != null){
            context.render("/templates/gestion/equipos/editarEquipo.ftl", model);
        }
            context.render("/templates/error.ftl",model);
    }

    public static void editarEquipo(@NotNull Context context) {
        int idEquipo = Integer.parseInt(context.pathParam("id"));
        String equipoName = context.formParam("equipoName");
        if (EquiposService.actualizarEquipo(idEquipo,equipoName)){
            context.redirect("/listaEquipos");
        }else{
            context.render("/templates/error.ftl");
        }
    }

    public static void servirBorrarEquipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/equipos/borrarEquipo.ftl", model);
    }
    //endregion

        //region gestion jugadores
    public static void servirCrearJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionJugadores");


        context.render("/templates/gestion/jugadores/crearJugador.ftl", model);
    }

    public static void crearJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/listaEditaJugadores");


        String jugadorName = context.formParam("jugadorName");
        String posicion = context.formParam("posicion");

        Jugador jugador = JugadorService.crearJugador(jugadorName,posicion);

        if (jugador.getIdJugador() > 0){
            context.redirect("/listarJugadores");
        }else{
            context.render("/templates/error.ftl");
        }
    }

    public static void elegirEditarJugador(@NotNull Context context) {
        int idTorneo = Integer.parseInt(context.pathParam("id"));
        Map<String, Object> model = new HashMap<>();
        List<Jugador> listaJugadores = JugadorService.obtenerJugadores(idTorneo);
        model.put("backURL", "/gestionJugadores");
        model.put("listaJugadores", listaJugadores);

        context.render("/templates/gestion/jugadores/listaEditaJugadores.ftl", model);

    }

    public static void servirEditarJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();

        int idJugador = Integer.parseInt(context.queryParam("idJugador"));

        Jugador jugador = JugadorService.obtenerJugador(idJugador);

        model.put("jugador", jugador);

        context.render("/templates/gestion/jugadores/editarJugador.ftl", model);
    }

    public static void editarJugador(@NotNull Context context) {

        int idJugador = Integer.parseInt(context.pathParam("id"));

        String nombre = context.formParam("jugadorName");
        String posicion = context.formParam("posicion");

        if (JugadorService.actualizarJugador(idJugador, nombre, posicion)) {

            context.redirect("/listaJugadores");

        } else {

            context.render("/templates/error.ftl");

        }
    }

    public static void servirJugadores(@NotNull Context context) {
        int idTorneo = Integer.parseInt(context.pathParam("id"));
        Map<String, Object> model = new HashMap<>();
        List<Jugador> listaJugadores = JugadorService.obtenerJugadores(idTorneo);
        model.put("backURL", "/gestionJugadores");
        model.put("listaJugadores", listaJugadores);

        context.render("/templates/gestion/jugadores/listarJugadores.ftl", model);

    }

    public static void elegirBorrarJugador(@NotNull Context context) {
        int idTorneo = Integer.parseInt(context.pathParam("id"));
        Map<String, Object> model = new HashMap<>();
        List<Jugador> listaJugadores = JugadorService.obtenerJugadores(idTorneo);
        model.put("backURL", "/gestionJugadores");
        model.put("listaJugadores", listaJugadores);

        context.render("/templates/gestion/jugadores/listaBorrarJugadores.ftl", model);

    }

    public static void servirBorrarJugador(@NotNull Context context) {
        int idTorneo = Integer.parseInt(context.pathParam("id"));
        Map<String, Object> model = new HashMap<>();
        List<Jugador> listaJugadores = JugadorService.obtenerJugadores(idTorneo);
        model.put("backURL", "/gestionJugadores");
        model.put("listaJugadores", listaJugadores);

        context.render("/templates/gestion/jugadores/borrarJugador.ftl", model);

    }

    public static void borrarJugador(@NotNull Context context) {
        int idJugador = Integer.parseInt(context.pathParam("id"));
        String jugadorName = context.formParam("jugadorName");

        if (JugadorService.borrarJugador(idJugador,jugadorName)){
            context.redirect("/listarJugadores");
        }else{
            context.render("/templates/error.ftl");
        }
    }

    //endregion

    //endregion


    public static void admin(@NotNull Context context) {

    }

    public static void servirEliminarEquipo(@NotNull Context context){

        Map<String, Object> model = new HashMap<>();

        int idTorneo = Integer.parseInt(context.pathParam("id"));

        List<Equipo> equiposTorneo = EquiposService.obtenerEquipos(idTorneo);

        model.put("listaEquipos", equiposTorneo);
        model.put("idTorneo", idTorneo);

        context.render("/templates/gestion/torneos/eliminarEquipo.ftl", model);

    }



    public static void anadirEquipo(@NotNull Context context){

        int idTorneo = Integer.parseInt(context.pathParam("id"));

        List<String> equipos = context.formParams("equiposSeleccionados");

        for(String idEquipo : equipos){

            TorneoService.anadirEquipoTorneo(idTorneo, Integer.parseInt(idEquipo));

        }

        context.redirect("/editarTorneo/"+idTorneo);




    }

    public static void eliminarEquipo(@NotNull Context context){

        int idTorneo = Integer.parseInt(context.pathParam("id"));

        List<String> equipos = context.formParams("idEquipo");

        for(String idEquipo : equipos){

            TorneoService.eliminarEquipoTorneo(idTorneo, Integer.parseInt(idEquipo));

        }

    }

    public static void elegirEditarTorneo(@NotNull Context context){

        Map<String, Object> model = new HashMap<>();

        List<Torneo> listaTorneos = TorneoService.obtenerTorneos();

        model.put("backURL", "/gestionTorneos");
        model.put("listaTorneos", listaTorneos);

        context.render("/templates/gestion/torneos/listaEditaTorneo.ftl", model);

    }

    public static void editarTorneo(@NotNull Context context){

        int idTorneo = Integer.parseInt(context.pathParam("id"));

        String nombreTorneo = context.formParam("nombreTorneo");

        if(TorneoService.actualizarTorneo(idTorneo,nombreTorneo)){

            context.redirect("/listaEditaTorneo");

        }else{

            context.render("/templates/error.ftl");

        }

    }

    public static void servirAnadirEquipo(@NotNull Context context){

        Map<String, Object> model = new HashMap<>();

        int idTorneo = Integer.parseInt(context.pathParam("id"));

        List<Equipo> equiposDisponibles = EquiposService.obtenerEquiposNoEnTorneo(idTorneo);

        model.put("listaEquipos", equiposDisponibles);
        model.put("idTorneo", idTorneo);

        context.render("/templates/gestion/torneos/anadirEquipo.ftl", model);

    }

}
