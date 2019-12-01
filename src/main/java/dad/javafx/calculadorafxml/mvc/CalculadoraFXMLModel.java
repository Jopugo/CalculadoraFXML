package dad.javafx.calculadorafxml.mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CalculadoraFXMLModel {
	private StringProperty operacionesText = new SimpleStringProperty();

	public final StringProperty operacionesTextProperty() {
		return this.operacionesText;
	}
	

	public final String getOperacionesText() {
		return this.operacionesTextProperty().get();
	}
	

	public final void setOperacionesText(final String operacionesText) {
		this.operacionesTextProperty().set(operacionesText);
	}
	
	
}
