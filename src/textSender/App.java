package textSender;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    /**
     * Launch instances of views.
     *
     * @param primaryStage an instance of Stage
     * @throws Exception if an Exception occure during runtime
     */
	public void start(final Stage primaryStage) throws Exception {

		ViewReceiveText vrt = new ViewReceiveText();
		ViewReceiveText vrt2 = new ViewReceiveText();
		ViewReceiveText vrt3 = new ViewReceiveText();
		ViewSendText vst = new ViewSendText();

		Controller.addView(vrt);
		Controller.addView(vrt2);
		Controller.addView(vrt3);
		Controller.addView(vst);

		Controller.launchViews();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
