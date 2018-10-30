import java.util.Scanner;
import java.util.Arrays;

public class AddValue {
    public static int[] addValue(int [] array,int value,int index){
        if (index<=1||index>array.length-1){
            System.out.println("Do not add value");
        }else {
            for (int i = array.length; i > 0; i--) {
                array[i - 1] = array[i - 2];
                if (i - 1 == index) {
                    array[index] = value;
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array: ");

        int size = scanner.nextInt();
        int[]array = new int[size +1];

        for (int i=0;i<size; i++){
            System.out.println("the " + (i+1) + " number is: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the value: ");
        int value = scanner.nextInt();
        System.out.println("Enter the index: ");
        int index = scanner.nextInt();

        System.out.println("Before array is: " + Arrays.toString(array));

        System.out.println("After array is: " + Arrays.toString(addValue(array,value,index)));
    }
}
