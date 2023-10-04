package design2;

import design5.PointCPgeneral;

public class PointCP2 extends PointCPgeneral {
    //Instance variables ************************************************


    private double Rho;

    private double Theta;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP2(double Rho, double Theta) {

            this.Rho = Rho;
            this.Theta = Theta;

    }

    //Instance methods, getters/setters, and everything else
    public double getX(){
        return (Math.cos(Math.toRadians(Theta))* Rho);
    }

    public double getY(){
        return (Math.sin(Math.toRadians(Theta))*Rho);
    }

    public double getRho() {
        return Rho;
    }

    public double getTheta() {
        return Theta;
    }

    // Couple methods copy and pasted from PointCP
   public double getDistance(PointCPgeneral point) {
        if (point instanceof PointCP2) {
            PointCP2 pointnew = (PointCP2) point;
            double deltaX = getX() - pointnew.getX();
            double deltaY = getY() - pointnew.getY();
            return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        } else {
            throw new IllegalArgumentException("Incompatible PointCPgeneral type");
        }
    }
    public PointCP2 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCP2(   (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }


    // Returns information
    public String toString(){
        return "Stored polar coordinates are (" + getTheta() + "," + getRho() + ")";
    }

}

