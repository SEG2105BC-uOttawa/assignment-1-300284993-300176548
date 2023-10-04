package design5;



public abstract class PointCPgeneral {
    // Abstract methods to be implemented by subclasses
    public abstract double getRho();

    public abstract double getTheta();



    // Abstract methods for getX() and getY()
    public abstract double getX();

    public abstract double getY();


    // Common implementation for getDistance
    public abstract double getDistance(PointCPgeneral point);

    public abstract PointCPgeneral rotatePoint(double rotation);



    // Common method
    @Override
    public String toString() {
        return "Stored polar coordinates are (" + getTheta() + "," + getRho() + ")\n" +
                "Computer cartesian coordinates are (" + getX() + ", " + getY() + ")";
    }
}

