module com.example.testpi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testpi to javafx.fxml;
    exports com.example.testpi;
}