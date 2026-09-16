public class CodingExercises {
    public static void main(String[] args){

        System.out.println(largestSum(5, 10, 3));

        int[] numbers = {5, 2, 8, 1, 3};
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("------------");
        bubbleSort(numbers);
        for(int number : numbers){
            System.out.print(number + " ");
        }
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

    static void bubbleSort(int[] numbers){
        int temp;
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length-1-i; j++ ){
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}