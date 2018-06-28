package textSender;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewReceiveText extends AbstractView{
	
	@FXML
	private TextField txtFldAff;
	private ViewReceiveText globalViewCt;

	@Override
	public void setText(String msg) {
		this.message = msg;
		txtFldAff.setText(this.message);		
	}

	@Override
	public void loadView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("affichage.fxml"));
		Parent window2 = loader.load();
		this.globalViewCt = loader.getController();
		Stage stage = new Stage();
		stage.setScene(new Scene(window2));
		stage.show();	
	}

	@Override
	public ViewReceiveText getController() {
		return this.globalViewCt;
	}
	

}
