import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void noBrackets() throws IOException {
        String contents = Files.readString(Path.of("./test-issue-2.md"));
        assertEquals(new ArrayList<>(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void noParentheses() throws IOException {
        String contents = Files.readString(Path.of("./test-issue-3.md"));
        assertEquals(new ArrayList<>(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void textBetween() throws IOException {
        String contents = Files.readString(Path.of("./test-issue-4.md"));
        assertEquals(new ArrayList<>(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void failureInducing() throws IOException {
        String contents = Files.readString(Path.of("./test-issue-1.md"));
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("google(");
        assertEquals(lst, MarkdownParse.getLinks(contents));
    }

    @Test
    public void correctLink() throws IOException {
        String contents = Files.readString(Path.of("./snippet-1.md"));
        assertEquals(new ArrayList<>(), MarkdownParse.getLinks(contents));
    }


}