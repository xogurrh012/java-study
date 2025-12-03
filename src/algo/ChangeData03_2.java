package algo;

public class ChangeData03_2 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,3,1,5,6};
        int temp;

        int row = arr.length -1;

        for (int i = 0; i < row; i++) {
            int a = 0;
                for (int c = 0; c < row; c++) {
                if (arr[a] > arr[a + 1]) {
                    temp = arr[a];
                    arr[a] = arr[a + 1];
                    arr[a + 1] = temp;
            }
            a++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }

    }
}
