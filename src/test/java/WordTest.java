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

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("humble");
    Word secondWord = new Word("grit");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void clear_emptiesAllWordsFromList_0() {
    Word testWord = new Word("humble");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void getId_wordsInstantiateWithAnID_1() {
    Word testWord = new Word("humble");
    assertEquals(1, testWord.getId());
  }



}
