package ArrayListAndLinkedListPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<GroceryItem> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> {
                    addItems(groceries);
                    System.out.println("After adding items: " + groceries);
                }
                case 2 -> {
                    removeItems(groceries);
                    System.out.println("After removing items: " + groceries);
                }
                default -> flag = false;
            }
//            groceries.sort(Comparator.naturalOrder());
        }
    }

    private static void addItems(ArrayList<GroceryItem> groceries) {
        String[] itemNames = sc.nextLine().split(",");
        GroceryItem[] groceriesArray = new GroceryItem[itemNames.length];
        for (int i = 0; i < itemNames.length; i++) {
            String trimmed = itemNames[i].trim();
            groceriesArray[i] = new GroceryItem(trimmed);

        }
    }

    private static void removeItems(ArrayList<GroceryItem> groceries) {
        String[] itemNames = sc.nextLine().split(",");
        GroceryItem[] groceriesArray = new GroceryItem[itemNames.length];
        for (int i = 0; i < itemNames.length; i++) {
            groceriesArray[i] = new GroceryItem(itemNames[i]);
        }

        groceries.removeAll(List.of(groceriesArray));
    }

    private static void printActions() {
        String action = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do: """;
        System.out.println(action);
    }
}
