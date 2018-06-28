package textSender;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewSendText extends AbstractView{
	
	@FXML
	private TextField txtFld;
	private ViewSendText globalViewCt;
		
	@FXML
	public void sendText(ActionEvent event) {
		this.message = txtFld.getText();
		Controller.update(this.message);
	}
	
	@Override
	public void setText(String msg) {
		this.message = msg;
	}

	@Override
	public void loadView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("sendPage.fxml"));
		Parent window1 = loader.load();
		this.globalViewCt = loader.getController();
		Stage stage = new Stage();
		stage.setScene(new Scene(window1));
		stage.show();
	}

	@Override
	public ViewSendText getController() {
		return this.globalViewCt;
	}
}
