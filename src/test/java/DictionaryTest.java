import org.junit.*;
import static org.junit.Assert.*;

public class DictionaryTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("contrition");
    assertEquals(true, myWord instanceof Word);
  }

}
