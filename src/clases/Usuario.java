package clases;

public class Usuario {
    //esta clase tendrá los atributos de nombre y correo
    private String nombreUsuario;
    private String correoUsuario;

    //constructor
    public Usuario(String nombreUsuario, String correoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
    }

    // getters y setters para moodificar atributos de clase usuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
}
