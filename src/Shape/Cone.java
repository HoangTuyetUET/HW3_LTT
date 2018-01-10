package Shape;

public class Cone {
    private double radius;
    private double height;
    private Round round;

    Cone() {
        radius = 0;
        height = 0;
        round = new Round(this.radius);
    }

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    protected double getHeight() {
        return this.height;
    }

    protected double calculatedVolumetricCone() {
        double volumetricCone = 0;
        volumetricCone = 1 / 3.0 * this.height * round.calculatedSquare();
        return volumetricCone;
    }

    protected double calculatedSquareAround() {
        double squareAround = 0;
        double l = Math.sqrt(this.height * this.height + this.radius * this.radius);
        squareAround = Math.PI * this.radius * l;
        return squareAround;
    }

    protected double calculatedSquareTotal() {
        double squareToatal = 0;
        squareToatal = round.calculatedSquare() + calculatedSquareAround();
        return squareToatal;
    }
}
