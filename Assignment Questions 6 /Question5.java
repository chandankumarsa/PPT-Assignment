import java.util.*;

public class MinimumProductSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the arrays: ");
        int n = scanner.nextInt();
        
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        
        System.out.println("Enter the elements of nums1:");
        for (int i = 0; i < n; i++) {
            nums1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }
        
        int minProductSum = getMinProductSum(nums1, nums2);
        
        System.out.println("Minimum product sum: " + minProductSum);
    }
    
    public static int getMinProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int minProductSum = 0;
        
        for (int i = 0; i < n; i++) {
            minProductSum += nums1[i] * nums2[n - i - 1];
        }
        
        return minProductSum;
    }
}
