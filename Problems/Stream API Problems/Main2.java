package stream.day1;



import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // List of factory parts
        List<Part> parts = Arrays.asList(
                new Part("Wheel", 10),
                new Part("Engine", 250),
                new Part("Brake", 15),
                new Part("Chassis", 80)
        );

        // Sorting parts by weight in ascending order
        parts.stream()
                .sorted()  // Sorting by natural order
                .forEach(System.out::println);
    }
}

class Part implements Comparable<Part> {
    private String partName;
    private int weight;

    public Part(String partName, int weight) {
        this.partName = partName;
        this.weight = weight;
    }

    public String getPartName() {
        return partName;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Part other) {
        return Integer.compare(this.weight, other.weight);  // Sorting by weight
    }

    @Override
    public String toString() {
        return partName + ": " + weight + "kg";
    }
}
