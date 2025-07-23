package CineVentas.baseDatos;

import java.sql.*;

public class Consultas {

    // ------------------- USUARIOS ------------------- //
    public boolean verificarUsuario(String usuario, String clave) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, clave);

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean registrarUsuario(String usuario, String clave, String rol) {
        String sql = "INSERT INTO usuarios (usuario, clave, rol) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, clave);
            stmt.setString(3, rol);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ------------------- PELÍCULAS ------------------- //
    public boolean agregarPelicula(String titulo, String genero, int duracion) {
        String sql = "INSERT INTO peliculas (titulo, genero, duracion) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titulo);
            stmt.setString(2, genero);
            stmt.setInt(3, duracion);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ------------------- FUNCIONES ------------------- //
    public boolean agregarFuncion(int idPelicula, int idSala, String fechaHora) {
        String sql = "INSERT INTO funciones (pelicula_id, sala_id, fecha_hora) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPelicula);
            stmt.setInt(2, idSala);
            stmt.setString(3, fechaHora);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ------------------- SALAS ------------------- //
    public boolean agregarSala(String nombre, int capacidad) {
        String sql = "INSERT INTO salas (nombre, capacidad) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setInt(2, capacidad);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ------------------- BOLETOS ------------------- //
    public boolean venderBoleto(int funcionId, String cliente) {
        String sql = "INSERT INTO boletos (funcion_id, cliente) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, funcionId);
            stmt.setString(2, cliente);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
