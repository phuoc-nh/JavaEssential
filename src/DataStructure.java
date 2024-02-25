import java.util.*;
import java.util.List;

public class DataStructure {
    public static void main(String[] args) {
        // Array ============================
        int[] numbers = new int[4];
        int[] nums = {1,2,3};
//        System.out.println(Arrays.toString(nums)); // to print value instead pointer
        // List ============================
        List<Integer> n = new ArrayList(); // List Store any data type, user generic <> to specify wanted data type
        n.add(1);
        n.add(2);
        n.add(3);
        System.out.println(n);

        // Set ============================
        Set<Character> characters = new HashSet();
        characters.add('a');
        characters.add('b');
        characters.add('c');

        // Map
        Map<Integer, String> map = new HashMap(
        );
        map.put(1, "abc");
        map.put(2, "x");
        map.put(4, "q");

        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

//        map.computeIfAbsent()

//       Stack
        Stack<Integer> s = new Stack<>();
        s.add(4);
        s.push(2);
//        s.push(1);
        s.pop();
        System.out.println("stack " + s);

        // Queue

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3); // offer return false when queue is full
        queue.add(5); // add will return exception when queue is full
        queue.offer(4);
        queue.poll(); // can handle null queue
        queue.remove(); // if queue empty return exception
        System.out.println("queue " + queue);
//        queue.peek();
//        queue.isEmpty();
//        queue.poll();
//        queue.size();



    }


}
