package utilitarios;


import clases.Tarea;
import clases.Usuario;
import servicios.GestionTarea;
import servicios.GestionUsuario;

import java.util.List;
import java.util.Scanner;

public class GeneradorReportes {

    // Método para generar el reporte de tareas, según el usuario elegido
    public void generarReporteUsuario(GestionUsuario gestionUsuario, GestionTarea gestionTarea) {
        Scanner scanner = new Scanner(System.in);

        // Selección de usuario
        gestionUsuario.mostrarUsuarios();
        System.out.print("Seleccione el nombre del usuario para generar el reporte: ");
        String nombreUsuario = scanner.nextLine();
        Usuario usuarioSeleccionado = gestionUsuario.buscarUsuarioPorNombre(nombreUsuario);

        if (usuarioSeleccionado == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        // Generación de reporte, Título
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de Tareas para el Usuario: ").append(usuarioSeleccionado.getNombreUsuario()).append("\n\n");

        List<Tarea> tareas = gestionTarea.listarTareas();
        int completadas = 0, pendientes = 0, enProgreso = 0;

        // Bucle para el listado de tareas según el usuario
        for (Tarea tarea : tareas) {
            if (tarea.getUsuarioAsignadoTarea().equals(usuarioSeleccionado)) {
                reporte.append("Título: ").append(tarea.getTituloTarea()).append("\n");
                reporte.append("Descripción: ").append(tarea.getDescripcionTarea()).append("\n");
                reporte.append("Fecha de Entrega: ").append(tarea.getFechaEntregaTarea()).append("\n");
                reporte.append("Prioridad: ").append(tarea.getPrioridadTarea()).append("\n");
                reporte.append("Estado: ").append(tarea.getEstadoTarea()).append("\n\n");

                switch (tarea.getEstadoTarea().toLowerCase()) {
                    case "completada" -> completadas++;
                    case "pendiente" -> pendientes++;
                    case "en progreso" -> enProgreso++;
                }
            }
        }

        // Resumen de tareas
        reporte.append("Resumen de Tareas:\n");
        reporte.append("Completadas: ").append(completadas).append("\n");
        reporte.append("Pendientes: ").append(pendientes).append("\n");
        reporte.append("En Progreso: ").append(enProgreso).append("\n");

        // Imprimir el reporte final
        System.out.println(reporte);
    }
}
