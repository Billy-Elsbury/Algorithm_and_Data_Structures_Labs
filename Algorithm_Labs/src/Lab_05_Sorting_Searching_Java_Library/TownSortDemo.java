package Lab_05_Sorting_Searching_Java_Library;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class TownSortDemo {
    public static void main(String[] args) {
        //declare and set towns for Town Array
        Town[] towns = new Town[5];
        towns[0] = new Town("Tralee", "Kerry", 23000);
        towns[1] = new Town("Macroom", "Cork", 3800);
        towns[2] = new Town("Listowel", "Kerry", 4820);
        towns[3] = new Town("Adare", "Limerick", 2650);
        towns[4] = new Town("Killarney", "Kerry", 14500);

        System.out.println("Towns Array:");
        displayArray(towns);


        // Set the name of town to search for
        String searchKey = "Tralee";

        // Search the Array for the town by name
        System.out.println("\nSearching Array for town: " + searchKey);
        int index = -1;

        for (int i = 0; i < towns.length; i++) {
            if (towns[i].getName().equals(searchKey)) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            System.out.println("Found town " + towns[index]);
        } else {
            System.out.println("Town " + searchKey + " not found");
        }





        //declare and set towns for Town ArrayList
        ArrayList<Town> townsArrayList = new ArrayList<>();

        townsArrayList.add(new Town("Tralee", "Kerry", 23000));
        townsArrayList.add(new Town("Macroom", "Cork", 3800));
        townsArrayList.add(new Town("Listowel", "Kerry", 4820));
        townsArrayList.add(new Town("Adare", "Limerick", 2650));
        townsArrayList.add(new Town("Killarney", "Kerry", 14500));

        System.out.println("\nTowns ArrayList:");
        displayArrayList(townsArrayList);

        // Sort the arrayList by name
        Arrays.sort(towns, new Comparator<>() {
            public int compare(Town t1, Town t2) {
                return t1.getName().compareTo(t2.getName());
            }
        });

        // Search for a town by name in the ArrayList
        System.out.println("\nSearching Array for town: " + searchKey);

        int indexArrayList = townsArrayList.indexOf(new Town(searchKey, null, 0));

        if (indexArrayList >= 0) {

            System.out.println("Found town " + townsArrayList.get(indexArrayList));
        } else {
            System.out.println("Town " + searchKey + " not found");
        }


        // Sort the ArrayList by name to fix search
        townsArrayList.sort(new Comparator<>() {
            public int compare(Town t1, Town t2) {
                return t1.getName().compareTo(t2.getName());
            }
        });

        // Search for a town by name
        indexArrayList = Collections.binarySearch(townsArrayList, new Town(searchKey, null, 0), new Comparator<>() {
            public int compare(Town t1, Town t2) {
                return t1.getName().compareTo(t2.getName());
            }
        });

        if (indexArrayList >= 0) {
            System.out.println("Found town " + townsArrayList.get(indexArrayList));
        } else {
            System.out.println("Town " + searchKey + " not found");
        }


    }



    private static void displayArray(Town[] towns) {
        for (int i = 0; i < towns.length; i++) {
            System.out.println(towns[i]);
        }
    }

    private static void displayArrayList(ArrayList<Town> towns1) {
        for (Town t : towns1) {
            System.out.println(t);
        }
    }
}

