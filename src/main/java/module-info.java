module eduqtr.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens eduqtr.demo1 to javafx.fxml;
    exports eduqtr.demo1;
}