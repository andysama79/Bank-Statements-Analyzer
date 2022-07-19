import java.io.IOException;

public class MainApplication {
    public static void main(final String... args) throws IOException{
        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        final TransactionCSVParser bankStatementParser = new TransactionCSVParser();

        bankStatementAnalyzer.analyze(args[0], bankStatementParser);
    }
}
