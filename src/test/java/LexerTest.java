import java.io.File;
import java.util.List;

import org.junit.Test;

public class LexerTest {
    @Test
    public void testLexer() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	File file = new File(classLoader.getResource("test.cpp").getFile());
        Lexer lex = new Lexer(file);
        List<String> tokens = lex.getTokenList();
        assert(tokens.size() > 0);
        System.out.println("tokens: " + tokens);
    }
}
