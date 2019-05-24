package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface FigureCreator {
    static Figure create(List<Point> points){
        Map<Integer, Function<List<Point>,Figure>>map = new HashMap<>();
        map.put(2,Line::new);
        map.put(3,Triangle::new);
        map.put(4,Rectangle::new);
        return map.get(points.size()).apply(points);
    }

}
