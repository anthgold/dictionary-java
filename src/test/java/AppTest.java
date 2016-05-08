import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {

  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary");
    assertThat(pageSource()).contains("View Word List");
    assertThat(pageSource()).contains("Add a New Word");
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a New Word"));
    fill("#term").with("contrition");
    submit(".btn");
    assertThat(pageSource()).contains("Your word has been saved.");
  }

  @Test
  public void wordIsDisplayedTest() {
    goTo("http://localhost:4567/words/new");
    fill("#term").with("contrition");
    submit(".btn");
    click("a", withText("View words"));
    assertThat(pageSource()).contains("contrition");
  }

  @Test
  public void wordShowPageDisplaysTerm() {
    goTo("http://localhost:4567/words/new");
    fill("#term").with("bongo");
    submit(".btn");
    click("a", withText("View words"));
    click("a", withText("bongo"));
    assertThat(pageSource()).contains("bongo");
  }

  @Test
  public void wordDefinitionsFormIsDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#term").with("hip-hop");
    submit(".btn");
    click("a", withText("View words"));
    click("a", withText("hip-hop"));
    click("a", withText("Add a new definition"));
    assertThat(pageSource()).contains("Add a definition to hip-hop");
  }

  @Test
  public void definitionsIsAddedAndDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#term").with("boogaloo");
    submit(".btn");
    click("a", withText("View words"));
    click("a", withText("boogaloo"));
    click("a", withText("Add a new definition"));

    fill("#meaning").with("bug out");
    submit(".btn");
    click("a", withText("View words"));
    click("a", withText("boogaloo"));

    assertThat(pageSource()).contains("bug out");
  }

}
