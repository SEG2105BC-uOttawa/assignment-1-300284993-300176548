package design5;//package design5;


public abstract class PointCPgeneral {
    // Abstract methods to be implemented by subclasses
    public abstract double getRho();

    public abstract double getTheta();



    // Abstract methods for getX() and getY()
    public abstract double getX();

    public abstract double getY();

    public abstract PointCPgeneral rotatePoint(double rotation);


//    public abstract PointCPgeneral rotatePoint(double rotation);

    // Common implementation for getDistance
    public double getDistance(PointCPgeneral point) {
        if (this.getClass() == point.getClass()) {
            double deltaX = getX() - point.getX();
            double deltaY = getY() - point.getY();
            return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        } else {
            throw new IllegalArgumentException("Incompatible PointCPgeneral type");
        }
    }

    // Common method
    @Override
    public String toString() {
        return "Stored polar coordinates are (" + getTheta() + "," + getRho() + ")\n" +
                "Computer cartesian coordinates are (" + getX() + ", " + getY() + ")";
    }
}

