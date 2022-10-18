package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntryConstants;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

public class TimeEntryService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(TimeEntryConstants.ADD_ENTRY_HEADER);
        Assert.assertTrue(MobileActionManager.isVisible(TimeEntryConstants.ADD_ENTRY_HEADER), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void timeEntry(String hour,String minute){
        MobileActionManager.setInput(TimeEntryConstants.HOUR_TIME,hour);
        MobileActionManager.setInput(TimeEntryConstants.MINUTE_TIME,minute);

    }
    public static MobileElement time(){
        MobileElement entry = (MobileElement) MobileActionManager.getElement(TimeEntryConstants.TIME_ENTRY);
        return entry;
    }

    public static void timeDisplayed(){
        Assert.assertTrue(time().isDisplayed());
    }

}
