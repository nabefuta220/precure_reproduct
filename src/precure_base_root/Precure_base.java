package precure_base_root;

public class Precure_base {
    protected int color;
    protected int id;

    protected Statement state = Statement.NA;

    public Precure_base() {
        // this.color = color;
        this.id = 0;
        this.state = Statement.NA;// NA
        this.color = 0x000000;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void showColor() {
        System.out.println("color:0x" + Integer.toHexString(this.color));
    }
};