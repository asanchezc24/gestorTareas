import java.util.ArrayList;
import java.util.List;

// Clase Tarea para almacenar información sobre cada tarea
class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre, boolean completada) {
        this.nombre = nombre;
        this.completada = completada;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    @Override
    public String toString() {
        return nombre + " - " + (completada ? "Completada" : "Pendiente");
    }
}

// Clase Reporte para generar y simular el envío de un reporte de tareas
class Reporte {
    private List<Tarea> tareas;

    public Reporte(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    // Generar el reporte en formato de texto
    public String generarReporte() {
        StringBuilder reporte = new StringBuilder("Reporte de Tareas:\n");
        for (Tarea tarea : tareas) {
            reporte.append(tarea.toString()).append("\n");
        }
        return reporte.toString();
    }

    // Simulación del envío del reporte por correo
    public void enviarPorCorreo(String destinatario) {
        System.out.println("Enviando reporte a: " + destinatario);
        System.out.println(generarReporte());
        System.out.println("Reporte enviado con éxito.");
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear una lista de tareas de ejemplo
        List<Tarea> listaTareas = new ArrayList<>();
        listaTareas.add(new Tarea("Desarrollar interfaz de usuario", true));
        listaTareas.add(new Tarea("Configurar gestores de tareas", false));
        listaTareas.add(new Tarea("Realizar pruebas", false));

        // Generar el reporte y simular el envío por correo
        Reporte reporte = new Reporte(listaTareas);
        reporte.enviarPorCorreo("destinatario@ejemplo.com");
    }
}
