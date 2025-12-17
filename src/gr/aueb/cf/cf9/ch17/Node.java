package gr.aueb.cf.cf9.ch17;

/**
 * Declare a class {@link Node}
 * with a private int.
 */

public class Node {
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
