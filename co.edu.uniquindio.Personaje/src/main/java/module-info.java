module co.edu.uniquindio.personaje.personajeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.personaje.personajeapp to javafx.fxml;
    exports co.edu.uniquindio.personaje.personajeapp;
}