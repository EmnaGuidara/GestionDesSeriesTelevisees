module org.fsb.projetfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.fsb.projetfx to javafx.fxml;
    exports org.fsb.projetfx;
}
