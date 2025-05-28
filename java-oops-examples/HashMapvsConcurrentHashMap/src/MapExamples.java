import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapExamples {
    public static void main(String[] args) {
        // Not thread-safe
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);

        // Thread-safe
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("two", 2);
    }
}