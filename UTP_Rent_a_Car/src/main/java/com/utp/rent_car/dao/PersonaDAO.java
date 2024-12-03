package com.utp.rent_car.dao;

import com.utp.rent_car.model.Persona;
import com.utp.rent_car.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private Connection connection;
    private PreparedStatement ps;

    public PersonaDAO() {
        this.connection = DBConnection.getConnection();  // Asumiendo que DBConnection.getConnection() maneja la conexión.
    }

    // Crear una nueva persona
    public boolean createPersona(Persona persona) {
        String query = "INSERT INTO Persona (nombres, apellido_paterno, apellido_materno, dni, direccion, telefono, correo, genero, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, persona.getNombres());
            ps.setString(2, persona.getApellidoPaterno());
            ps.setString(3, persona.getApellidoMaterno());
            ps.setString(4, persona.getDni());
            ps.setString(5, persona.getDireccion());
            ps.setString(6, persona.getTelefono());
            ps.setString(7, persona.getCorreo());
            ps.setString(8, persona.getGenero());
            ps.setString(9, persona.getFechaNacimiento());

            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Leer todas las personas
    public List<Persona> getAllPersonas() {
        List<Persona> personas = new ArrayList<>();
        String query = "SELECT * FROM Persona";

        try {
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setIdPersona(rs.getInt("id_persona"));
                persona.setNombres(rs.getString("nombres"));
                persona.setApellidoPaterno(rs.getString("apellido_paterno"));
                persona.setApellidoMaterno(rs.getString("apellido_materno"));
                persona.setDni(rs.getString("dni"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setGenero(rs.getString("genero"));
                persona.setFechaNacimiento(rs.getString("fecha_nacimiento"));

                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personas;
    }

    // Leer una persona por ID
    public Persona getPersonaById(int idPersona) {
        Persona persona = null;
        String query = "SELECT * FROM Persona WHERE id_persona = ?";

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, idPersona);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                persona = new Persona();
                persona.setIdPersona(rs.getInt("id_persona"));
                persona.setNombres(rs.getString("nombres"));
                persona.setApellidoPaterno(rs.getString("apellido_paterno"));
                persona.setApellidoMaterno(rs.getString("apellido_materno"));
                persona.setDni(rs.getString("dni"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setGenero(rs.getString("genero"));
                persona.setFechaNacimiento(rs.getString("fecha_nacimiento"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persona;
    }

    // Actualizar una persona
    public boolean updatePersona(Persona persona) {
        String query = "UPDATE Persona SET nombres = ?, apellido_paterno = ?, apellido_materno = ?, dni = ?, direccion = ?, telefono = ?, correo = ?, genero = ?, fecha_nacimiento = ? WHERE id_persona = ?";

        try {

            ps = connection.prepareStatement(query);
            ps.setString(1, persona.getNombres());
            ps.setString(2, persona.getApellidoPaterno());
            ps.setString(3, persona.getApellidoMaterno());
            ps.setString(4, persona.getDni());
            ps.setString(5, persona.getDireccion());
            ps.setString(6, persona.getTelefono());
            ps.setString(7, persona.getCorreo());
            ps.setString(8, persona.getGenero());
            ps.setString(9, persona.getFechaNacimiento());
            ps.setInt(10, persona.getIdPersona());

            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar una persona
    public boolean deletePersona(int idPersona) {
        String query = "DELETE FROM Persona WHERE id_persona = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idPersona);
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

