import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[50];
        ArrayList<Integer> arrayList = new ArrayList<Integer>(50);
        Random random = new Random(50);

        for (int i = 0; i < 50; i++) {
            intArray[i] = random.nextInt(100) + 1;
            arrayList.add(random.nextInt(100) + 1);
        }

        Arrays.sort(intArray);
        arrayList.sort(null);

        int largestIntArray = intArray[intArray.length - 1];
        int largestArrayList = arrayList.get(arrayList.size() - 1);
        int firstIntArray = intArray[0];
        int firstArrayList = arrayList.get(0);
        int lastIntArray = intArray[intArray.length - 1];
        int lastArrayList = arrayList.get(arrayList.size() - 1);

        System.out.println("Largest number in integer array: " + largestIntArray);
        System.out.println("Largest number in ArrayList: " + largestArrayList);
        System.out.println("First number in integer array: " + firstIntArray);
        System.out.println("First number in ArrayList: " + firstArrayList);
        System.out.println("Last number in integer array: " + lastIntArray);
        System.out.println("Last number in ArrayList: " + lastArrayList);
    }
}
