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

    public PointCP2 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        return new PointCP2(   Rho,  Theta+radRotation);
    }



    // Returns information
    public String toString(){
        return "Stored polar coordinates are (" + getRho() + "," + getTheta() + ")";
    }

}

