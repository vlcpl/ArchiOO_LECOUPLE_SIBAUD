package textSender;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ViewReceiveText extends AbstractView{

    /**
     * Reference to the textField from sendPage.fxml
     */
	@FXML
	private TextField txtFldAff;
	
	/**
	 * Constructor
	 */
	public ViewReceiveText() {
		super();
		this.fxmlLocation = "affichage.fxml";
		this.windowTitle = "CLIENT";
	}

    /**
     * Set the text to txtFldAff.
     *
     * @param msg the message
     */
	@Override
	public void setText(final String msg) {
		this.message = msg;
		txtFldAff.setText(this.message);		
	}
}
