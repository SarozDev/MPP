package Lab11;

import java.util.*;

public class prob1 {
    public static double sum(Collection<? extends Number> nums){
        double s = 0.0;

        for(Number d:nums){
            s+=d.doubleValue();
        }
        return  s;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        List<? extends Number> nums = integerList; //Compiler error here.
        double dbl = sum(nums);
        //nums.add(3.14); //get and put principle for bounded wildcards, ? extends T only works to get.

        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("one");
        List<? super Integer> ints = objs;
        ints.add(3);



    }

    public static Integer max0(List<Integer> list){
        Integer max = list.get(0);

        for(Integer item:list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T max1(List<T> list){
        T max = list.get(0);

        for(T item:list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }

}
