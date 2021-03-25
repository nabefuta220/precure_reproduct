package cure;

import precure_base_root.Statement;
import tropical_rouge_precure_root.*;

public class Papaya extends tropical_rouge_precure {

    // transformation
    public Papaya() {
        super();
        this.color = 0xfee213;
        // put on

        this.state = Statement.inter_transformation;
        //
        System.out.println("precure tropical change!");
        System.out.println("Let's make catch!");
        System.out.println("cheek!");
        System.out.println("lip!");
        System.out.println("hair!");
        System.out.println("eyes!");
        System.out.println("dress!");
        this.id = tools.Heartcle_ring.CurePapaya_key.getId();
        System.out.println("Exciting fruit! Cure Papaya!");
        this.state = Statement.ready;
    }

    public void eyesBeam() {
        System.err.println("beam");
    }
}