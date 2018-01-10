package Shape;

public class TruncatedCone {
    private double radiusSmall;
    private double radiusBig;
    private double height;
    private Round roundSmall;
    private Round roundBig;

    TruncatedCone() {
        radiusSmall = 0;
        radiusBig = 0;
        height = 0;
        roundSmall = new Round(this.radiusSmall);
        roundBig = new Round(this.radiusBig);
    }

    TruncatedCone(double radiusSmall, double radiusBig, double height) {
        this.radiusSmall = radiusSmall;
        this.radiusBig = radiusBig;
        this.height = height;
    }

    protected void setRadiusBig(double radiusBig) {
        this.radiusBig = radiusBig;
    }

    protected double getRadiusBig() {
        return this.radiusBig;
    }

    protected void setRadiusSmall(double radiusSmall) {
        this.radiusSmall = radiusSmall;
    }

    protected double getRadiusSmall() {
        return this.radiusSmall;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    protected double getHeight() {
        return this.height;
    }

    protected double calculatedVolumetric() {
        double volumetricCone = 0;
        volumetricCone = 1 / 3.0 * this.height * (roundSmall.calculatedSquare() + roundBig.calculatedSquare() + this.radiusBig * this.radiusSmall * Math.PI);
        return volumetricCone;
    }

    private double calculatedL(double radius) {
        return Math.sqrt(this.height * this.height + radius * radius);
    }

    protected double calculatedSquareAround() {
        double squareAround = 0;
        double l = calculatedL(radiusBig) - calculatedL(radiusSmall);
        squareAround = Math.PI * (this.radiusBig + this.radiusSmall) * l;
        return squareAround;
    }

    protected double calculatedSquareTotal() {
        double squareToatal = 0;
        squareToatal = roundBig.calculatedSquare() + roundSmall.calculatedSquare() + calculatedSquareAround();
        return squareToatal;
    }

}
