package Generics;

import java.util.ArrayList;

public class LargestElemet {

    public static void main(String[] args)
    {
   ArrayList<Integer> list = new ArrayList<>();
   for(int i = 0 ;  i < 10 ; i++)
   {
       list.add(i);
   }
        System.out.println("Largest element is " + max(list));
    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list)
    {
        E maxElemnt = list.get(0);
        for(E element : list)
        {
            if(element.compareTo(maxElemnt) > 0)
            {
                maxElemnt = element;
            }
        }
        return maxElemnt;

    }
}
