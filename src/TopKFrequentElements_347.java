import java.util.*;

public class TopKFrequentElements_347 {
    public static List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList();
        List<Integer>[] storage = new LinkedList[nums.length+1];

        for (int i = 0; i <nums.length ; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (storage[value] == null){
                storage[value] = new LinkedList<Integer>();
            }
            storage[value].add(key);
        }

        for(int i = nums.length, count = 0; count < k && i >= 0; i--) {
            if(storage[i] != null) {
                count += storage[i].size();
                list.addAll(storage[i]);
            }
        }

        return list;
    }
}

