import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        System.out.println(uniqueCharacters("labamba"));
        // Should print out:
        // ["n", "g", "r", "m"]
    }

    public static String uniqueCharacters(String text) {
        //creating hashmap with characters as keys and their occurrence as value
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        // iterating through the hashmap to find keys having a value of 1, adding them to new list
        List<Character> keys = new ArrayList<Character>();
        for (Character key : map.keySet()) {
            if (map.get(key).equals(1)) {
                keys.add(key);
            }
        }
        return keys.toString();
    }
}

