package Algorithm;

public class App {
    public void notation(int key , int[] arr) {
    int mid ; 
    int left = 0 ;
    int right = arr.length -1;
     while (right >= left){
         mid = (right + left) / 2;
        if( key == arr[mid]){
            break;
        }
        if(key <arr[mid]){
            right= mid -1;
        }else {
            left = mid + 1;
        }
     }
    }



    public static void main(final String[] args) {
    }
}
