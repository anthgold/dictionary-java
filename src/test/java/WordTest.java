import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
    Definition.clear();
  }

  @Test 
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("humble");
    assertEquals(true, myWord instanceof Word);
  }



}
