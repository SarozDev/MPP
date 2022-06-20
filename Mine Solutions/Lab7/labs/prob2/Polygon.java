package Lab7.labs.prob2;

import java.util.Arrays;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter() {
        double perimeter = 0;
        for (double s : getSides()) {
            perimeter += s;


        }

        //return Arrays.stream(getSides()).sum();
        return perimeter;
    }
}

