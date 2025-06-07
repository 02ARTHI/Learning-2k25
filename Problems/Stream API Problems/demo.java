package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2025-06-01", 100.0),
                new Transaction("2025-06-01", 200.0),
                new Transaction("2025-06-02", 150.0),
                new Transaction("2025-06-02", 50.0),
                new Transaction("2025-06-03", 300.0)
        );

        Map<String, Double> totalByDate = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)));

        totalByDate.forEach((date, sum) -> System.out.println("Date: " + date + " -> Total Amount: " + sum));
    }
}
