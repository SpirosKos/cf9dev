package gr.aueb.cf.cf9.ch6;

public class BooleanAggregates {

    public static boolean moreThanTwoEvens(int[] arr){
        int count = 0;

        for (int el : arr){
            if (el % 2 == 0) count++;
            //if (count > 2) return true; // early exit
        }

        //return false
        return  count > 2;
    }

    /**
     * Traverses an array if involves more than
     * two odd numbers
     *
     * @param arr source array
     * @return
     */
    public static boolean moreThanTwoOdds(int[] arr){
        if (arr == null) return false;
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0){
                odds++;
            }
        }
        return odds > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++){
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2){
                count++;
                break;
                //return true;
            }
        }

        //return false;
        return count >= 1;
    }

    public static boolean moreThanTwoSameEndings(int[] arr){
        if (arr == null) return false;

        int endings[] = new int[10];
        for (int num : arr){
            if (++endings[num % 10] >= 3){
                return true;
            }
        }
        return false;
    }
}
