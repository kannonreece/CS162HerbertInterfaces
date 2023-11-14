/**
 * Represents any shape.
 */
    public class Shape {
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
         * @return number of shapes created
         */
        public static int getNumShapes()
        {
            return numShapes;
        }

        /**
         * Returns the id of the object
         * @return the auto-generated id
         */
        public int getId()
        {
            return id;
        }

        private void setId(int id) {
            this.id = id;
        }

        /**
         * Computes the area of the shape
         * @return the shape's area
         */
        public double computeArea(){ return 0;} //this looks suspect!

        /**
         * Computes the perimeter of the shape
         * @return the shape's perimeter
         */
        public double computePerimeter(){ return 0;} //this looks suspect!


        /**
         * Creates a string representation of the object
         * @return the object's type, area, and perimeter
         */
        public String toString(){
             return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),
                    id, computeArea(),computePerimeter());
        }

}
