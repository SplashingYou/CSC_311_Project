module com.example.csc_311_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.csc_311_project to javafx.fxml;
    exports com.example.csc_311_project;
}