package Striver;
import java.util.Scanner;

public class Sorting {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void selectionsort(int arr[]) {
        int n = arr.length ;
        for(int i = 0; i < n - 1; i++) {
            int min = i ;
            for(int j = i + 1; j < n; j++ ) {
                if(arr[j] < arr[min]) {
                    min = j ;
                }
            }
            swap(arr, i, min);
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubblesort(int arr[]) {
        int n = arr.length;
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        System.out.print("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() ;
        }
        bubblesort(arr);
    }
}