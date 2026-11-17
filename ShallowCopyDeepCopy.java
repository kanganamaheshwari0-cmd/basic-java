//shallow copy

// public class ShallowCopyDeepCopy {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40};
//         int [] x = arr;
//         x[0] =100;
//         System.out.println(arr[0]);
//     }
// }


//deep copy

import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a = 4;
        int[] arr = {10,20,30,40};
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 100;
        System.out.println(arr[0]);
    }
}