package textSender;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

	public void start(Stage primaryStage) throws Exception {
		ViewReceiveText vrt = new ViewReceiveText();
		ViewSendText vst = new ViewSendText();
		Controller.addView(vrt);
		Controller.addView(vst);
		
		Controller.launchViews();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
