import design2.PointCP2;
import design3.PointCP3;

public class scratch {
    public static void main(String[] args) {
        // Create instances of PointCP2 and PointCP3
        PointCP2 polarPoint = new PointCP2(5.0, 45.0); // rho = 5.0, theta = 45.0 degrees
        PointCP3 cartesianPoint = new PointCP3(3.0, 4.0); // x = 3.0, y = 4.0

        // Use the common methods from PointCPgeneral
         long startTime = System.nanoTime();
        System.out.println("Polar Point Info:");
        System.out.println("Rho: " + polarPoint.getRho());
        System.out.println("Theta: " + polarPoint.getTheta());
        System.out.println("X: " + polarPoint.getX());
        System.out.println("Y: " + polarPoint.getY());
        System.out.println("Distance to Origin: " + polarPoint.getDistance(new PointCP2(0.0, 0.0)));
        System.out.println("Rotated Point: " + polarPoint.rotatePoint(30.0));
        long endTime = System.nanoTime();
        long constructionTime = endTime - startTime;
        System.out.println("POLARPOLAR Construction Time: " + constructionTime + " nanoseconds");

       startTime = System.nanoTime();
        System.out.println("\nCartesian Point Info:");
        System.out.println("X: " + cartesianPoint.getX());
        System.out.println("Y: " + cartesianPoint.getY());
        System.out.println("Rho: " + cartesianPoint.getRho());
        System.out.println("Theta: " + cartesianPoint.getTheta());
        System.out.println("Distance to Origin: " + cartesianPoint.getDistance(new PointCP3(0.0, 0.0)));
        System.out.println("Rotated Point: " + cartesianPoint.rotatePoint(60.0));
        endTime = System.nanoTime();
        constructionTime = endTime - startTime;
        System.out.println("POLARPOLAR Construction Time: " + constructionTime + " nanoseconds");
    }
}
