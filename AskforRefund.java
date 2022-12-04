
public class AskforRefund implements BaseCommand{

	@Override
	public void execute(Transaction t) {
		Admin.getAdmin().refunds.add(t);
	}

}
