package textSender;

import java.io.IOException;

public abstract class AbstractView {
	protected String message;
	
	public abstract void setText(String msg);
	
	public abstract void loadView() throws IOException;
	
	public abstract Object getController();
}
