module jp.ntrip.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens jp.ntrip.client to javafx.fxml;
    exports jp.ntrip.client;
}