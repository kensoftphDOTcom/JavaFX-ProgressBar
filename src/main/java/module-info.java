module com.kensoftph.progress {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.progress to javafx.fxml;
    exports com.kensoftph.progress;
}