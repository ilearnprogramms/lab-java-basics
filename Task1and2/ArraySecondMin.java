package amazon.learn.week2.arrayList.Task1and2;

public class ArraySecondMin {

    public static void main(String[] args) {
        // Smallest and Second smallest value
        int[] bunchOfNumbers = {2, 62, 84, 79, 4, 29};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int bunchOfNumber : bunchOfNumbers) {
            if (bunchOfNumber < smallest) {
                secondSmallest = smallest;
                smallest = bunchOfNumber;
            } else if (bunchOfNumber < secondSmallest && bunchOfNumber != smallest) {
                secondSmallest = bunchOfNumber;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + secondSmallest);
    }
}