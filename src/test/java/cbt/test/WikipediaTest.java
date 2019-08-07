package cbt.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.cognifide.qa.bb.page.BobcatPageFactory;
import com.google.inject.Inject;
import org.junit.jupiter.api.Test;
import com.cognifide.qa.bb.junit5.guice.Modules;

import com.cognifide.qa.bb.modules.BobcatRunModule;
import cbt.test.pageobjects.WikipediaPage;
import cbt.test.pageobjects.DefinitionPage;

@Modules(BobcatRunModule.class)
public class WikipediaTest {

  private static final String SEARCH_QUERY = "hello world";
  private static final String HEADING = "\"Hello, World!\" program";

  @Inject
  private BobcatPageFactory bobcatPageFactory;

  @Inject
  private DefinitionPage definitionPage;

  @Test
  public void wikipediaSearchTest() {
    WikipediaPage homePage = bobcatPageFactory.create("https://en.wikipedia.org", WikipediaPage.class);
    homePage.open().getSearchComponent().searchForQuery(SEARCH_QUERY);
    assertThat(definitionPage.getHeading(), is(HEADING));
  }
}
