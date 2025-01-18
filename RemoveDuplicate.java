package Generics;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args)
    {
       ArrayList<String>orginalList = new ArrayList<>();
       orginalList.add("Apple");
       orginalList.add("Apple");
       orginalList.add("banana");

        ArrayList<String> uniqueList = removeDuplicates(orginalList);
        System.out.println("Original List: " + orginalList);
        System.out.println("Unique List: " + uniqueList);

    }

    public static <E>ArrayList<E> removeDuplicates (ArrayList<E> list)
    {
        ArrayList<E> uniqueList = new ArrayList<>();
        for(E element : list)
        {
            if(!uniqueList.contains(element))
            {
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }
}
