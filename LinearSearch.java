//Linear search

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,18,62,3,88,6};
        int target = 3;
        boolean flag = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                flag = true;
                break;
        }
    }
    if(flag==true) System.out.println("Target exist");
    else System.out.println("Target not exist");
}
    
}
