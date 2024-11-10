package clases;

import java.time.LocalDate;
import java.util.Date;

public class Tarea {
    /* Esta clase Tarea tendrá los siguientes atributos: título de tarea, descripción, fecha de entraga,
    * prioridad, estado (pendiente, en progreso, completada), usuario asignado*/
    private String tituloTarea;
    private String descripcionTarea;
    private LocalDate fechaEntregaTarea;
    private String prioridadTarea;  // alta, media, baja
    private String estadoTarea;      // pendiente, en progreso, completada
    private Usuario usuarioAsignadoTarea;

    //constructor
    public Tarea(String tituloTarea, String descripcionTarea, LocalDate fechaEntregaTarea, String prioridadTarea,
                 String estadoTarea, Usuario usuarioAsignadoTarea) {
        this.tituloTarea = tituloTarea;
        this.descripcionTarea = descripcionTarea;
        this.fechaEntregaTarea = fechaEntregaTarea;
        this.prioridadTarea = prioridadTarea;
        this.estadoTarea = estadoTarea;
        this.usuarioAsignadoTarea = usuarioAsignadoTarea;
    }

    //métodos getters y setters para los atributos
    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public LocalDate getFechaEntregaTarea() {
        return fechaEntregaTarea;
    }

    public void setFechaEntregaTarea(LocalDate fechaEntregaTarea) {
        this.fechaEntregaTarea = fechaEntregaTarea;
    }

    public String getPrioridadTarea() {
        return prioridadTarea;
    }

    public void setPrioridadTarea(String prioridadTarea) {
        this.prioridadTarea = prioridadTarea;
    }

    public String getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(String estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public Usuario getUsuarioAsignadoTarea() {
        return usuarioAsignadoTarea;
    }

    public void setUsuarioAsignadoTarea(Usuario usuarioAsignadoTarea) {
        this.usuarioAsignadoTarea = usuarioAsignadoTarea;
    }
}
