package textSender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Observer {
    /**
     * List of AbstractView.
     */
	private List<AbstractView> viewsList;

    /**
     * Default Constructor.
     */
	Observer() {
		this.viewsList = new ArrayList<AbstractView>();
	}

    /**
     * Add an AbstractView to private list.
     *
     * @param av an AbstractView
     */
	public void addView(final AbstractView av) {
		this.viewsList.add(av);
	}

    /**
     * Up to date the AbstractView contained in viewsList.
     * Set a message to the AbstractView.
     *
     * @param message an meaningfull message
     */
	public void update(final String message) {
		for(AbstractView v : this.viewsList) {
			v.getController().setText(message);
		}
	}

    /**
     * Load all the AbstractView from viewsList.
     *
     * @throws IOException if the AbstractView f*** up
     */
	public void loadViews() throws IOException {
		for(AbstractView v : this.viewsList) {
			v.loadView();
		}
	}
}
