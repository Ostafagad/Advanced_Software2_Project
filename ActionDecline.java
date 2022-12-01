
public class ActionDecline implements RequestActionCommand{

	private Request req;
	public ActionDecline(Request req) {
		this.req=req;
	}

	@Override
	public void execute() {
	req.decline();
		
	}

}
