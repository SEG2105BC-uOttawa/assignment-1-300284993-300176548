import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import design2.PointCP2;
import design3.PointCP3;

public class PerformanceTest {
    public static void main(String[] args) {
        int numInstances = 100000000;

        // Create lists to store instances for Design 1 and Design 5
        List<PointCP> design1Instances = new ArrayList<>();
        List<PointCP2> design5Instances2 = new ArrayList<>();
        List<PointCP3> design5Instances3 = new ArrayList<>();

        // Generate random instances for Design 1
        long startTime = System.nanoTime();
        PointCP point = new PointCP('C', 2, 3);
        for (int i = 0; i < numInstances; i++) {

//            PointCP dummyrotate= point.rotatePoint(90);
//            point.convertStorageToPolar();
//            point.convertStorageToCartesian();
            Random rand = new Random();
             double rotate = rand.nextDouble() * 360;
            double dummyDistance = point.getDistance(point.rotatePoint(rotate));
//            char typeCoord = rand.nextBoolean() ? 'C' : 'P'; // Randomly choose type
//            double xOrRho = rand.nextDouble() * 100; // Adjust range
//            double yOrTheta = rand.nextDouble() * 360; // Adjust range
//            PointCP point = new PointCP(typeCoord, xOrRho, yOrTheta);
//            point.convertStorageToCartesian();
//            point.convertStorageToPolar();
//            design1Instances.add(point);

        }
        long endTime = System.nanoTime();
        long constructionTimeDesign1 = endTime-startTime;
        System.out.println("\n***DESIGN 1: The construction time for measuring distances "+ numInstances + " times are "+ constructionTimeDesign1/Math.pow(10,9) + " seconds.");

        // Generate random instances for Design 5 pointCP2
        startTime = System.nanoTime();
        PointCP2 point2= new PointCP2(2, 3);
        for (int i = 0; i < numInstances; i++) {
//            PointCP2 dummyrotate = point2.rotatePoint(90);
//            PointCP3 dummyCP3 = new PointCP3(point2.getX(), point.getY());
//            PointCP2 dummyCP2 = new PointCP2(dummyCP3.getRho(),dummyCP3.getTheta());
            Random rand = new Random();
            double rotate = rand.nextDouble() * 360;
            double dummyDistance = point2.getDistance(point2.rotatePoint(rotate));
//            double rho = rand.nextDouble() * 100; // Adjust range
//            double theta = rand.nextDouble() * 360; // Adjust range
//            PointCP2 point2 = new PointCP2(rho, theta);
//

//            double x = rand.nextDouble() * 100;
//            double y = rand.nextDouble() * 100;
//            design5Instances2.add(point2);

//            design5Instances3.add(new PointCP3(x, y));
        }
        endTime = System.nanoTime();
        long constructionTimeDesign5 = endTime-startTime;
        System.out.println("\n***DESIGN 5 CP2: The construction time for measuring distances "+ numInstances + " times are "+ constructionTimeDesign5/Math.pow(10,9) + " seconds.");



        startTime = System.nanoTime();
        PointCP3 point3= new PointCP3(2, 3);
        for (int i = 0; i < numInstances; i++) {
//            PointCP3 dummyrotate = point3.rotatePoint(90);
            Random rand = new Random();
            double rotate = rand.nextDouble() * 360;
            double dummyDistance = point3.getDistance(point3.rotatePoint(rotate));
//            double rho = rand.nextDouble() * 100; // Adjust range
//            double theta = rand.nextDouble() * 360; // Adjust range
//            PointCP2 dummyCP2 = new PointCP2(point3.getRho(),point3.getTheta());
//            PointCP3 dummyCP3 = new PointCP3(dummyCP2.getX(), dummyCP2.getY());
//            double x = rand.nextDouble() * 100;
//            double y = rand.nextDouble() * 100;

//            PointCP3 point3 = new PointCP3(x, y);
//            design5Instances3.add(point3);


        }
        endTime = System.nanoTime();
        long constructionTimeDesign5k1 = endTime-startTime;
        System.out.println("\n***DESIGN 5 CP3:The construction time for measuring distances "+ numInstances + " times are "+ constructionTimeDesign5k1/Math.pow(10,9) + " seconds.");

    }



}
