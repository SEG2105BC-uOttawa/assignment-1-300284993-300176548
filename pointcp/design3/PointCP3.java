package design3;


public class PointCP3 {
    //Instance variables ************************************************

    /**
     * Contains C(artesian) or P(olar) to identify the type of
     * coordinates that are being dealt with.
     */
    private char typeCoord;

    /**
     * Contains the current value of X or RHO depending on the type
     * of coordinates.
     */
    private double xOrRho;

    /**
     * Contains the current value of Y or THETA value depending on the
     * type of coordinates.
     */
    private double yOrTheta;

    public PointCP3(char type, double xOrRho, double yOrTheta) {
        if (type != 'C' && type != 'P')
            throw new IllegalArgumentException();
        this.typeCoord = type;
        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;
    }

    public double getX(){
        if(typeCoord == 'C'){
            return xOrRho;
        } else{
            return (Math.cos(Math.toRadians(yOrTheta))*xOrRho);
        }
    }

    public double getY(){
        if(typeCoord == 'C'){
            return yOrTheta;
        } else {
            return (Math.sin(Math.toRadians(yOrTheta))*xOrRho);
        }
    }

    public double getRho() {return xOrRho;}

    public double getTheta() {
        return yOrTheta;
    }
}

