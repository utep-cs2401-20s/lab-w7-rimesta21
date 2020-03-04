public class SortOfSorted {
    public SortOfSorted() {}

    public void sortOfSorted(int[] a) {
        if(a.length < 2){
            return;
        }
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
}
