package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {1,5,4,7,8,3,2,9};

        //sort
        Arrays.sort(numbers);

        //to string
        System.out.println(Arrays.toString(numbers));

        //search , returnnya index ke -
        System.out.println(Arrays.binarySearch(numbers, 7));

        //copy
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 8);
        System.out.println(Arrays.toString(result2));
    }
}
