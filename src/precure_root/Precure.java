package precure_root;

import precure_base_root.Precure_base;
import tropical_rouge_precure_root.tropical_rouge_precure;

public class Precure {

    public Precure() {

    }

    // for cure summer's transformation
    public static tropical_rouge_precure tropical_change(String identer) {
        switch (identer) {
            case "CureSummer":
                return new cure.Summer();
        }
        throw new UnsupportedOperationException("No shch identer to transformation");
    }

    // for cure summer's cure
    public void otento_summer_strike(Precure_base summer) {
        if (summer.getId() != tools.Heartcle_ring.CureSummer_key.getId()) {
            throw new UnsupportedOperationException(
                    "id :" + summer.getId() + "cannot use Precure otento summer strike");
        }
        System.out.println("heart rouge rod!");

        System.out.println("precure! otento summer strike!");
    }
}
