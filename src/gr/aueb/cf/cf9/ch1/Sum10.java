package gr.aueb.cf.cf9.ch1;

public class Sum10 {
    public static void main(String[] args) {
        int sum = 1;
        int i = 1;

        while (i <= 10){
            sum *= i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
