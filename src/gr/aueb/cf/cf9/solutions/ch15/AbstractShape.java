package gr.aueb.cf.cf9.solutions.ch15;

public abstract class AbstractShape implements IShape {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public Long getID() {
        return id;
    }
}
