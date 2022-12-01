
public class ActionAccept implements RequestActionCommand{
	private Request req;
	public ActionAccept(Request req) {
		this.req=req;
	}

	@Override
	public void execute() {
	req.accept();
		
	}

}
