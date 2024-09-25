package co.edu.uniquindio.marketplace_fx.marketplaceapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.marketplace_fx.marketplaceapp.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarVendedor;

    @FXML
    private Button btnAgregarVendedor;

    @FXML
    private Button btnEliminarVendedor;

    @FXML
    private Button btnMostrarVendedor;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtContrasenia;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onActualizarVendedor(ActionEvent event) {

    }

    @FXML
    void onAgregarVendedor(ActionEvent event) {
        AgregarVendedor();

    }

    @FXML
    void onEliminarVendedor(ActionEvent event) {

    }

    @FXML
    void onMostrarVendedor(ActionEvent event) {

    }

    @FXML
    void initialize() {
    }

    private void AgregarVendedor() {
        Vendedor vendedor = new Vendedor();

        vendedor.setNombre(txtNombre.getText());
        vendedor.setApellidos(txtApellidos.getText());
        vendedor.setCedula(txtCedula.getText());
        vendedor.setDireccion(txtDireccion.getText());
        vendedor.setUsuario(txtUsuario.getText());
        vendedor.setContrasenia(txtContrasenia.getText());

        txtResultado.setText(vendedor.toString());

    }

}
