package textSender;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ViewSendText extends AbstractView{
	
	@FXML
	private TextField txtFld;
		
	@FXML
	public void sendText(ActionEvent event) {
		this.message = txtFld.getText();
		Controller.update(this.message);
	}
	
	@Override
	public void setText(String msg) {
		this.message = msg;
	}
}
