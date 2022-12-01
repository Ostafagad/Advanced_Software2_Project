
public class RefundMenu {

	private RequestActionCommand acceptCommand;
    private RequestActionCommand declineCommand;
 
    public RefundMenu(RequestActionCommand accept, RequestActionCommand decline) {
        this.acceptCommand = accept;
        this.declineCommand = decline;
    }
    public void clickAccept(){
    	acceptCommand.execute();
    }
    public void clickDecline(){
    	declineCommand.execute();
    }

}
