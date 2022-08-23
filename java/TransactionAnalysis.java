// version 0.0

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;
public class TransactionAnalysis {
    private static final String RESOURCES = "resources/transactions.txt";

    public static void main(final String... args) throws IOException {
        final Path path = Paths.get(RESOURCES + args[0]); // path variable gets the CSV
        final List<String> lines = Files.readAllLines(path); // reads all lines (line by line) and stores in a list
        double total = 0d; // stores the total amount
        double total_month = 0d; // stores the total amount spent in a month
        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for(final String line: lines) {
            final String[] columns = line.split(","); // split the line; delimiter: ","
            final double amount = Double.parseDouble(columns[1]); // we know that the amount occurs in second column
            total += amount;
            /* looking at transactions in a particular month */
            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            if (date.getMonth() == Month.JANUARY) {
                final double month_amount = Double.parseDouble(columns[1]);
                total_month += month_amount;
            }
        }
        System.out.println("The total for all transactions is " + total);
        System.out.println("The total for all transactions in January is " + total_month);
    }
}