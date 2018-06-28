package textSender;

import java.io.IOException;

public class Controller {
	/**
	 * Injection of an instance of Observer.
	 */
	private static Observer obs = new Observer();

	/**
	 * Add an AbstractView to Observer's list.
	 *
	 * @param avCesar an AbstractView
	 */
	public static void addView(final AbstractView avCesar)
    {
		obs.addView(avCesar);
	}

	/**
	 * Up to date the Observer's views.
	 *
	 * @param message a meaningful message
	 */
	public static void update(final String message) {
		obs.update(message);
	}

	/**
	 * Launch all the views.
	 *
	 * @throws IOException during runtime if an error occurs
	 */
	public static void launchViews() throws IOException {
		obs.loadViews();
	}
}
