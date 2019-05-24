package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory implements FigureCreator {
    static Figure getInstance(List<Point> points) {

        return FigureCreator.create(points);
    }
}
