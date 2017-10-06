import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharsTest {
    UniqueChars test = new UniqueChars();


    @Test
    public void uniqueCharactersTest() throws Exception {
        assertEquals("[w]", UniqueChars.uniqueCharacters("tweet"));
    }

    @Test
    public void uniqueCharactersTest2() throws Exception {
        assertEquals("[e, h, o]", UniqueChars.uniqueCharacters("hello"));
    }

    @Test
    public void uniqueCharactersTest3() throws Exception {
        assertEquals("[l, m]", UniqueChars.uniqueCharacters("labamba"));
    }

}