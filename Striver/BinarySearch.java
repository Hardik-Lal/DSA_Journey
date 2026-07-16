package Striver;
import java.util.*;
public class BinarySearch {
    public static void bn1(int arr[]) {
        int size = arr.length ;
        int low = 0 ;
        int high = size - 1 ;
        Scanner bs = new Scanner(System.in) ;
        System.out.print("Enter the target: ");
        int target = bs.nextInt() ;
        while(low <= high) {
            int mid = (low + high) / 2 ;
            if(arr[mid] == target) {
                System.out.print("The index is: " + mid);
                return ;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1 ;
            }
        }
        System.out.print("Did not find the target");
    }
    public static void bn2(int arr[]) {
        int x = arr.length ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number: ");
        int target = sc.nextInt();
        int low = 0 ;
        int high = x - 1 ;
        int ans = x ;

        while(low <= high) {
            int mid = (low + high) / 2 ;

            if(arr[mid] >= target) {
                ans = mid ;
                high = mid - 1;
            } else {
                low = mid + 1 ;
            }
        }
        System.out.print("Lower bound is: " + ans);
    }
    public static void bn3(int arr[]) {
        int x = arr.length;
        int low = 0 ;
        int high = x - 1 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int mid ;
        int count = 0 ;
        while(low <= high) {
            mid = (low + high) / 2 ;
            if(arr[mid] == target) {
                count++ ;
                System.out.print("The index is: " + mid);
                return;
            }
            else if(target < arr[mid]) {
                high = mid - 1;
            }
            else{
                low = mid + 1 ;
            }
        }
        if(count == 0) {
            System.out.print("The index can be if the number was present: " + low);
        }
    }
    public static void bn4(int arr[]) {
        int size = arr.length;
        int low = 0;
        int high = size - 1;

        int first = -1 ;
        int last = -1 ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                first = mid ;
                high = mid - 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("The first occ is: " + first);
        low = 0;
        high = size - 1 ;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target) {
                low = mid +1 ;
            } else {
                high = mid - 1;
            }
        }
        System.out.print("The last occ is: " + last);
    }
    public static void bn5(int arr[]) {
        int size = arr.length;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the target: ");
        int target = sc.nextInt() ;
        int low = 0 ;
        int high = size - 1 ;
        int first = -1 ;
        int last = -1 ;
        while(low <= high) {
            int mid = (low + high) / 2 ;
            if(arr[mid] == target) {
                first = mid ;
                high = mid - 1 ;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1 ;
            }
        }
        low = 0 ;
        high = size - 1 ;
        while(low <= high) {
            int mid = (low + high) / 2 ;
            if(arr[mid] == target) {
                last = mid ;
                low = mid + 1 ;
            } else if (arr[mid] < target) {
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;
            }
        }
        System.out.print("The first one is: " + first + " and the last one is: " + last);
    }
    public static void bn6(int arr[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1 ;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int temp = low;

        low = 0 ;
        high = arr.length - 1 ;
        if(arr[0] <= target && target <= arr[temp - 1]) {
            high = temp - 1 ;
            low = 0 ;
            while(low <= high) {
                int mid = (low+high) / 2 ;
                if(arr[mid] == target) {
                    System.out.print("The target is at index: " + mid);
                    return;
                } else if (arr[mid] > target) {
                    high = mid - 1 ;
                }
                else{
                    low = mid + 1 ;
                }
            }
        }
        else{
            high = arr.length - 1;
            low = temp ;
            while(low <= high) {
                int mid = (low+high) / 2 ;
                if(arr[mid] == target) {
                    System.out.print("The target is at index: " + mid);
                    return;
                } else if (arr[mid] > target) {
                    high = mid - 1 ;
                }
                else{
                    low = mid + 1 ;
                }
            }
        }
    }
    public static void bn7(int arr[]) {
        int low = 0 ;
        int high = arr.length - 1;
        int temp = 0;
        while (low < high) {
            int mid = (low + high) / 2 ;
            if(arr[mid] > arr[high]) {
                low = mid + 1 ;
            }
            else {
                high = mid ;
            }
            temp = low ;
        }
        System.out.print("The array is rotated by: " + temp);
    }
    public static void bn8(int arr[]) {
        int low = 0 ;
        int high = arr.length - 1 ;
    }
    public static void main(String[] args) {
        Scanner bs = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = bs.nextInt();
        int arr[] = new int[n] ;
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = bs.nextInt() ;
        }
        bn7(arr);
    }
}
