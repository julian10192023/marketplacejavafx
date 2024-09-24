module co.edu.uniquindio.marketplace_fx.marketplaceapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.marketplace_fx.marketplaceapp to javafx.fxml;
    exports co.edu.uniquindio.marketplace_fx.marketplaceapp;
}