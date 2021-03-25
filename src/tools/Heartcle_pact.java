
package tools;

import cure.Coral;
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
            return new cure.Summer();
        } else if (key.checkId(Heartcle_ring.CureCoral_key)) {
            return new cure.Coral();
        } else if (key.checkId(Heartcle_ring.CurePapaya_key)) {
            return new cure.Papaya();
        } else {
            throw new UnsupportedOperationException("No shch identer to transformation");
        }
    }

    // change key
    public tropical_rouge_precure setKey(Heartcle_ring key) {
        this.key = key;
        return setKey();

    }
}
