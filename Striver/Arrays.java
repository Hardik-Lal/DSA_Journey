package Striver;
import java.util.* ;

public class Arrays {
    public static void array1(int arr[]) {
        //Find largest element in an array
        int large = arr[0];
        int x = arr.length;
        for(int i = 0; i < x; i++) {
            if(large < arr[i]) {
                large = arr[i] ;
            }
        }
        System.out.print("The largest element of the array is:" + large);
    }
    public static void array2(int arr[]) {
        //check sorted array
        int x = arr.length ;
        int count = 0;
        for(int i = 0; i < x - 1; i++) {
            if(arr[i] > arr[i+1]) {
                count++ ;
            }
        }
        if(count == 0) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void array3(int arr[]) {
        // Find number of uniques nos in an array
        if(arr.length == 0) {
            System.out.println("Unique Numbers: 0");
            return;
        }
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Unique Numbers: " + (i+1));
    }
    public static void array4(int arr[]) {
        //do one left rotation in an array
        int x = arr.length;
        int temp = arr[0] ;
        for(int i = 0; i < x - 1; i++) {
            arr[i] = arr[i+1] ;
        }
        arr[x-1] = temp ;
        for(int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void array5(int arr[]) {
        // Do n number of rotations in array
        Scanner sc = new Scanner(System.in) ;
        int x = arr.length;
        System.out.print("Enter how many rotations do you want to get done:");
        int k = sc.nextInt() ;
        k = k % x ;

        int temp[] = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for(int i = k; i < x; i++) {
            arr[i - k] = arr[i];
        }
        for(int i = x - k; i < x; i++) {
            arr[i] = temp[i - (x - k)];
        }
        for(int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void array6(int arr[]) {
        //Linear search
        Scanner sc = new Scanner(System.in) ;
        int x = arr.length ;
        System.out.print("Enter the number you want to find:");
        int target = sc.nextInt() ;
        for(int i = 0; i < x; i++) {
            if(arr[i] == target) {
                System.out.print("The target element has been found and it is on the index " + i);
                break ;
            }
            if(i == x - 1 && arr[i] != target) {
                System.out.print("The target element was not found.");
            }
        }
    }
    public static void array7(int arr[]) {
        //union of 2 sorted arrays
        Scanner sc = new Scanner(System.in) ;
        int n1 = arr.length ;
        System.out.print("Enter the number of elements for 2nd array: ");
        int n2 = sc.nextInt() ;
        int arr2[] = new int[n2] ;
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt() ;
        }
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>() ;

        while(i < n1 && j < n2) {
            if(arr[i] < arr2[j]) {
                if(ans.size() == 0 || ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                }
                i++ ;
            }
            else {
                if(ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < arr.length) {
            if(ans.size() == 0 || ans.get(ans.size() - 1) != arr[i]) {
                ans.add(arr[i]);
            }
            i++;
        }
        while(j < arr2.length) {
            if(ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }
        int[] result = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        for(int l = 0; l < result.length; l++) {
            System.out.print(result[l] + " ");
        }
    }
    public static void array8(int arr[]) {
        //Find missing number
        int x = arr.length;
        int actualsum = (x * (x + 1)) / 2 ;
        int sum = 0 ;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] ;
        }
        int mis = actualsum - sum ;
        System.out.print("The missing number is: " + mis);
    }
    public static void array9(int arr[]) {
        //max num of consecutive 1
        int n = arr.length ;
        int count = 0 ;
        int finalcount = 0 ;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                count++ ;
            }
            else {
                if(finalcount < count) {
                    finalcount = count;
                }
                count = 0 ;
            }
        }
        if (finalcount < count) {
            finalcount = count ;
        }
        System.out.print("The Highest num of consecutive 1 are: " + finalcount);
    }
    public static void array10(int arr[]) {
//        Scanner sc = new Scanner(System.in) ;
//        System.out.print("Enter the target sum: ");
//        int k = sc.nextInt() ;
//        HashMap<Integer, Integer> su = new HashMap<>() ;
//        int sum = 0 ;
//        int len = 0 ;
//        for(int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i] ;
//        }
    }
    public static void array11(int arr[]) {
        HashMap<Integer, Integer> twosum = new HashMap<>() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt() ;
        for(int i =0; i < arr.length; i++) {
            int a = arr[i] ;
            int more = target - a ;
            if(twosum.containsKey(more)) {
                System.out.print("Indices: " + twosum.get(more) + " " + i);
                return;
            }
            twosum.put(a, i);
        }
        System.out.print("No solution found");
    }
    public static void array12(int arr[]) {
        int countzero = 0, countone = 0, counttwo = 0 ;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                countzero++ ;
             }
            if(arr[i] == 1) {
                countone++ ;
            }
            if(arr[i] == 2) {
                counttwo++ ;
            }
        }
        for(int j = 0; j < countzero; j++) {
            arr[j] = 0 ;
        }
        for(int j = countzero; j < countzero + countone; j++) {
            arr[j] = 1 ;
        }
        for(int j = countzero + countone; j < arr.length; j++) {
            arr[j] = 2 ;
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void array13(int arr[]) {
        HashMap<Integer, Integer> cou = new HashMap<>() ;
        for(int i = 0; i < arr.length; i++) {
            cou.put(arr[i], cou.getOrDefault(arr[i], 0) + 1);
        }
        int c = arr.length;
        for(int key : cou.keySet()) {
            if(cou.get(key) > (c / 2)) {
                System.out.print("The majority element is: " + key);
                return ;
            }
        }
    }
    public static void array14(int arr[]) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE ;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] ;

            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("The largest sum is: " + maxi);
    }
    public static void array15(int arr[]) {
        int mini = arr[0] ;
        int profit = 0 ;
        int cost ;
        for(int i = 1; i < arr.length; i++) {
            cost = arr[i] - mini ;
            if(cost > profit) {
                profit = cost ;
            }
            if(mini > arr[i]) {
                mini = arr[i] ;
            }
        }
        System.out.print("The maximum profit will be: " + profit);
    }
    public static void array16(int arr[]) {
        int arr2[] = new int[arr.length] ;
        int j = 0 ;
        int k = 1 ;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                arr2[j] = arr[i] ;
                j = j + 2 ;
            }
            if(arr[i] < 0) {
                arr2[k] = arr[i] ;
                k = k + 2 ;
            }
        }
        System.out.print("The rearranged array is: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static void array17(int arr[]) {
        int x = arr.length ;
        HashMap<Integer, Integer> lead = new HashMap<>() ;
        int max = arr[x-1] ;
        for(int i = x - 1; i >= 0; i--) {
            if(arr[i] >= max) {
                max = arr[i] ;
                lead.put(i, arr[i]) ;
            }
        }
        System.out.print(lead);
    }
    public static void array18(int arr[]) {
        HashSet<Integer> set = new HashSet<>() ;
        for(int i = 0; i < arr.length ; i++) {
            set.add(arr[i]) ;
        }
        int longest = 0 ;
        for(int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int current = arr[i];
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.print(longest);
    }
    public static void array19(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int[] ros = new int[n];
        int[] cols = new int[m];

        // Mark rows and columns containing 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    ros[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        // Set elements to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ros[i] == 1 || cols[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        // Print the matrix
        System.out.println("The Result Matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}
    public static void array20(int arr[][]) {
        int rows = arr.length;
        int columns = arr[0].length;
        int temp = 0 ;
        for(int i = 0; i < rows; i++) {
            for(int j = i + 1; j < columns; j++) {
                temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
             }
        }
        int swap = 0 ;
        for(int i = 0; i < rows; i++) {
            int left = 0 ;
            int right = columns - 1;
            while(left < right) {
                swap = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = swap;
                left++;
                right--;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void array21(int arr[][]) {
        int rows = arr.length;
        int columns = arr[0].length;

        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void array22(int arr[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int len = arr.length ;
        int count = 0;
        HashMap<Integer, Integer> mc = new HashMap<>() ;
        mc.put(0, arr[0]) ;
        for(int i = 1; i < len; i++) {
            if(arr[i] + mc.get(i-1) < target) {
                mc.put(i, (arr[i] + mc.get(i-1))) ;
            }
            if(arr[i] + mc.get(i-1) > target) {
                mc.put(i, arr[i]) ;
            }
            if(arr[i] == target) {
                count++ ;
            }
        }
        System.out.print(count);
    }
    public static void main(String[]args){
//        For 1d array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n] ;
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() ;
        }

//      For 2d array
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows and columns:");
//        int rows = sc.nextInt();
//        int columns = sc.nextInt();
//        int arr[][] = new int[rows][columns];
//        System.out.print("Enter the elements: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        array22(arr);
    }
}