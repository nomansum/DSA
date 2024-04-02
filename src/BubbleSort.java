public class BubbleSort {





    public static void bubbleSort(int[] arr){

        boolean isSwapped = false;

        for(int i = 0;i<arr.length-1;++i){
            isSwapped = false;

            for(int j = 0;j<arr.length -1-i;++j){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }

            }
            if(!isSwapped){
                break;
            }
        }



    }

public static void printArray(int[] arr){
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i] + " " );
        }
}


    public static void main(String[] args){
       int[] arr = {1,5,1,4,7,3,10};
       bubbleSort(arr);
       printArray(arr);
    }
}
