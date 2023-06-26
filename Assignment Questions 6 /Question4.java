import java.util.*;

public class ContiguousArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int maxLength = findMaxLength(nums);
        
        System.out.println("Maximum length of a contiguous subarray with an equal number of 0 and 1: " + maxLength);
    }
    
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            
            if (countMap.containsKey(count)) {
                maxLength = Math.max(maxLength, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }
        
        return maxLength;
    }
}
