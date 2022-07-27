import java.util.List;

import org.junit.Assert;
import org.junit.Test;
public class BankStatementCSVParserTest {
    private final BankStatementParser statementParser = new BankStatementParser() {
        @Test
        public void shouldParseOneCorrectLine() throws Exception {
            Assert.fail("Not implemented");
        }

        @Override
        public BankTransaction parseFrom(String line) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public List<BankTransaction> parseLinesFrom(List<String> lines) {
            // TODO Auto-generated method stub
            return null;
        }
    };    
}
