package Striver;
import java.net.Inet4Address;
import java.util.HashMap ;
import java.util.Scanner;

public class Hashing {
    public static void Hashing1(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>() ;
        for(int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1) ;
            }
            else {
                map.put(num, 1);
            }
        }
        for(int key : map.keySet()) {
            System.out.println(key + " appears " + map.get(key) + " times");
        }
    }
    public static void Hashing2(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>() ;
        int maxf = 0;
        int result = Integer.MAX_VALUE;
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1) ;
            int count = freq.get(num);
            if (count > maxf) {
                maxf = count;
                result = num;
        } else if (count == maxf) {
                result = Math.min(result, num);
            }
        }
        System.out.println("The Highest Occuring Number: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Hashing2(arr);
        sc.close();
    }
}
