package gr.aueb.cf.cf9.methods;

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        //add(a,b) or AddApp.add(a,b) add inside class AddApp
        sum = AddApp.add(a,b);


        System.out.println("Sum = " + sum);
    }

    /**
     * Add two integers.
     *
     * @param a int
     * @param b int
     * @return int
     */
    public static int add(int a, int b){
       return a + b;
    }
}
