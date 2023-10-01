import java.util.*;

public class Part2 {
    public static void main(String[] args){
        int size = 214748369;

        int[] array = new int[size];
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        long arrayConstructionTime;
        long arrayListConstructionTime;
        long vectorConstructionTime;

        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrList.add(random.nextInt(10)); // Add random integers (0-9)
        }
        long endTime = System.nanoTime();
        long constructionTime = endTime - startTime;
        System.out.println("ArrayList Construction Time: " + constructionTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            vector.add(random.nextInt(10));
        }
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("Vector Construction Time: " + constructionTime + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("Array Construction Time: " + constructionTime + " nanoseconds");
    }
}
