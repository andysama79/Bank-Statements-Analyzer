import java.util.List;

// Introducing an interface for parsing bank statements

public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}