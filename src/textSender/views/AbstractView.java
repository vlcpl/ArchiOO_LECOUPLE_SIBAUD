package textSender.views;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractView {

	protected String fxmlLocation;
	protected String windowTitle;
	protected String message;
	
	/**
     * Self reference.
     */
	protected AbstractView globalViewCt;


    /**
     * Set the text from specified string chain.
     *
     * @param msg a message
     */
	public abstract void setText(final String msg);

    /**
     * Load views.
     *
     * @throws IOException if an error occurs during runtime
     */
	public void loadView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(this.fxmlLocation));
		Parent window = loader.load();
		this.globalViewCt = loader.getController();
		Stage stage = new Stage();
		stage.setTitle(this.windowTitle);
		stage.setScene(new Scene(window));
		stage.show();	
	}

    /**
     * Get the controller.
     *
     * @return an AbstractView
     */
	public AbstractView getController() {
		return this.globalViewCt;
	}
}
