package Shape;

import java.util.Scanner;

public class Round {
    private double radius;

    Round() {
        radius = 0;
    }

    Round(double radius) {
        this.radius = radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected double calculatedDiameter() {
        double diameter = 0;
        diameter = 2 * this.radius;
        return diameter;
    }

    protected double calculatedPerimeter() {
        double perimeter = 0;
        perimeter = Math.PI * calculatedDiameter();
        return perimeter;
    }

    protected double calculatedSquare() {
        double square = 0;
        square = Math.PI * this.radius * this.radius;
        return square;
    }
}
