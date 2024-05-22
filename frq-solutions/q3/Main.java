import java.util.*;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("an", "band", "band", "abandon"));
        WordChecker wc1 = new WordChecker(wordList1);
        System.out.println("isWordChain: " + wc1.isWordChain()); // Expected: true

        ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("to", "too", "stool", "tools"));
        WordChecker wc2 = new WordChecker(wordList2);
        System.out.println("isWordChain: " + wc2.isWordChain()); // Expected: false

        // Test cases for createList
        ArrayList<String> wordList3 = new ArrayList<>(Arrays.asList("catch", "bobcat", "catchacat", "cat", "at"));
        WordChecker wc3 = new WordChecker(wordList3);

        System.out.println(wc3.createList("cat")); // Expected: ["ch", "chacat", ""]
        System.out.println(wc3.createList("catch")); // Expected: ["", "acat"]
        System.out.println(wc3.createList("dog")); // Expected: []
    
    
  }
}
