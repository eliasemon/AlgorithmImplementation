

public class Main {
//    static int count = 0;
    public static void bubbleSort(int[] arr){
        int len =  arr.length;
        int temp;
        boolean check;
        for (int i = 0;i<len;i++){
            check = false;
            for (int j = 0;j < len-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
//            count++;
            if (!check){
               break;
            }
        }
    }

    public static void main(String[] args) {
	    int[] arr = {10, 3, 1,-5,0, 12, 14, 7,1,6,5,16,11};
        bubbleSort(arr);
        for (int temp: arr) {
            System.out.println(temp);
        }
//        System.out.println(count);
    }
}
