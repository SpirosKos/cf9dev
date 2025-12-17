package gr.aueb.cf.cf9.ch17;

public class FlexibleNode {
    private Object value;

    public FlexibleNode(){

    }

    public FlexibleNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
