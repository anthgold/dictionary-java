import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void Definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("contrition");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_instantiatesWithDescription_String() {
    Definition myDefinition = new Definition("contrition");
    assertEquals("contrition", myDefinition.getMeaning());
  }

  @Test // this will allow us to retrieve all definitions entered, or a "dictionary"
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("contrition");
    Definition secondDefinition = new Definition("home");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test // adds an ID to each definition as we create it
  public void getId_definitionsInstantiateWithAnID_1() {
    Definition.clear(); // will fail without this
    Definition myDefinition = new Definition("contrition");
    assertEquals(1, myDefinition.getId());
  }

  @Test // finds a specific definition given its id
  public void find_returnsDefinitionWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("contrition");
    Definition secondDefinition = new Definition("home");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }

}
