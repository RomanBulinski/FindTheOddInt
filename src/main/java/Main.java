import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


//    int[]{1,1,2,-2,5,2,4,4,-1,-2,5}


    public static int findIt(int[] a) {

        int result = 0;

        Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();

        for (int n : a) {
            if (counterMap.containsKey(n)) {
                counterMap.remove(n);
            } else if (!counterMap.containsKey(n)) {
                counterMap.put(n, 1);
            }
        }

        return new ArrayList<Integer>(counterMap.keySet()).get(0);
    }


}
