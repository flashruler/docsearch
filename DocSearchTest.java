import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class DocSearchTest{
    @Test
    public void testURLHandler() throws URISyntaxException, IOException{
        Handler h = new Handler("test");
        URI test = new URI("test");
        assertEquals(h.handleRequest(test),"Don't know how to handle that path!");
    }
}