import java.util.*;

public class TestMap {

    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Sarah", 99);
        scores.put("David", 88);
        scores.put("Pat", 77);

        System.out.println(scores);
        System.out.println(scores.get("Pat"));
    
    }
}