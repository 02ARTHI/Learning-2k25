package stream.day1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<Factory> factories = Arrays.asList(
                new Factory("SteelWorks", Arrays.asList("Drill", "Excavator", "Bulldozer")),
                new Factory("AutoParts", Arrays.asList("Carburetor", "Piston", "Transmission")),
                new Factory("ToolMakers", Arrays.asList("Screwdriver", "Wrench", "Hammer"))
        );

        List<String> productList = factories.stream()
                .flatMap(factory -> factory.getProducts().stream())  // Flatten all product lists into a single stream
                .map(String::toUpperCase)  // Convert product names to uppercase
                .toList();  // Collect results into a list

        System.out.println(productList);
    }
}

class Factory {
    private String name;
    private List<String> products;

    public Factory(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public List<String> getProducts() {
        return products;
    }
}