import java.util.*;
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


    public static Map<Boolean, List<Shape>> circuitGreaterThan(List<Shape> list, double threshold){
        return list.stream()
                .collect(
                        Collectors.partitioningBy(
                                (Shape s) -> s.calculateCircuit() > threshold
                        )
                );
    }

    public static Map<SHAPETYPE, Map<String, Double>> shapetypeStats(Collection<Shape> shapeColl){
        return shapeColl.stream()
                .collect(
                        Collectors.groupingBy(
                                Shape::getType,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> {
                                            Map<String,Double> res = new HashMap<>();
                                            res.put(
                                                    "totalField",
                                                    list.stream()
                                                            .mapToDouble(Shape::calculateField)
                                                            .sum()
                                            );

                                            res.put(
                                                    "totalCircuit",
                                                    list.stream()
                                                            .mapToDouble(Shape::calculateField)
                                                            .sum()
                                            );

                                            res.put(
                                                    "averageField",
                                                    list.stream()
                                                            .mapToDouble(Shape::calculateField)
                                                            .average().orElse(0)
                                            );

                                            res.put(
                                                    "minField",
                                                    list.stream()
                                                            .mapToDouble(Shape::calculateField)
                                                            .min().orElse(0)
                                            );
                                            return res;
                                        }
                                )
                        )
                );
    }

    public static double calculateAverage(int[] values){
        int sum = 0;
        for(int x : values) sum += x;
        return ((double)sum) / values.length;
    }

    public static double calculateMax(int[] values){
        if (values.length == 0) return 0;
        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            if(values[i] > max) max = values[i];
        }
        return max;
    }


}
