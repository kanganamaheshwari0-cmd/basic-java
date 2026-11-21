public class Merge2SortArrays {
     public static void main(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};

        int m = 3;
        int n = 3;

        int i = m - 1;
        int j = n - 1;
        int idx = m + n - 1;

        while(i>=0 && j>= 0) {
         if(A[i] >= B[j]) {
            A[idx--] = A[i--];
         }else {
            A[idx--] = B[j--];
         }
        }

        while(j>=0) {
         A[idx--] = B[j--];
        }

          System.out.print("Merged Array: ");

        for (int x = 0; x < A.length; x++) {
            System.out.print(A[x] + " ");
        }

     }
    
}
