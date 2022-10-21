module se.iths.karlemils.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.karlemils.javafx to javafx.fxml;
    exports se.iths.karlemils.javafx;
    exports se.iths.karlemils.javafx.model;
    opens se.iths.karlemils.javafx.model to javafx.fxml;
    exports se.iths.karlemils.javafx.controller;
    opens se.iths.karlemils.javafx.controller to javafx.fxml;
}