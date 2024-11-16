package app;

import servicios.GestionUsuario;
import servicios.GestionTarea;
import utilitarios.GeneradorReportes;
import interfazUsuario.InterfazConsola;

/**
 * Clase principal del sistema "Notificación de Tareas Escolares".
 * Encargada de inicializar los servicios y la interfaz de usuario.
 */
public class NotificacionTareasEscolares {
    public static void main(String[] args) {
        // Inicialización de componentes principales
        try {
            inicializarAplicacion();
        } catch (Exception e) {
            System.err.println("Error al inicializar la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Método encargado de inicializar los servicios y la interfaz de usuario.
     */
    private static void inicializarAplicacion() {
        // Instancia los administradores y el generador de reportes
        GestionUsuario gestionUsuario = new GestionUsuario();
        GestionTarea gestionTarea = new GestionTarea();
        GeneradorReportes generadorReportes = new GeneradorReportes();

        // Instancia la UI y ejecuta el menú principal
        InterfazConsola consolaPrograma = new InterfazConsola(gestionUsuario, gestionTarea, generadorReportes);
        consolaPrograma.mostrarMenu();
    }
}
