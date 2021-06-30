
public class Main {
    public  static int partition(int[] arr,int lb,int hb){
        int pvot = arr[lb];
        int st = lb;
        int end =  hb;
        while (st < end){
            while(arr[st] <= pvot && st < hb){
                st++;
            }
            while(arr[end] > pvot && end > lb){
                end--;
            }
            if(st < end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
//        System.out.println(end);
        return end;
    }
    public static void quickSort(int[] arr,int lb,int hb){
        if(lb < hb){
            int lock = partition(arr,lb,hb);
            quickSort(arr,lb,lock-1);
            quickSort(arr,lock+1,hb);
        }
    }

    public static void main(String[] args) {
	    int[] arr = {10, 3, 1,-5,0,6,4,56,79,40,-20,65,71};
	    int len = arr.length;
        quickSort(arr,0,len-1);
        for (int temp: arr) {
            System.out.println(temp);
        }
//        System.out.println(count);
    }
}
