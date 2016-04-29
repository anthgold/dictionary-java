import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("contrition");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_instantiatesWithDescription_String() {
    Word myWord = new Word("contrition");
    assertEquals("contrition", myWord.getTerm());
  }

  @Test // this will allow us to retrieve all words entered, or a "dictionary"
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("contrition");
    Word secondWord = new Word("home");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

}
