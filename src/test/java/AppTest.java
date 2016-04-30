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
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word"));
    fill("#term").with("contrition");
    submit(".btn");
    assertThat(pageSource()).contains("Your word has been added.");
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
  public void multipleWordsAreDisplayedTest() {
    goTo("http://localhost:4567/words/new");
    fill("#term").with("contrition");
    submit(".btn");
    goTo("http://localhost:4567/words/new");
    fill("#term").with("home");
    submit(".btn");
    click("a", withText("View words"));
    assertThat(pageSource()).contains("contrition");
    assertThat(pageSource()).contains("home");
  }

}
