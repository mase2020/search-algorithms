
package search;

import java.io.IOException;

/**
 * Test program for the Search class.
 */
public class SearchTest {

    /**
     * Test program for the Search class.
     * Put whatever tests you like in the body of the method.
     * @param args the command line arguments
     * @throws IOException of error reading the input
     */
    public static void main(String[] args) throws IOException {
        // Don't change this line
        final SearchJ search = new SearchJ();

        // You can set this to any of the text files in the data folder
        final FileStrings strings = new FileStrings("data/tiny.txt");

        // add your tests here
        System.out.println(search.longestWord(strings));
        System.out.println(search.countUnique(strings));
        System.out.println(search.findElement(strings, "ziggurat"));
        System.out.println(search.countGreaterOrEqual(strings, "its"));
    }

}
