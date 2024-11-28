package org.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import Objeto.User.Cliente;
import Objeto.User.Empleado;

import java.io.File;
public class Main extends Application{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Prueba de Clases - JavaFX");

        // Crear campos de entrada
        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese el nombre");

        TextField txtApellidoPaterno = new TextField();
        txtApellidoPaterno.setPromptText("Ingrese el apellido paterno");

        TextField txtApellidoMaterno = new TextField();
        txtApellidoMaterno.setPromptText("Ingrese el apellido materno");

        TextField txtDNI = new TextField();
        txtDNI.setPromptText("Ingrese el DNI");

        Button btnGuardarCliente = new Button("Guardar Cliente");
        Button btnGuardarEmpleado = new Button("Guardar Empleado");

        // Mensaje de estado
        Label lblEstado = new Label();

        // Botón para seleccionar archivo
        Button btnSeleccionarArchivo = new Button("Seleccionar Archivo");
        Label lblArchivoSeleccionado = new Label("Ruta del archivo: No seleccionado");

        btnSeleccionarArchivo.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Seleccionar Archivo");
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                lblArchivoSeleccionado.setText("Ruta del archivo: " + file.getAbsolutePath());
            }
        });

        // Evento para guardar un cliente
        btnGuardarCliente.setOnAction(event -> {
            try {
                Cliente cliente = new Cliente(
                        1, // ID Cliente
                        1, // ID Tipo Cliente
                        1, // ID Empresa
                        null, // Fecha de registro
                        1, // ID Persona
                        txtNombre.getText(),
                        txtApellidoPaterno.getText(),
                        txtApellidoMaterno.getText(),
                        txtDNI.getText(),
                        "Calle Falsa 123",
                        "123456789",
                        "email@example.com",
                        "Masculino",
                        "2000-01-01"
                );

                lblEstado.setText("Cliente guardado con éxito: " + cliente.getNombres());
            } catch (Exception e) {
                lblEstado.setText("Error al guardar el cliente: " + e.getMessage());
            }
        });

        // Evento para guardar un empleado
        btnGuardarEmpleado.setOnAction(event -> {
            try {
                Empleado empleado = new Empleado(
                        1, // ID Empleado
                        null, // Fecha de contratación
                        1, // ID Rol
                        1, // ID Persona
                        txtNombre.getText(),
                        txtApellidoPaterno.getText(),
                        txtApellidoMaterno.getText(),
                        txtDNI.getText(),
                        "Calle Falsa 123",
                        "123456789",
                        "email@example.com",
                        "Masculino",
                        "2000-01-01"
                );

                lblEstado.setText("Empleado guardado con éxito: " + empleado.getNombres());
            } catch (Exception e) {
                lblEstado.setText("Error al guardar el empleado: " + e.getMessage());
            }
        });

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(
                txtNombre, txtApellidoPaterno, txtApellidoMaterno, txtDNI,
                btnGuardarCliente, btnGuardarEmpleado, lblEstado,
                btnSeleccionarArchivo, lblArchivoSeleccionado
        );

        // Escena
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}