package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.TimeEntryConstants;
import com.crowdar.examples.services.TimeEntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TimeEntrySteps extends PageSteps {

    @And("Time Entry page is displayed")
    public void timeEntryDisplayed(){
        TimeEntryService.isViewLoaded();
    }

    @When("^The user sets hour time (.*) and minute time (.*)$")
    public void enterTime(String hour,String minute){
        TimeEntryService.timeEntry(hour,minute);
    }

    @And("The user clicks on save button")
    public void saveTime(){
       MobileActionManager.click(TimeEntryConstants.SAVE_BUTTON);
    }

    @Then("A time entry is displayed")
    public void timeDisplayed(){
        TimeEntryService.timeDisplayed();
    }
}
