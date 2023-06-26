import java.util.*;

public class ValidMountainArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean isValidMountain = validMountainArray(arr);
        
        System.out.println("Is the array a valid mountain array? " + isValidMountain);
    }
    
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        
        if (n < 3) {
            return false;
        }
        
        int i = 0;
        
        // Ascending phase
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        
        // Peak cannot be the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }
        
        // Descending phase
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        
        return i == n - 1;
    }
}
