package textSender;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	public void start(Stage primaryStage) throws Exception {
		ViewReceiveText vrt = new ViewReceiveText();
		ViewSendText vst = new ViewSendText();
		Controller.addView(vrt);
		Controller.addView(vst);
		Parent window1 = FXMLLoader.load(getClass().getResource("sendPage.fxml"));
		Parent window2 = FXMLLoader.load(getClass().getResource("affichage.fxml"));
		primaryStage.setScene(new Scene(window1));
		primaryStage.show();
		Stage st2 = new Stage();
		st2.setScene(new Scene(window2));
		st2.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
