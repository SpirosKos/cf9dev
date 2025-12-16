package gr.aueb.cf.cf9.ch6;

public class ArrayInitializerApp {

    public static void main(String[] args) {

        //First way for Array Initializer
        int ages[];
        ages = new int[] {1, 2, 3, 4};

        //2nd way for Array Initializer
        //int[] ages = new int[] {1, 2, 3, 4,}

        for(int i = 0; i < ages.length; i++){
            System.out.print(ages[i]);
        }
    }
}
