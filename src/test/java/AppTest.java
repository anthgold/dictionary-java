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
    fill("#term").with("contrition");
    submit(".btn");
    assertThat(pageSource()).contains("Your word has been added.");
  }

  @Test
  public void wordIsDisplayedTest() {
    goTo("http://localhost:4567/");
    fill("#term").with("contrition");
    submit(".btn");
    click("a", withText("Go Back"));
<<<<<<< HEAD
    assertThat(pageSource()).contains("contrition");
=======
    assertThat(pageSource()).contains("Your word has been added.");
>>>>>>> 2a19bb7e0f0cdcf63dff5b9f6fe14e072339c2e4
  }

}
