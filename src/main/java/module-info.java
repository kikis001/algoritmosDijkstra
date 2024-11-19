module com.example.grafosdis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.grafosdis to javafx.fxml;
    exports com.example.grafosdis;
}