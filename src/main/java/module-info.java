module com.example.javaproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaproject to javafx.fxml;
    exports com.example.javaproject;
    exports com.example.javaproject.programmers;
    opens com.example.javaproject.programmers to javafx.fxml;
    exports com.example.javaproject.week4.d1;
    opens com.example.javaproject.week4.d1 to javafx.fxml;
    exports com.example.javaproject.week4.d3;
    opens com.example.javaproject.week4.d3 to javafx.fxml;
}