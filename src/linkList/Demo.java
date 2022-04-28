package linkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        placeToVisit.add("Sydney");
        placeToVisit.add("Melbourne");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Canberra");
        placeToVisit.add("Adelaide");
        placeToVisit.add("Darwin");
        placeToVisit.add("Christchurch");
        placeToVisit.add("Wellington");

//        printList(placeToVisit);
//
//        placeToVisit.add(1, "New Place");
//        printList(placeToVisit);
//
//        placeToVisit.remove(4);
//        printList(placeToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        for (String s : linkedList) {
            System.out.println("Now visiting " + s);
        }
        System.out.println("================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        for (String s : linkedList) {
            int comparision = s.compareTo(newCity);
            if (comparision == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparision > 0) {
                // new City
            }
        }
        return true;
    }
}
