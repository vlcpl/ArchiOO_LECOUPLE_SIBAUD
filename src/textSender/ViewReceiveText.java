package textSender;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewReceiveText extends AbstractView{

    /**
     * Reference to the textField from sendPage.fxml
     */
	@FXML
	private TextField txtFldAff;

    /**
     * Self reference.
     */
	private ViewReceiveText globalViewCt;

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

    /**
     * load the view.
     *
     * @throws IOException if an error occure during runtime
     */
	@Override
	public void loadView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("affichage.fxml"));
		Parent window2 = loader.load();
		this.globalViewCt = loader.getController();
		Stage stage = new Stage();
		stage.setTitle("CLIENT");
		stage.setScene(new Scene(window2));
		stage.show();	
	}

    /**
     *
     * @return the view's instance
     */
	@Override
	public ViewReceiveText getController() {
		return this.globalViewCt;
	}
	

}
