import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void TestFile1() throws IOException {
        String contents = Files.readString(Path.of("./test-file-1.md"));
        assertEquals(new ArrayList<>(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void TestFile2() throws IOException {
        String contents = Files.readString(Path.of("./test-file-2.md"));
        assertEquals(new ArrayList<>(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void TestFile3() throws IOException {
        String contents = Files.readString(Path.of("./test-file-3.md"));
        assertEquals(new ArrayList<>(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile() throws IOException {
        String contents = Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile2() throws IOException {
        String contents = Files.readString(Path.of("./test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile3() throws IOException {
        String contents = Files.readString(Path.of("./test-file3.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile4() throws IOException {
        String contents = Files.readString(Path.of("./test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile5() throws IOException {
        String contents = Files.readString(Path.of("./test-file5.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile6() throws IOException {
        String contents = Files.readString(Path.of("./test-file6.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile7() throws IOException {
        String contents = Files.readString(Path.of("./test-file7.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile8() throws IOException {
        String contents = Files.readString(Path.of("./test-file8.md"));
        List<String> expect = List.of("a link on the first line");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
}