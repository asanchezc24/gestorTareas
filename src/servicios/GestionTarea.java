package servicios;

import clases.Tarea;
import clases.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionTarea {
    private List<Tarea> tareas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    //método para agregar una tarea al programa y asignarle un usuario
    public void agregarTarea(GestionUsuario gestionUsuario) {
        System.out.print("Ingrese el título de la tarea: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();

        //Excepción para el ingreso de la fecha de entrega
        LocalDate fechaEntrega = null;
        while (fechaEntrega == null) {
            try {
                System.out.print("Ingrese la fecha de entrega (YYYY-MM-DD): ");
                fechaEntrega = LocalDate.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Fecha inválida. Por favor, ingrese el formato correcto (YYYY-MM-DD).");
            }
        }


        System.out.print("Ingrese la prioridad (alta, media, baja): ");
        String prioridad = scanner.nextLine();
        System.out.print("Ingrese el estado (pendiente, en progreso, completada): ");
        String estado = scanner.nextLine();

        gestionUsuario.mostrarUsuarios();
        System.out.print("Seleccione el nombre del usuario asignado: ");
        String nombreUsuario = scanner.nextLine();
        Usuario usuarioAsignado = gestionUsuario.buscarUsuarioPorNombre(nombreUsuario);

        if (usuarioAsignado != null) {
            tareas.add(new Tarea(titulo, descripcion, fechaEntrega, prioridad, estado, usuarioAsignado));
            System.out.println("Tarea agregada exitosamente.\n");
        } else {
            System.out.println("Usuario no encontrado.\n");
        }
    }

    //método para generar un listado general de las tareas almacenadas
    public void mostrarTareas() {
        System.out.printf("""
                \nLista de Tareas:
                ===================================================================================================
                %-20.20s%4s%-35.35s%4s%-12.12s%4s%-20.20s
                ===================================================================================================
                ""","Título","","Descripción","","Estado","","Usuario");
        for (Tarea tarea : tareas) {
            System.out.printf("""
                    %-20.20s%4s%-35.35s%4s%-12.12s%4s%-20.20s
                    """,tarea.getTituloTarea(),"",tarea.getDescripcionTarea(),"",tarea.getEstadoTarea(),"",
                    tarea.getUsuarioAsignadoTarea().getNombreUsuario());
        }
        System.out.println();
    }

    public List<Tarea> listarTareas() {
        return tareas;
    }
}