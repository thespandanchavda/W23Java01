module com.example.w23java01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23java01 to javafx.fxml;
    exports com.example.w23java01;
}