package ArrayListAndLinkedListPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayVSArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList= new ArrayList<>();
        for(int i=1; i<=10; i++){
            integerArrayList.add(i);
        }
        System.out.println(integerArrayList);

        ArrayList<Integer> newIntegerArrayList= integerArrayList;
        newIntegerArrayList.removeAll(List.of(5,6,7,8,9,10));
        System.out.println("Integers Array List: "+integerArrayList);
        System.out.println("New Integers Array List: "+newIntegerArrayList);

        newIntegerArrayList.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println("Integers Array List: "+integerArrayList);
        System.out.println("New Integers Array List: "+newIntegerArrayList);

        System.out.println("-----------------------------------------------\n");
        /*-------------------------------------------------------------*/

        Integer[] integerArray= new Integer[10];
        for(int i=1; i<=10; i++){
            integerArray[i-1]=i;
        }

        var originalList=Arrays.asList(integerArray);
        System.out.println(originalList);

        originalList.set(0,40);
        System.out.println("Array: "+Arrays.toString(integerArray));
        System.out.println("list: "+originalList);

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: "+Arrays.toString(integerArray));
        System.out.println("list: "+originalList);

        /*
            Array.asList returned list is not resizeable, but is mutable
            List.of returned List is immutable;


          */

    }
}
