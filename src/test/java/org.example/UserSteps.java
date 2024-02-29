package org.example;

import cucumber.api.java.en.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class UserSteps {

    User user = new User();
    @Given("^that the user (.*) is given a task to clear (.*) certification exam$")
    public void certification(String name, String certification){
        user.setName(name);
        user.setCertification(certification);
    }

    @When("^(.*) got (\\d+) marks in exam$")
    public void gotMarks(String name, int marks){
        user.setName(name);
        user.setMarks(marks);
    }

    @Then("(.*) is known as a (.*) certified$")
    public void shouldCertified(String name, String certification){
        assertThat(name, is(user));
        assertThat(user.getCertification(), equalTo("Java"));
        assertThat(user.getResult(), is(true));
    }

}
