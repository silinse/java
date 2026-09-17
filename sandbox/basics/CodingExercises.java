import java.util.*;

public class CodingExercises {
    public static void main(String[] args){

        System.out.println(largestSum(5, 10, 3));
        System.out.println("---------------------");

        int[] numbers = {5, 2, 8, 1, 3};
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        bubbleSort(numbers);
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println("\n---------------------");

        // int[] sl = {10, 10, 4, 8, 2, 10, 6, 10};
        int[] sl = {10, 5, 8};
        System.out.println(secondLargest(sl));

        int[] hd1 = {1, 4, 2, 7};
        int[] hd2 = {1, 4, 2, 4, 7};
        System.out.println(hasDuplicate(hd1));
        System.out.println(hasDuplicate(hd2));


    }

    static int largestSum(int a, int b, int c) {
        if(a > b) {
            if(b > c){
                return a + b;
            }else{
                return a + c;
            }
        } else {
            if(a > c){
                return a + b;
            }
        }
        return c + b;
    }

    static void bubbleSort(int[] numbers) {
        int temp;
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length-1-i; j++ ) {
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    static int secondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] < largest && largest == secondLargest){
                secondLargest = numbers[i];
            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }

    static boolean hasDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int number : numbers) {
            if(!set.add(number)){
                return true;
            }
        }
        return false;
    }


}