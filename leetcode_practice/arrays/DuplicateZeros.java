package arrays;

public class DuplicateZeros {
    public static void main(String[] args) {

    }

    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0 & i+1< arr.length) {
                arr[i+1]=0;
            }
        }
    }
}
}
