package Generics;

import java.util.ArrayList;

public class Sort {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<10 ;i++)
        {
            list.add(i);
        }
        sort(list);
        System.out.println(list);
    }


    public static <E extends Comparable<E>> void sort(ArrayList<E> list)
    {
        for (int i = 0; i < list.size()-1; i++) {
            int minIndex = i;
            for(int j = i+1 ; j< list.size() ; j++)
            {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            E temp = list.get(minIndex);
            list.set(minIndex,list.get(i));
            list.set(i, temp);
        }
    }
}
