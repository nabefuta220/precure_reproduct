package precure_base_root;

public enum Statement {
    NA(1), inter_transformation(2), ready(3);

    private int id;

    private Statement(int id) {
        this.id = id;
    }

    public boolean cheak_statement(Statement state) {
        return (state.id) == this.id;
    }

};