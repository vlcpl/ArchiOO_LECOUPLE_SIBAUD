package textSender;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ViewSendText extends AbstractView{
	
	@FXML
	private TextField txtFld;
	
	/**
	 * Constructor
	 */
	public ViewSendText() {
		super();
		this.fxmlLocation = "sendPage.fxml";
		this.windowTitle = "SERVEUR";
	}
		
	/**
	 * Send the message from txtFld to clients
	 * @param event instance of ActionEvent
	 */
	@FXML
	public void sendText(ActionEvent event) {
		this.message = txtFld.getText();
		Controller.update(this.message);
	}
	
	/**
	 * Set the text for message
	 */
	@Override
	public void setText(final String msg) {
		this.message = msg;
	}
}
