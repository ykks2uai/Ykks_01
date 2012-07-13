/**
 * 
 */
package ykks.client.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author ykks
 *
 */
public class TopViewController {

	@FXML
	private TextField textField;

	@FXML
	private Label label;

	@FXML
	protected void writeText(ActionEvent e) {
		this.label.setText(this.textField.getText());
	}
}
