import cure.Papaya;
import precure_root.*;
import tools.*;
import tropical_rouge_precure_root.*;

public class Main {
	public static void main(String[] args) {
		Precure precure = new Precure();
		// transfromation
		// cure.Papaya papaya = new cure.Papaya();// (a)

		// tropical_rouge_precure papaya = Precure.tropical_change("CurePapaya");// (b);

		Heartcle_pact pact = new Heartcle_pact();
		tropical_rouge_precure papaya = pact.setKey(Heartcle_ring.CurePapaya_key);// (c)

		// cure
		precure.panpaka_papaya_shot(papaya);

	}
}