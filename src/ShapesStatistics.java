import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ShapesStatistics {

    public static Map<Shape,Long> countShapesCreated(List<Shape> list){
        return list.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s,
                                Collectors.counting()
                        )
                );
    }
}
