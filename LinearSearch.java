package Generics;

public class LinearSearch {
    public static void main(String[] args)
    {


        Integer[] list = new Integer[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        System.out.println(linearSearch(list, 1));
        System.out.println(linearSearch(list, 15));
        System.out.println(linearSearch(list, 40));

    }


    public static <E extends Comparable<E> >int linearSearch(E[] list, E key)
    {
        for (int i = 0; i < list.length ; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
return -1;
    }
}
