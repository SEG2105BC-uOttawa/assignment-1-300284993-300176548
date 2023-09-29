package design2;

public class PointCP2 {
    //Instance variables ************************************************

    private char typeCoord;

    private double Rho;

    private double Theta;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP2(char type, double Rho, double Theta) {
        if (type != 'C' && type != 'P')
            throw new IllegalArgumentException();
        this.typeCoord = type;
        if (this.typeCoord == 'C') {
            this.Rho = (Math.sqrt(Math.pow(Rho, 2) + Math.pow(Theta, 2)));
            this.Theta = Math.toDegrees(Math.atan2(Theta, Rho));
        } else {
            this.Rho = Rho;
            this.Theta = Theta;
        }

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

    // Not sure if we need these yet - Points are stored, but aren't computed or are just returned
    public void convertStorageToPolar(){
        return;
    }

    public void convertStoragetoCartesian(){
        return;
    }


    // Couple methods copy pasted from PointCP
    public double getDistance(PointCP2 pointB) {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    public PointCP2 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCP2('C',
                (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }

    // Returns information
    public String toString(){
        return "Stored polar coordinates are (" + getTheta() + "," + getRho() + ")\n" +
                "Computer cartesian coordinates are ("+getX()+", "+getY()+")";
    }

}

