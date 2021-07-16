
package search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class of operations on ordered lists of strings.
 * You should fill in the bodies of these methods.
 */
public class Search {

    /**
     * Returns the index of the longest string in the list.
     * If there are several string of this length, the
     * indexed returned is the that of the first.
     * @param a list of strings, in ascending order
     * @return position of an entry with the longest string in the list
     */
    public int longestWord(StringList a) {

        // replace the following line with your implementation
        String longestWord = a.get(0);
        int position = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).length() > longestWord.length()) {
                position = i;
                longestWord = a.get(i);


            }
        }System.out.println(longestWord);
        return position;
    }


    /**
     * Returns the number of unique elements in the list
     * @param a list of strings, in ascending order
     * @return number of unique elements in the list.
     */
    public int countUnique(StringList a) {
       // Hashsets do not allow duplicates to be added.
        HashSet<String> unique = new HashSet<>();
        for (int i = 1; i<a.size(); i++){
            unique.add(a.get(i));
        }
        // as it starts counting from 0, you need to add 1.
        return unique.size() +1;

    }

    /**
     * Search for a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return position of an element equal to k, if any, otherwise -1
     */
    public int findElement(StringList a, String k) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Position of a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return number of strings in the collection a greater than or equal to k
     */
    public int countGreaterOrEqual(StringList a, String k) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

}