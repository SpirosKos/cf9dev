package gr.aueb.cf.cf9.methods;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int choice;
        int result = 0;

        while (true){
            printMenu();
            choice = getOneInt();

            if(!isChoiceValid(choice)){
                System.out.println("Error. Choice must be between 1-6. Try again.");
                continue;
            }
            if (choice == 6){
                System.out.println("Exit....");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    //Prints Menu
    public static void printMenu(){
        System.out.println("Choose from below");
        System.out.println("1. Plus");
        System.out.println("2. Minus");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
    }

    //Get an int
    public static int getOneInt(){
        return scanner.nextInt();
    }

    //Gets an int for choice check
    public static boolean isChoiceValid(int choice){
//        if (choice >= 1 && choice <= 6){
//            return true;
//        }else {
//            return false;
//        }
        return choice >= 1 && choice <= 6;
    }

    //Does the math
    public static int getResultOnChoice(int choice){
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Insert 2 integers");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice){
            case 1:
                result = add(num1 , num2);
                break;
            case 2:
                result = sub(num1 , num2);
                break;
            case 3:
                result = mul(num1 , num2);
                break;
            case 4:
                result = div(num1 , num2);
                break;
            case 5:
                result = mod(num1 , num2);
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
        return result;
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        if (b == 0 ) return 0;
        return a / b;
    }

    public static int mod(int a, int b){
        if (b == 0 ) return 0;
        return a % b;
    }
}
