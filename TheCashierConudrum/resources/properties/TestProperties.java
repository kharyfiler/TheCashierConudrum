package com.ticketmaster.qa.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import static com.ticketmaster.qa.config.PropertyKeys.BASE_URL;
import static com.ticketmaster.qa.config.PropertyKeys.SEARCH_RESULTS_URL;

@Component
public class TestProperties {

    private final Environment environment;

    @Autowired
    public TestProperties(Environment environment) {
        this.environment = environment;
    }

    public String getProperty(String propertyName) {
        return environment.getProperty(propertyName);
    }

    public String getBaseUrl() {
        return environment.getProperty(BASE_URL.getLiteral());
    }

    public String getSearchResultsUrl() {
        return environment.getProperty(SEARCH_RESULTS_URL.getLiteral());
    }
}
