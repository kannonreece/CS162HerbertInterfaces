/**
 * Represents a triangle
 */
public class Triangle extends Shape {

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    @Override
    public double computeArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    @Override
    public double computePerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
