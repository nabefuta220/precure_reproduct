
package tools;

import precure_root.Precure;
import tropical_rouge_precure_root.*;

public class Heartcle_pact {

    private Heartcle_ring key;

    // inital
    public Heartcle_pact(Heartcle_ring key) {
        this.key = key;
    }

    public Heartcle_pact() {
        this.key = Heartcle_ring.None;
    }

    public tropical_rouge_precure setKey() {
        System.err.println("key :" + key.toString());
        if (key.checkId(Heartcle_ring.CureSummer_key)) {
            return Precure.tropical_change("CureSummer");
        } else {
            return null;
        }
    }

    // change key
    public tropical_rouge_precure setKey(Heartcle_ring key) {
        this.key = key;
        return setKey();

    }
}
