import java.util.*;

public class DoubledArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] changed = new int[n];
        
        System.out.println("Enter the elements of the changed array:");
        for (int i = 0; i < n; i++) {
            changed[i] = scanner.nextInt();
        }
        
        int[] original = findOriginalArray(changed);
        
        if (original.length == 0) {
            System.out.println("Empty array");
        } else {
            System.out.print("Original array: ");
            for (int num : original) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // Empty array if changed length is odd
        }
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element in changed
        for (int num : changed) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int[] original = new int[changed.length / 2];
        int index = 0;
        
        // Traverse the frequency map
        for (int num : frequencyMap.keySet()) {
            int count = frequencyMap.get(num);
            
            // Check if the doubled value exists and has the same frequency
            if (frequencyMap.containsKey(num * 2) && frequencyMap.get(num * 2) == count) {
                // Add num to the original array count times
                for (int i = 0; i < count; i++) {
                    original[index++] = num;
                }
            } else {
                return new int[0]; // Empty array if doubled value doesn't exist or has different frequency
            }
        }
        
        return original;
    }
}
