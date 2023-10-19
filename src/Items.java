import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfNames = new ArrayList<>();

        System.out.println("Enter as many names as you want.");
        System.out.println("Entering nothing will stop the program.");

        while (true) {
            System.out.println("Name: ");
            String userInput = scanner.nextLine();
            listOfNames.add(String.valueOf(new Item(userInput)));  // Passing userInput as a parameter for the Item constructor
            // then adding it to the list

            if (userInput.equals("")) {
                for (String elements : listOfNames) {
                    System.out.println(elements);
                }
                break;
            }
        }
    }
}
