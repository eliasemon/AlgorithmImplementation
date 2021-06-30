

public class Main {
    public static void insertionSort(int[] arr){
        int len =  arr.length;
        int temp;
        int j;
        for (int i = 1;i<len;i++){
            temp = arr[i];
            j = i;
            for (;j > 0;j--){
                if(temp <  arr[j-1]){
                    arr[j] = arr[j-1];
                }
                else{
                    break;
                }
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
	    int[] arr = {10, 3, 1, 12, 14, 7,1,6,5,16,11};
        insertionSort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
