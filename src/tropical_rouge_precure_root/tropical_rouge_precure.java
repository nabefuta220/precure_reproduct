package tropical_rouge_precure_root;

import precure_base_root.*;
import tools.Heart_rouge_rod;

public class tropical_rouge_precure extends Precure_base {

    public Heart_rouge_rod heart_rouge_rod;

    public tropical_rouge_precure() {
        
        super();
        if (this.state == Statement.ready) {
            System.out.println("already transsited!");
            throw new UnsupportedOperationException();
        }
        heart_rouge_rod = new Heart_rouge_rod();
    }

}
