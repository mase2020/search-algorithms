
package search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class of operations on ordered lists of strings.
 * You should fill in the bodies of these methods.
 */
public class SearchJ {

    /**
     * Returns the index of the longest string in the list.
     * If there are several string of this length, the
     * indexed returned is the that of the first.
     *
     * @param a list of strings, in ascending order
     * @return position of an entry with the longest string in the list
     */
    public int longestWord(StringList a) {

// index 0 will be compared to index 1. if index 1 is longer,
// then longestWord will be replaced. and so on.
        String longestWord = a.get(0);
        int position = 0;
        for (int i = 1; i < a.size(); i++) {

            if (a.get(i).length() > longestWord.length()) {
                position = i;
                longestWord = a.get(i);
            }
        }

        return position;
    }


    /**
     * Returns the number of unique elements in the list
     *
     * @param a list of strings, in ascending order
     * @return number of unique elements in the list.
     */
    public int countUnique(StringList a) {
        // Hashsets do not allow duplicates to be added.
        HashSet<String> unique = new HashSet<>();
        for (int i = 1; i < a.size(); i++) {
            unique.add(a.get(i));
        }
        // as it starts counting from 0, you need to add 1.
        return unique.size() + 1;

    }

    /**
     * Search for a string in an ordered collection
     *
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return position of an element equal to k, if any, otherwise -1
     */
    public int findElement(StringList a, String k) {

        int min = 0;
        int max = a.size()-1;
        while (min <= max) {
            int mid = (min + max) / 2;

            int result = k.compareTo(a.get(mid));

//            if k is present in mid, then 0 will be returned
            if (result == 0)
                return mid;

            // If k is greater, > 1 will be returned and the left half will be ignored
           else if (result > 0)
                min = mid + 1;

                // If k is smaller, < 1 will be returned and the left half will be ignored
            else
                max = mid - 1;
        }

        return -1;
    }


    /**
     * Position of a string in an ordered collection
     *
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return number of strings in the collection a greater than or equal to k
     */
    public int countGreaterOrEqual(StringList a, String k) {

        int min =0;
        int max = a.size()-1;
// how many are greater than k
        int greater = a.size()-1 ;

        while(min <= max) {
            int mid = (min + max)  / 2;

            int result = k.compareTo(a.get(mid));

//if k is greater than mid then greater == mid and min changes value.

            if ( result > 0) {
                greater = mid ;
                min = mid + 1;


            } else
                max = mid - 1;

        }
        return (a.size()-1 -greater);
            }



}