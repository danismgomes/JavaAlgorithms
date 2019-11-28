
public class MergeTwoSortedList_21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//    }



//    public List<Integer> topKFrequent(int[] nums, int k) {
//        List<Integer> result = new ArrayList<>();
//        Map<Integer, Integer> countNumbers = new HashMap<>(); // O(n) space
//        for(int n : nums) { // O(n)
//            countNumbers.put(n, countNumbers.getOrDefault(n, 0)+1);
//        }
//        List<Integer>[] buckets = new LinkedList[nums.length+1]; // O(n) space
//        for(int key : countNumbers.keySet()) { // O(n)
//            int freq = countNumbers.get(key);
//            if(buckets[freq] == null) {
//                buckets[freq] = new LinkedList<Integer>();
//            }
//            buckets[freq].add(key);
//        }
//        for(int i = nums.length, count = 0; count < k && i >= 0; i--) {
//            if(buckets[i] != null) {
//                count += buckets[i].size();
//                result.addAll(buckets[i]);
//            }
//        }
//        return result;
//    }
}
