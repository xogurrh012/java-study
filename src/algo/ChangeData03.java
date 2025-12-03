package algo;

// ChangeData3 {7,4,2,3,1,5,6}
public class ChangeData03 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순)
        int[] arr = {2,3,1};
        int temp;
       // 0,1 비교 -> 참 -> 스왑 {2,3,1}
        if(arr[0] > arr[1]){
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        }

       // 1,2 비교 -> 참 -> 스왑 {2,1,3}
        if(arr[1] > arr[2]){
        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;}

       // 0,1 비교 -> 참 -> 스왑 {1,2,3}
        if(arr[0] > arr[1]){
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
