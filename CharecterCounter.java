package workshop;
import java.util.HashMap;
import java.util.Map;
public class CharecterCounter {
        public static void main(String[] args) {
            String input = "Absbsbbd";
            Map<Character, Integer> counts = new HashMap<>();

            for (char a : input.toCharArray()) {
                if (counts.containsKey(a)) {
                    counts.put(a, counts.get(a) + 1);
                } else {
                    counts.put(a, 1);
                }
            }
            for (char c : counts.keySet()) {
                System.out.println(c + " = " + counts.get(c));
            }
        }
    }