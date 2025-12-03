package algo;

public class ChangeData02 {
    public static void main(String[] args) {

        // {1,2,3,4,5,6,7} -> {7,6,5,4,3,2,1} reverse
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int a = 6;
        int b = 0;
        int temp = a;

        while(a != b){
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a--;
            b++;
            if(a<b) break;}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);


        }
    }
}