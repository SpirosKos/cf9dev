package gr.aueb.cf.cf9.methods;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Succeed insert");
                    break;
                case 2:
                    System.out.println("Succeed delete");
                    break;
                case 3:
                    System.out.println("Succeed update");
                    break;
                case 4:
                    System.out.println("Succeed search");
                    break;
                case 5:
                    System.out.println("Succeed exit");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }while(choice != 5);
    }

    public  static void printMenu(){
        System.out.println("Choose one of the options");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }
}
