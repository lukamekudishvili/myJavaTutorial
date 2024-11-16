package ArrayListAndLinkedListPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<GroceryItem> groceryItemArrayList= new ArrayList<>();
        while(true) {
            int userInput=0;
            System.out.print("""
                    Available actions:
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                    Enter a number for which action you want to do:
                    """);
            while (true) {
                if (sc.hasNextInt()) {
                    userInput = sc.nextInt();
                    if (userInput < 0 || userInput > 2) {
                        System.out.println("Input should be between 0 - 2 ");
                        continue;
                    }
                    System.out.println("Input is " + userInput);
                    break;
                } else {
                    System.out.println("Invalid input");
                    sc.next();
                }
            }

            if(userInput==0){
                break;
            }else if(userInput==1){
                String namesOfGroceries= sc.next();
                String[] namesOfGroceriesArray=namesOfGroceries.split(", ");
                List<GroceryItem> groceryItemListForAdd=new ArrayList<>();
                for(String groceryName : namesOfGroceriesArray){
                    GroceryItem Item=new GroceryItem(groceryName);
                    groceryItemListForAdd.add(Item);
                }
                addElement(groceryItemArrayList,groceryItemListForAdd);
                System.out.println("After adding elements: "+groceryItemArrayList);
            }else{
                String namesOfGroceries= sc.next();
                String[] namesOfGroceriesArray=namesOfGroceries.split(", ");
                List<GroceryItem> groceryItemListForAdd=new ArrayList<>();
                for(String groceryName : namesOfGroceriesArray){
                    GroceryItem Item=new GroceryItem(groceryName);
                    groceryItemListForAdd.add(Item);
                }
                removeElement(groceryItemArrayList,groceryItemListForAdd);
                System.out.println("After removing elements: "+groceryItemArrayList);
            }

        }
    }

    public static void addElement(ArrayList<GroceryItem> groceryItems, List<GroceryItem> list){
        for(int i=0; i<list.size(); i++){
            if(groceryItems.contains(list.get(i))){
                list.remove(i);
            }
        }
        groceryItems.addAll(list);
    }

    public static void removeElement(ArrayList<GroceryItem> groceryItems, List<GroceryItem> list){
        groceryItems.removeAll(list);
    }
}
