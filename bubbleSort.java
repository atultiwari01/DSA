public class bubbleSort{
    public static void Bubble_sort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for(int i=0; i<n-1 ; i++){
            swapped = false;
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1] ){
                        int temp = arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                        swapped = true;
                
                }
            }
            if(!swapped)break;
        }
    }
    public static void main(String[] args){
        int[] arr = {8, 9, 1, 3, 18, 69, 75, 2, 4, 11};
        System.out.println("Original arr: ");

        for(int num: arr){
            System.out.println(num + " ");
        }
        Bubble_sort(arr);

        System.out.println("Sorted Code: ");
        for(int num:arr){
            System.out.println(num + " ");
        }

    }
}
