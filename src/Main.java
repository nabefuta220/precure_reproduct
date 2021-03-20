import precure_root.*;
import tools.*;
import tropical_rouge_precure_root.*;

public class Main {
	public static void main(String[] args) {
		Precure precure = new Precure();
		// transfromation
		// cure.Coral coral = new cure.Coral();// (a)

		//tropical_rouge_precure coral = Precure.tropical_change("CureCoral");// (b);

		Heartcle_pact pact = new Heartcle_pact();
		tropical_rouge_precure coral = pact.setKey(Heartcle_ring.CureCoral_key);// (c)

		// cure
		precure.mokomoko_coral_refuseion(coral);

	}
}