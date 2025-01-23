module org.calma.demo_github {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calma.demo_github to javafx.fxml;
    exports org.calma.demo_github;
}