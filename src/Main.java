import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            displayMenu();
            int choice = input.nextInt();

            if (choice == 1){
                //add

                System.out.print("Enter a number: ");
                numbers.add(input.nextInt());
                System.out.println("Added");
            }

            else if (choice == 2){
                //remove
                System.out.println("enter number you to be removed: ");
                int elementToRemove = input.nextInt();

                if (numbers.contains(elementToRemove)){
                                    //new ways of creating an integer object  : Integer.valueOf(elementToRemove)
                           // integer class  //static method valueOf()
                    numbers.remove(Integer.valueOf(elementToRemove));
                System.out.println("the number was removed");
                }
                else System.out.println("not found");
            }
            else if (choice == 3) {
            //display
                System.out.println("your list is: " + numbers);
            }

            else if (choice == 4) {
                //exit the loop
                System.out.println("Good bye");
                break;
            }
        }
    }

    private static void displayMenu(){
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your choice: ");

    }

    private static void removeInteger() {

    }

    public static void addIntegerToList() {

        System.out.println("1. Add");
    }

}