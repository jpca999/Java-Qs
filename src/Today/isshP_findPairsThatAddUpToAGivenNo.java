package Today;


//Q: Given an array of signed, unordered numbers
// Find all pairs that add up to a given number.
//
//
//        Clarifications:
//
//        Only 2-way pairs, not all combinations.
//        They can assume numbers are unique.
//        Encourage them to start simple with a working solution before trying to find optimum solution.
//        Whatever solution they start with, ask them what the bigO complexity is.

// https://www.geeksforgeeks.org/given-two-unsorted-arrays-find-pairs-whose-sum-x/

//Input :  arr1[] = {-1, -2, 4, -6, 5, 7}
//        arr2[] = {6, 3, 4, 0}
//        x = 8
//        Output : 4 4
//        5 3
//
//        Input : arr1[] = {1, 2, 4, 5, 7}
//        arr2[] = {5, 6, 3, 4, 8}
//        x = 9
//        Output : 1 8
//        4 5
//        5 4

import java.util.HashMap;
import java.util.Map;
public class isshP_findPairsThatAddUpToAGivenNo {

    // Find all the pairs that add up to a given number.
    //
    public static void main(String[] args) {

        int nums1[] = {-1, -2, 4, -6, 5, 7};
        int nums2[] = {6, 3, 4, 0};
        int targetSum = 8;

        // Solution 2 is Binary Search Tree  -  https://www.geeksforgeeks.org/given-two-unsorted-arrays-find-pairs-whose-sum-x/
// hashmap  - https://leetcode.com/problems/finding-pairs-with-a-certain-sum/solutions/1211331/my-java-solution-using-concept-of-2-sum-problem/?orderBy=most_votes&languageTags=java

        Map<Integer, Integer> totalPairsMap = new HashMap<>();
        // in both the arrays , Try    targetSum - arr2[i] = arr1[i]  // if yes  insert/ put it into the map.
        for (int number : nums2) {
                System.out.println("48---nums ="+ number);
//            map.put(number, map.getOrDefault(number, 0) + 1);
        }




//        int index = 0;
//        int val = 0;
//
//        FindSumPairs obj = new FindSumPairs(nums1, nums2);
//
//        obj.add(index,val);
//        int tot = 3;
//        int param_2 = obj.count(tot);


//        Find all pairs that add up to a given number.
        // It has to do two  iterations ,
        // pick one element from first array and comput it with the elements of 2nd array.


        // It has to do two  iterations ,
        // pick one element from first array and comput it with the elements of 2nd array.
    }
}


// Solution 2 is Binary Search Tree  -  https://www.geeksforgeeks.org/given-two-unsorted-arrays-find-pairs-whose-sum-x/
// hashmap  - https://leetcode.com/problems/finding-pairs-with-a-certain-sum/solutions/1211331/my-java-solution-using-concept-of-2-sum-problem/?orderBy=most_votes&languageTags=java


class FindSumPairs {

    private int [] nums1;
    private int [] nums2;
    Map<Integer, Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int number : nums2) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

    }

    public void add(int index, int val) {
        map.put(nums2[index], map.get(nums2[index]) - 1);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {
        int result = 0;
        for (int number : nums1) {
            if (map.containsKey(tot - number)) {
                result += map.get(tot - number);
            }
        }
        return result;
    }
}

