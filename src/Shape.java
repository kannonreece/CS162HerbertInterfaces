/**
 * Represents any shape.
 */
public abstract class Shape implements Comparable<Shape> {
    private int id;
    private static int numShapes;

    /**
     * Parameterless constructor
     */
    public Shape() {
        ++numShapes;
        setId(numShapes);
    }

    /**
     * Returns the number of shapes that have been created so far
     * 
     * @return number of shapes created
     */
    public static int getNumShapes() {
        return numShapes;
    }

    /**
     * Returns the id of the object
     * 
     * @return the auto-generated id
     */
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    /**
     * Computes the area of the shape
     * 
     * @return the shape's area
     */
    public abstract double computeArea();

    /**
     * Computes the perimeter of the shape
     * 
     * @return the shape's perimeter
     */
    public abstract double computePerimeter();

    @Override
    public int compareTo(Shape other) {
        
        double thisArea = this.computeArea();
        double otherArea = other.computeArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Creates a string representation of the object
     * 
     * @return the object's type, area, and perimeter
     */
    public String toString() {
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),
                id, computeArea(), computePerimeter());
    }

}
