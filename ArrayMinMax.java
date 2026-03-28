package amazon.learn.week2.arrayList;

import java.util.Random;

public class ArrayMinMax {

    int size = 10;
    int[] numbers = new int[size];

    // fill the numbers
    public void fillNumbers() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
    }

    // print them
    public void printNumbers() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // sort them
    public void sortNumbers() {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // print them
        BubbleSort bs = new BubbleSort();

        System.out.println("Before Sorting");
        bs.fillNumbers();
        //bs.printNumbers();

        long before = System.currentTimeMillis(); // after 1.1.1978
        bs.sortNumbers();
        long after = System.currentTimeMillis();

        System.out.println("Sorting took " + (after - before) + " ms");
        //bs.printNumbers();


    }

}
