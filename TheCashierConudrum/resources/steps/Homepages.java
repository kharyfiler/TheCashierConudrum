package com.ticketmaster.qa.cucumber.steps.discovery;

/*
* import         import and import static statements
* import static
* */

//@Component
public class HomePageSteps {
    private final BrowserService browserService;
    private final AutomationWait defaultWait;
    private final TestProperties testProperties;
    private final UrlService urlService;


    //@Autowired
    public HomePageSteps(BrowserService browserService, AutomationWait defaultWait,
                         TestProperties testProperties, UrlService urlService) {
        this.browserService = browserService;
        this.defaultWait = defaultWait;
        this.testProperties = testProperties;
        this.urlService = urlService;
    }


}
