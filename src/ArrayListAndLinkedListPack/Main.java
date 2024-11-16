package ArrayListAndLinkedListPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }

}

public class Main {
    public static void main(String[] args) {
//        GroceryItem[] groceryItem = new GroceryItem[3];
//        groceryItem[0] = new GroceryItem("Milk");
//        groceryItem[1] = new GroceryItem("Apples","Fruit",6);
//        groceryItem[2]= new GroceryItem("5 oranges");
//        System.out.println(Arrays.toString(groceryItem));

        ArrayList objectList= new ArrayList(); // no

        ArrayList<GroceryItem> groceryItems= new ArrayList<>();
        groceryItems.add(new GroceryItem("Milk"));
        groceryItems.addAll(List.of(new GroceryItem("Butter"), new GroceryItem("Bread"),
                new GroceryItem("sugar")));
        System.out.println(groceryItems);

        ArrayList<String> stringArrayList= new ArrayList<>();
        stringArrayList.add("Luka");
        System.out.println(stringArrayList);
        stringArrayList.remove(0);
        System.out.println(stringArrayList);

        stringArrayList.add("Luka");
        System.out.println(stringArrayList);
        stringArrayList.remove("Luka");
        System.out.println(stringArrayList);

        stringArrayList.addAll(List.of("Luka", "Nukri", "Mariami", "Liza"));
        System.out.println(stringArrayList);
        stringArrayList.set(3,"Rusiko");
        System.out.println(stringArrayList);
        stringArrayList.removeAll(List.of("Luka", "Nukri", "Mariami", "Liza"));
        System.out.println(stringArrayList);

        stringArrayList.clear();
        stringArrayList.addAll(List.of("Luka", "Nukri", "Mariami", "Liza"));
        System.out.println(stringArrayList);

        stringArrayList.retainAll(List.of("Luka", "Nukri"));
        System.out.println(stringArrayList);
        stringArrayList.addAll(List.of("Luka", "Nukri", "Mariami", "Liza"));
        System.out.println(stringArrayList);

        System.out.println(stringArrayList.get(2));

        if(stringArrayList.contains("Luka")){
            System.out.println("String Array contains the word \"Luka\"");
        }
        if(stringArrayList.containsAll(List.of("Luka","Nukri","Liza"))){
            System.out.println("contains Luka Nukri Liza words");
        }
        System.out.println("First = "+stringArrayList.indexOf("Luka"));
        System.out.println("Last= "+stringArrayList.lastIndexOf("Luka"));

        System.out.println(stringArrayList);
        stringArrayList.removeAll(List.of("Luka","Liza"));
        System.out.println(stringArrayList);
        stringArrayList.clear();

        System.out.println(stringArrayList.isEmpty());


        stringArrayList.addAll(List.of("Luka", "Nukri", "Mariami", "Liza"));
        stringArrayList.addAll(Arrays.asList("Shorena", "Natia", "Rusiko","Beka","Khatia"));
//        System.out.println(stringArrayList);
//        stringArrayList.sort(Comparator.naturalOrder());
//        System.out.println(stringArrayList);
//        stringArrayList.sort(Comparator.reverseOrder());
//        System.out.println(stringArrayList);
//
//        var stringToArray=stringArrayList.toArray(new String[0]);
//        System.out.println(Arrays.toString(stringToArray));
        System.out.println(stringArrayList);



    }
}
