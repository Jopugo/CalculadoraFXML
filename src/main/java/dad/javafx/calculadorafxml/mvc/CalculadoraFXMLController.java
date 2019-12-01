 package dad.javafx.calculadorafxml.mvc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraFXMLController implements Initializable {

	@FXML
	private GridPane view;
	@FXML
	private TextField escribirText;

	//MODEL
	private CalculadoraFXMLModel model;
	private Calculadora calculadora;
	
	public CalculadoraFXMLController() throws IOException {
		//inicializar antes que la vista sino da error
		calculadora = new Calculadora();
		model = new CalculadoraFXMLModel();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/CalculadoraFXMLView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		model.operacionesTextProperty().bindBidirectional(escribirText.textProperty());
	}

	@FXML
	public void onCButtonAction(ActionEvent event) {
		calculadora.borrar();
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onCEButtonAction(ActionEvent event) {
		calculadora.borrarTodo();
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onCeroButtonAction(ActionEvent event) {
		calculadora.insertar('0');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onCincoButtonAction(ActionEvent event) {
		calculadora.insertar('5');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onComaButtonAction(ActionEvent event) {
		calculadora.insertarComa();
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onCuatroButtonAction(ActionEvent event) {
		calculadora.insertar('4');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onDividirButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.DIVIDIR);
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onDosButtonAction(ActionEvent event) {
		calculadora.insertar('2');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onIgualButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.IGUAL);
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onMultiplicarButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.MULTIPLICAR);
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onNueveButtonAction(ActionEvent event) {
		calculadora.insertar('9');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onOchoButtonAction(ActionEvent event) {
		calculadora.insertar('8');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onRestaButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.RESTAR);
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onSeisButtonAction(ActionEvent event) {
		calculadora.insertar('6');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onSieteButtonAction(ActionEvent event) {
		calculadora.insertar('7');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onSumarButtonAction(ActionEvent event) {
		calculadora.operar(Calculadora.SUMAR);
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onTresButtonAction(ActionEvent event) {
		calculadora.insertar('3');
		model.setOperacionesText(calculadora.getPantalla());
	}

	@FXML
	public void onUnoButtonAction(ActionEvent event) {
		calculadora.insertar('1');
		model.setOperacionesText(calculadora.getPantalla());
	}

	public GridPane getRoot() {
		return this.view;
	}
}
