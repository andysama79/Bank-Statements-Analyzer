import java.io.IOException;

public class MainApplication {
    public static void main(final String... args) throws IOException{
        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        final TransactionCSVParser bankStatementParser = new TransactionCSVParser();
        // ? final List<BankTransaction> transactions = bankStatementProcessor.findTransactions(bankTransaction -> bankTransaction.getDate().getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 1_000);
        bankStatementAnalyzer.analyze(args[0], bankStatementParser);
    }
}
