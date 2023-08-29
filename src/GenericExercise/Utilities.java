package GenericExercise;

import java.util.*;

public class Utilities{
    public Utilities() {

    }

    public static <T> void printElement(List<T> list){
        for (T element: list) {
            System.out.println(element);
        }
    }

    public static <T> void copyList(List<? extends T> list, Collection<? super T> newList){
        newList.addAll(list);
    }
}
