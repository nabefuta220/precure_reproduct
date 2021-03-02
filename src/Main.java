import precure_root.*;
import tools.*;
import tropical_rouge_precure_root.*;

public class Main {
    public static void main(String[] args) {
        Precure precure = new Precure();
        // transfromation

        // tropical_rouge_precure summer = precure.tropical_change("CureSummer")//(a);
        // cure.Summer summer= new cure.Summer();//(b)
        /*
         * Heartcle_pact pact = new Heartcle_pact(Heartcle_ring.CureSummer_key);
         * tropical_rouge_precure summer = pact.setKey();//(c)
         */
        Heartcle_pact pact = new Heartcle_pact();
        tropical_rouge_precure summer = pact.setKey(Heartcle_ring.CureSummer_key);// (d)

        // precure.otento_summer_strike(summer);

    }
}