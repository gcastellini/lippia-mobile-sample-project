package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntryConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import static com.crowdar.core.actions.ActionManager.getElement;

public class TimeEntryService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(TimeEntryConstants.ADD_ENTRY_HEADER);
        Assert.assertTrue(MobileActionManager.isVisible(TimeEntryConstants.ADD_ENTRY_HEADER), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void startEndSection(){
        MobileActionManager.click(TimeEntryConstants.ADD_ENTRY_LAYOUT);
    }

    public static void hourEntryStart(String hour,String minute){
        MobileActionManager.setInput(TimeEntryConstants.START_HOUR,hour);
        MobileActionManager.setInput(TimeEntryConstants.START_MINUTE,minute);
    }

    public static void hourEntryEnd(String hour,String minute){
        MobileActionManager.click(TimeEntryConstants.END_SECTION);
        MobileActionManager.setInput(TimeEntryConstants.START_HOUR,hour);
        MobileActionManager.setInput(TimeEntryConstants.START_MINUTE,minute);
        MobileActionManager.click(TimeEntryConstants.SAVE_BUTTON);
        MobileActionManager.click(TimeEntryConstants.SAVE_BUTTON);

    }
    public static void saveButton(){
        MobileActionManager.click(TimeEntryConstants.SAVE_BUTTON);
    }
    public static void time(){
        MobileActionManager.waitVisibility(TimeEntryConstants.TIME_ENTRY);
    }


}
