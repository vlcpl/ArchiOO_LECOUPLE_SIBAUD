package textSender;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ViewReceiveText extends AbstractView{
	
	@FXML
	private TextField txtFldAff;

	@Override
	public void setText(String msg) {
		this.message = msg;
		txtFldAff.setText(this.message);		
	}
	

}
