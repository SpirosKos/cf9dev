package gr.aueb.cf.cf9.ch6;

public class SearchArrayWithMethod {
    public static void main(String[] args) {
        int quantities[] = {100, 200, 300};
        int position = 0;
        int value = 10;

        position = getElementPosition(quantities, value);

        System.out.println("Position: " + position);
        //Με τα % δεν μπορεις να print αν πινακας null ή δεν βρισκει το στοιχειο.
        //System.out.printf("Position: %d, Value: %d,",position , quantities[position]);
    }
    public static int getElementPosition(int arr[], int value){
        if (arr == null) return -1;

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
