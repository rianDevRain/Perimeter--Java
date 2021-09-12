import java.io.File;

import edu.duke.*;

public class PerimeterAssignmentRunner {
    public double getPerimeter(Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints(Shape s) {
        // Start with nP = 0
        int nP = 0;
        // for each point add to nP
        for (Point currPt : s.getPoints()) {
            nP = nP + 1;
        }
        // Put code here
        return nP;
    }

    public double getAverageLength(Shape s) {
        double avg = 0.0;
        double totalPerim = 0.0;
        double nP = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            prevPt = currPt;
            nP = nP + 1;
        }
        // Put code here
        avg = totalPerim / nP;
        return avg;
    }

    public double getLargestSide(Shape s) {
        double totalPerim = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {

            double currDist = prevPt.distance(currPt);
            // System.out.println(currDist);
            // System.out.println("currDist");
            // System.out.println(totalPerim);
            // System.out.println("totalPerim");clear
            // System.out.println(totalPerim);
            // System.out.println("totalPerim");
            if (currDist > totalPerim) {
                totalPerim = currDist;
            }

        }
        return totalPerim;
    }

    public double lengthOfEachSide(Shape s) {
        double oneSide = 0.0;
        double eachSide = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()){
            eachSide = prevPt.distance(currPt);
            System.out.println(eachSide+ " <= EACHSIDE");
        }
        return oneSide;
    }

    public double getLargestX(Shape s) {
        double largestX = 0.0;
        double currX = 0.0;
        // Point prevPt = s.getLastPoint();
        for(Point currPoint : s.getPoints()) {
            currX = currPoint.getX();
            // System.out.println(currPoint);
            System.out.println(currX);
            if(currX > largestX) {
                // System.out.println(largestX);
                largestX = currX;

            }
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    // public String getFileWithLargestPerimeter() {
    // // Put code here
    // File temp = null; // replace this code
    // return temp.getName();
    // }

    public void testPerimeter() {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double eachSide = lengthOfEachSide(s);
        System.out.println(eachSide);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        int numPoints = getNumPoints(s);
        System.out.println("Number of Points = " + numPoints);
        double avgLength = getAverageLength(s);
        System.out.println("Average Length of Sides = " + avgLength);
        double largeSide = getLargestSide(s);
        System.out.println("The Largest Side is = " + largeSide);
        double largeX = getLargestX(s);
        System.out.println("The Largest X is = " + largeX);
        
    }

    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle() {
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0, 0));
        triangle.addPoint(new Point(6, 0));
        triangle.addPoint(new Point(3, 6));
        for (Point p : triangle.getPoints()) {
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = " + peri);
    }

    // This method prints names of all files in a chosen folder that you can use to
    // test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
