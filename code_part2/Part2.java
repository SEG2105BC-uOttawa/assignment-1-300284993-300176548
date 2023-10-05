import java.util.*;

public class Part2 {
    public static void main(String[] args){
        int size = (int) Math.pow(2.0, 27.0); // Highest number my VM can handle

        int[] array = new int[size];
        Vector<Integer> vector = new Vector<Integer>();
        ArrayList<Integer> arrList = new ArrayList<Integer>();



        long arrayConstructionTime;
        long vectorConstructionTime;
        long arrayListConstructionTime;


        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrList.add(random.nextInt(9));
        }
        long endTime = System.nanoTime();
        long constructionTime = endTime - startTime;
        System.out.println("ArrayList Construction Time: " + constructionTime/Math.pow(10, 9) + " seconds");


        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            vector.add(random.nextInt(9));
        }
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("Vector Construction Time: " + constructionTime/Math.pow(10, 9) + " seconds");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(9);
        }
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("Array Construction Time: " + constructionTime/Math.pow(10,9) + " seconds");

        startTime = System.nanoTime();
        arraySum(array);
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("Array Summation Time: " + constructionTime/Math.pow(10,9) + " seconds");

        startTime = System.nanoTime();
        vectorSum(vector);
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("Vector Summation Time: " + constructionTime/Math.pow(10,9) + " seconds");

        startTime = System.nanoTime();
        arrListSum(arrList);
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("ArrayList Summation Time: " + constructionTime/Math.pow(10,9) + " seconds");

        System.out.println("Array Sum: " + arraySum(array));
        System.out.println("Vector Sum: " + vectorSum(vector));
        System.out.println("ArrayList Sum: " + arrListSum(arrList));

        }



    public static long arraySum(int[] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += (long) array[i];
        }
        return sum;
    }

    public static long vectorSum(Vector<Integer> vector){
        long sum = 0;
        Iterator<Integer> iterator = vector.iterator();
        while ((iterator.hasNext())){
            sum += iterator.next();
        }
        return sum;
    }

    public static long arrListSum(ArrayList<Integer> arrList){
        long sum = 0;
        Iterator<Integer> iterator = arrList.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;
    }

    }
