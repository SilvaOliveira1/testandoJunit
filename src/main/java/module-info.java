module br.com.javafxJunit {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.testandoJunit to javafx.fxml;
    exports br.com.testandoJunit;
    exports br.com.controller;
}