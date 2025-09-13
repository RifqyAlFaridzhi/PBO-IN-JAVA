module com.example.soal13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soal13 to javafx.fxml;
    exports com.example.soal13;
}