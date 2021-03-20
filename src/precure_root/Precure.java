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
        case "CureCoral":
            return new cure.Coral();
        }
        throw new UnsupportedOperationException("No shch identer to transformation");
    }

    // for cure summer's cure
    public void otento_summer_strike(tropical_rouge_precure summer) {
        if (summer.getId() != tools.Heartcle_ring.CureSummer_key.getId()) {
            throw new UnsupportedOperationException(
                    "id :" + summer.getId() + " cannot use Precure otento summer strike");
        }
        System.out.println("heart rouge rod!");

        System.out.println("precure! otento-summer strike!");
    }

    public void mokomoko_coral_refuseion(tropical_rouge_precure coral) {
        if (coral.getId() != tools.Heartcle_ring.CureCoral_key.getId()) {
            throw new UnsupportedOperationException("id :" + coral.getId() + " cannot use Precure mokomoko_coral_refuseion");
        }
        System.out.println("heart rouge rod!");

        System.out.println("precure! mokomoko-coral refuseion!");
    }
}
