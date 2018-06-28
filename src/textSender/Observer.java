package textSender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Observer {
	private List<AbstractView> viewsList;
	
	public Observer() {
		this.viewsList = new ArrayList<AbstractView>();
	}
	
	public void addView(AbstractView av) {
		this.viewsList.add(av);
	}
	
	public void update(String message) {
		System.out.println(message + " IN OBSERVER");
		for(AbstractView v : this.viewsList) {
			System.out.println(v.toString());
			v.setText(message);
		}
	}
	
	public void loadViews() throws IOException {
		for(AbstractView v : this.viewsList) {
			System.out.println(v.toString());
			v.loadView();
		}
	}
}
