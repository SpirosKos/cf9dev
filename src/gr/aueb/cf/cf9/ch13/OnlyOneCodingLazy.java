package gr.aueb.cf.cf9.ch13;

public class OnlyOneCodingLazy {
    private static OnlyOneCodingLazy instance; // null

    private OnlyOneCodingLazy(){}

    public OnlyOneCodingLazy getInstance(){
        if (instance == null){
            instance = new OnlyOneCodingLazy();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Doing something");
    }
}
