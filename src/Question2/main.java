package Question2;

//find the sum of element of array using while loop;

public class main {
    public static void main(String[] args){
        System.out.println("welcome to result ");
        int[] arr = {1,2,9,4,5};
        int sum= 0;
       int i= 0;

        while(i<arr.length){
             sum+=arr[i];
            i++;
        }
        System.out.println("print the sum of array:"+sum);
    }
}
