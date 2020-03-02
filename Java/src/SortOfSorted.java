public class SortOfSorted {
    public static void sortOfSorted(int[] a) {
        int index = 0;
        int end = 0;
        int start = 0;
        int tracker = 0;
        int temp = 0;

        for(int i = 0; i < a.length; i++){
            for(int k = start + 1; k < a.length - end; k++){
                if(a[index] < a[k]){
                    index = k;
                }
            }
            if(tracker == 2 || tracker == 3){
                System.out.println(a[index]);
                temp = a[start];
                a[start] = a[index];
                a[index] = temp;
                start++;
            } else {
                temp = a[a.length - end - 1];
                a[a.length - end - 1] = a[index];
                a[index] = temp;
                end++;
            }
            index = start;
            tracker++;
            if(tracker == 4){
                tracker = 0;
            }
        }
    }
    public static void main(String[] arg){
        int[] arr = {-1, 2, 2, 2, -3, 5, 4, 5, -1, 9, 7, 10};
        sortOfSorted(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
