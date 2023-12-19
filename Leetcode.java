import java.util.HashMap;

public class Leetcode {
    public static void missingNumber_1() {
        int[] a = { 1, 2, 4, 3 };
        int n = a.length + 1;
        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor ^= i;

        }
        for (int i : a) {
            xor ^= i;
        }
        System.out.print(xor);
    }

    public static void singleNumber() {
        int[] a = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        int n = a.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ a[i];
        }
        System.out.println(xor);
    }

    public static void missingNumber_2() {
        int[] a = { 0, 1, 2, 3, 5 };
        int n = a.length;
        int xor = a.length;
        for (int i = 0; i < n; i++) {
            xor = xor ^ i ^ a[i];
        }
        System.out.println(xor);
    }

    public static void missingNumber_3() {
        int[] a = { 1, 2, 3, 5 };
        int n = a.length;
        int xor = 0;
        for (int i = 0; i < n + 1; i++) {
            xor = xor ^ (i + 1) ^ a[i];
        }
        System.out.println(xor);
    }

    public static void twoSum_1() {
        int[] a = { 2, 7, 11, 19 };
        int target = 9;
        int n = a.length;
        int[] b = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target) {
                    b[0] = i;
                    b[1] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static void twoSum_2() {
        int[] nums = { 2, 3, 5, 7 };
        int target = 9;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static void maxProduct() {
        int[] nums = { 3, 4, 5, 6 };
        int result = 0;
        int maxpro = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = Math.max(result, (maxpro - 1) * (nums[i] - 1));
            maxpro = Math.max(maxpro, nums[i]);
        }
        System.out.print(result);
    }

    public static void sortColors() {
        int[] a = { 2, 0, 2, 1, 1, 0 };
        int n = a.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        // missingNumber_1();
        // missingNumber_2();
        // missingNumber_3();
        // singleNumber();
        // twoSum_1();
        // twoSum_2();
        // maxProduct();
        sortColors();
    }
}
