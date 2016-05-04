import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
    Definition.clear();
  }

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("humble");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void getTerm_definitionInstantiatesWithTerm_Humble() {
    Word testWord = new Word("humble");
    assertEquals("humble", testWord.getTerm());
  }

}
