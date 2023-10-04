package design3;


import design5.PointCPgeneral;

public class PointCP3 extends PointCPgeneral {
    //Instance variables ************************************************


    /**
     * Contains the current value of X.
     */
    private double x;

    /**
     * Contains the current value of Y.
     */
    private double y;


    public PointCP3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRho() {

        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public double getTheta() {
        return Math.toDegrees(Math.atan2(y, x));
    }

  public double getDistance(PointCPgeneral point) {
        if (point instanceof PointCP3) {
            PointCP3 pointnew = (PointCP3) point;
            double deltaX = getX() - pointnew.getX();
            double deltaY = getY() - pointnew.getY();
            return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        } else {
            throw new IllegalArgumentException("Incompatible PointCPgeneral type");
        }
    }
    public PointCP3 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCP3(  (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }

    // Returns information
    public String toString(){
        return "Stored Computer cartesian coordinates are ("+getX()+", "+getY()+")";
    }
}



