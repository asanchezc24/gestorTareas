package servicios;

import clases.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionUsuario {
    private List<Usuario> usuarios = new ArrayList<>();
    private Scanner consola = new Scanner(System.in);

    public void agregarUsuario() {
        System.out.println("******************");
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = consola.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        String correo = consola.nextLine();
        usuarios.add(new Usuario(nombre, correo));
        System.out.println("Usuario agregado exitosamente...\n");
    }

    public void mostrarUsuarios() {
        System.out.println("""
                
                Lista de Usuarios
                ------------------------------------------------
                Nombre                    Correo
                ------------------------------------------------""");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        System.out.println();
    }

    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null;
    }
}
