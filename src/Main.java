import precure_root.*;
import tools.*;
import tropical_rouge_precure_root.*;

public class Main {
	public static void main(String[] args) {
		Precure precure = new Precure();
		// transfromation
		// cure.Summer summer = new cure.Summer();// (a)

		// tropical_rouge_precure summer = Precure.tropical_change("CureSummer");// (b);

		Heartcle_pact pact = new Heartcle_pact();
		tropical_rouge_precure summer = pact.setKey(Heartcle_ring.CureSummer_key);// (c)

		// cure
		precure.otento_summer_strike(summer);

	}
}