import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("humble");
    assertEquals(true, myWord instanceof Word);
  }



}
