module com.example.pr11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr11 to javafx.fxml;
    exports com.example.pr11;
}