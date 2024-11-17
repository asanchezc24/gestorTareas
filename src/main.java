import servicios.GestionUsuario;
import servicios.GestionTarea;
import utilitarios.GeneradorReportes;
import interfazUsuario.InterfazConsola;

/*
 * Clase principal del sistema "Gestión de Tareas Estudiantiles".
 * Encargada de inicializar los servicios y la interfaz de usuario.
 */
public class main {
    /*
     * Método encargado de inicializar los servicios y la interfaz de usuario.
     */
    public static void main(String[] args) {
        // Instancia los gestores y el generador de reportes
        GestionUsuario gestionUsuario = new GestionUsuario();
        GestionTarea gestionTarea = new GestionTarea();
        GeneradorReportes generadorReportes = new GeneradorReportes();

        // Instancia el interfaz del programa y ejecuta el menú principal
        InterfazConsola consolaPrograma = new InterfazConsola(gestionUsuario, gestionTarea, generadorReportes);
        consolaPrograma.mostrarMenu();
    }
}
