
public class AskforRefund implements BaseCommand{

	@Override
	public void execute(Transaction t) {
		DataBase.getdb().refunds.add(t);
	}

}
