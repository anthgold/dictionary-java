import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("contrition");
    assertEquals(true, myWord instanceof Word);
  }

  @Test // nameOfFunction_testCase_expectedResult()
  public void Word_instantiatesWithDescription_String() {
    Word myWord = new Word("contrition");
    assertEquals("contrition", myWord.getDescription());
  }

}
