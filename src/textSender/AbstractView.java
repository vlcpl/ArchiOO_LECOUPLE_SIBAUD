package textSender;

import java.io.IOException;

public abstract class AbstractView {

	protected String message;

    /**
     * Set the text from specified string chain.
     *
     * @param msg a message
     */
	public abstract void setText(final String msg);

    /**
     * Load views.
     *
     * @throws IOException if an error occure during runtime
     */
	public abstract void loadView() throws IOException;

    /**
     * Get the controler.
     *
     * @return an Object
     */
	public abstract Object getController();
}
