package cure;

import precure_base_root.Statement;
import tropical_rouge_precure_root.*;

public class Coral extends tropical_rouge_precure {

    // transformation
    public Coral() {
        super();
        this.color = 0xeb80f4;
        // put on

        this.state = Statement.inter_transformation;
        System.out.println("precure tropical change!");
        System.out.println("Let's make catch!");
        System.out.println("lip!");
        System.out.println("eyes!");
        System.out.println("hair!");
        System.out.println("cheek!");
        System.out.println("dress!");
        this.id = tools.Heartcle_ring.CureCoral_key.getId();
        // determin
        System.out.println("Exciting jewel summer! Cure Coral!");
        this.state = Statement.ready;
    }

    public void crossGuard() {
        System.err.println("guard");
    }
}