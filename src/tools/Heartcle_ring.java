package tools;

public enum Heartcle_ring {
    None(0x00000000), CureSummer_key(0X0000254),;

    private int id;

    private Heartcle_ring(int id) {
        this.id = id;
    }

    public boolean checkId(Heartcle_ring key) {
        return this.id == key.id;
    }

    public int getId() {
        return this.id;
    }

}