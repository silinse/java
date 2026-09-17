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
        System.out.println("---------------------");

        int[] hd1 = {1, 4, 2, 7};
        int[] hd2 = {1, 4, 2, 4, 7};
        System.out.println(hasDuplicate(hd1));
        System.out.println(hasDuplicate(hd2));
        System.out.println("---------------------");

        System.out.println("Hello World " + countVowels("Hello World"));
        System.out.println("JAVA " + countVowels("JAVA"));
        System.out.println("rhythm " + countVowels("rhythm"));
        System.out.println("---------------------");

        System.out.println("Hello " + reverse("Hello"));
        System.out.println("---------------------");

        int[] cn = {4, 2, 4, 1, 2, 4};
        System.out.println("[4, 2, 4, 1, 2, 4]");
        System.out.println(countNumbers(cn));
        System.out.println("---------------------");

        int[] mf = {4, 2, 4, 1, 2, 4};
        System.out.println("[4, 2, 4, 1, 2, 4] " + mostFrequent(mf));
        System.out.println("---------------------");

        System.out.println("level " + isPalindrome("level"));
        System.out.println("racecar " + isPalindrome("racecar"));
        System.out.println("hello " + isPalindrome("hello"));
        System.out.println("---------------------");

        System.out.println("[4, -2, 7, 1, 9] " + smallestPositive(new int[]{4, -2, 7, 1, 9}));
        System.out.println("[-5, 8, 3, -1] " + smallestPositive(new int[]{-5, 8, 3, -1}));
        System.out.println("10, 5, 20] " + smallestPositive(new int[]{10, 5, 20}));
        System.out.println("---------------------");

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

    static int countVowels(String text) {
        String vowels = "aeiou";
        text = text.toLowerCase();
        int count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    static String reverse(String text) {
        String reverse = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }

    static Map<Integer, Integer> countNumbers(int[] numbers) {
        Map<Integer, Integer> count = new HashMap<>();

        /* old
        for(int number : numbers) {
            if(count.get(number) == null) {
                count.put(number, 1);
            } else {
                count.put(number, count.get(number) + 1);
            }
        }
         */

        for(int number : numbers) {
            count.put(number, count.getOrDefault(number, 0) + 1);
        }
        return count;
    }

    static int mostFrequent(int[] numbers) {
        Map<Integer, Integer> count = new HashMap<>();
        int fKey = 0;
        int fValue = -1;
        for(int number : numbers) {
            count.put(number, count.getOrDefault(number, 0) + 1);
        }


        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue() > fValue) {
                fKey = entry.getKey();
                fValue = entry.getValue();
            }
        }

        return fKey;
    }

    static boolean isPalindrome(String text) {
        for(int i = 0; i < text.length() / 2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static int smallestPositive(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        for(int number : numbers) {
            if(number > 0 && number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }


}