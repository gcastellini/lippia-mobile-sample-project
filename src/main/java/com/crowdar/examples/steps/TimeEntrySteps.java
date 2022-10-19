package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.TimeEntryConstants;
import com.crowdar.examples.services.TimeEntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.Time;


public class TimeEntrySteps extends PageSteps {

    @And("Time Entry page is displayed")
    public void timeEntryDisplayed(){
        TimeEntryService.isViewLoaded();
    }

    @When("^The user sets start hour time (.*), (.*)$")
    public void enterStartTime(String hour,String minute){
        TimeEntryService.hourEntryStart(hour,minute);
    }

    @When("^The user sets end hour time (.*), (.*)$")
    public void enterEndTime(String hour,String minute){
        TimeEntryService.hourEntryEnd(hour,minute);
    }

    @When("The user clicks on Start End Layout")
    public void startEndLayout(){
   TimeEntryService.startEndSection();
    }


    @And("The user clicks on save button")
    public void saveTime(){
        TimeEntryService.saveButton();
    }

    @Then("A time entry is displayed")
    public void timeDisplayed() {
        TimeEntryService.time();
    }
}
