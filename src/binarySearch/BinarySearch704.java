package binarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {

        int [] nums = {-1, 0, 3, 5, 9, 12};

        int result1 = search(nums, 9);
        System.out.println(result1);

        int result2 = search(nums, 2);
        System.out.println(result2);
    }
        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid-1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }


    }
