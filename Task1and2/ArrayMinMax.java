package amazon.learn.week2.arrayList.Task1and2;

public class ArrayMinMax {

    public static void main(String[] args) {
        // Difference between smallest and largest array - integer
        int[] bunchOfNumbers = {7, 15, 444, 80, 5, 29};

        int largest = 0;
        for (int i = 0; i < bunchOfNumbers.length; i++) {
            if( bunchOfNumbers[i] > bunchOfNumbers[largest]) {
                largest = i;
            }
        }
        System.out.println("Largest number from the list is: " + bunchOfNumbers[largest]);

        int smallest = 0;
        for (int i = 0; i < bunchOfNumbers.length; i++) {
            if( bunchOfNumbers[i] < bunchOfNumbers[smallest]) {
                smallest = i;
            }
        }
        System.out.println("Smallest number from the list is: " + bunchOfNumbers[smallest]);
    }
}


