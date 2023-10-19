import java.util.ArrayList;

public class ArrayListNotes {
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<>();
        String name = "Adam";
        listOfNames.add(name);
        listOfNames.add("Bob");
        listOfNames.add("Charles");

        System.out.println(listOfNames);

        // several repeat statements to go through the index of lists:

        // while statement:
        int i = 0;
        while (i < listOfNames.size()) {
            System.out.println(listOfNames.get(i));
            i++;
        }

        // for statement:
        for (int index = 0; index < listOfNames.size(); index++) {
            System.out.println(listOfNames.get(index));
        }

        // for each loop (no index):
        for (String names : listOfNames) {
            System.out.println(names);
        }
    }
}
