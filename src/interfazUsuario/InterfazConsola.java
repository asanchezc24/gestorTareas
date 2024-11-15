package interfazUsuario;

import servicios.GestionTarea;
import servicios.GestionUsuario;
import utilitarios.GeneradorReportes;

import java.util.Scanner;

public class InterfazConsola {
    private GestionUsuario gestionUsuario;
    private GestionTarea gestionTarea;
    private GeneradorReportes generadorReportes;
    private Scanner consola = new Scanner(System.in);

    //Constructor parametrizado
    public InterfazConsola(GestionUsuario gestionUsuario, GestionTarea gestionTarea, GeneradorReportes generadorReportes) {
        this.gestionUsuario = gestionUsuario;
        this.gestionTarea = gestionTarea;
        this.generadorReportes = generadorReportes;
    }

    //Método para mostrar y elegir las funciones a realizar
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Agregar Tarea");
            System.out.println("3. Listar Usuarios");
            System.out.println("4. Listar Tareas");
            System.out.println("5. Generar Reporte por Usuario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = consola.nextInt();
            consola.nextLine(); // Limpiar el buffer
            switch(opcion) {
                case 1 -> gestionUsuario.agregarUsuario();
                case 2 -> gestionTarea.agregarTarea(gestionUsuario);
                case 3 -> gestionUsuario.mostrarUsuarios();
                case 4 -> gestionTarea.mostrarTareas();
                case 5 -> generadorReportes.generarReporteUsuario(gestionUsuario, gestionTarea);
            }
        } while (opcion != 0);
    }
}
