
public class Main {
    public static void selectionSort(int[] arr){
        int len =  arr.length;
        int temp;
        int index;
        for (int i = 0;i<len-1;i++){
            index = i;
            temp = arr[i];
            for (int j = i+1;j < len;j++){
                if(temp >  arr[j]) {
                    temp = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
	    int[] arr = {10, 3, 1,-5,0, 12, 14, 7,1,6,5,16,11};
        selectionSort(arr);
        for (int temp: arr) {
            System.out.println(temp);
        }
    }
}
