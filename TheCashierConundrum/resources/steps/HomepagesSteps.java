//package properties.TestProperties;

/*
* import         import and import static statements
* import static
* */

import TheCashierConundrum;
import TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import properties.TestProperties;

@Component
public class HomePageSteps {
    private final TestProperties testProperties;


    @Autowired
    public HomePageSteps(TestProperties testProperties) {
        this.testProperties = testProperties;
    }

    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage() throws Throwable {
    }

    @And("^User types (.*) into the search bar$")
    public void userTypesStringIntoTheSearchBar(String searchString) throws Throwable {
    }

    @And("^User presses Enter$")
    public void userPressesEnter() throws Throwable {
    }

    @When("^User selects the top search result$")
    public void userSelectsTheTopSearchResult() throws Throwable {
    }

    @Then("^User is redirected to (.*)$")
    public void userIsRedirectedToTarget(String targetSite) throws Throwable {
    }


}
