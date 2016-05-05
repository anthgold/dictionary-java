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

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("humble");
    Word secondWord = new Word("grit");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

  @Test
    public void find_returnsNullWhenNoWordFound_null() {
      assertTrue(Word.find(999) == null);
    }

  @Test
  public void getDefinitions_initiallyReturnsEmptyList_ArrayList() {
    Word testWord = new Word("merry-go-round");
    assertEquals(0, testWord.getDefinitions().size());
  }

  @Test
  public void addDefinition_addsDefinitionToList_true() {
    Word testWord = new Word("fracas");
    Definition testDefinition = new Definition("a noisy disturbance or quarrel");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }

}
