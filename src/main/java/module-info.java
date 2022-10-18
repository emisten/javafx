module se.iths.karlemils.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.karlemils.javafx to javafx.fxml;
    exports se.iths.karlemils.javafx;
}