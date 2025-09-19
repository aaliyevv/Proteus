package binarySearch;

import java.util.HashMap;
import java.util.HashSet;

public class BinarySearch217 {

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,1};
        System.out.println(ContainsDuplicate(nums1));

        int [] nums2 = {1,2,3,4};
        System.out.println(ContainsDuplicate(nums2));

        int [] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(ContainsDuplicate(nums3));
    }
    public static boolean ContainsDuplicate (int [] nums){
        HashSet seen = new HashSet<>();

        for (int num : nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
