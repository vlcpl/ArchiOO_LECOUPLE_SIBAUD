package textSender;

public class Controller {
	private static Observer obs = new Observer();
	
	public static void addView(AbstractView avCesar) {
		obs.addView(avCesar);
	}
	
	public static void update(String message) {
		System.out.println(message + " IN CONTROLLER");
		obs.update(message);
	}
}
