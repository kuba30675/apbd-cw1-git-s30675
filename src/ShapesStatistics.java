import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    public static Map<SHAPETYPE, Optional<Shape>> maxFieldInstanceByType(List<Shape> list){
        return list.stream()
                .collect(
                        Collectors.groupingBy(
                                Shape::getType,
                                Collectors.maxBy(
                                        Comparator.comparingDouble(Shape::calculateField)
                                )
                        )
                );
    }
}
