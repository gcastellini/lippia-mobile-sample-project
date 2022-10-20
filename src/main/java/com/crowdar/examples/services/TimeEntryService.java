package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntryConstants;
import org.joda.time.DateTime;
import org.testng.Assert;

import java.time.LocalDateTime;

import static java.lang.Math.abs;


public class TimeEntryService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(TimeEntryConstants.ADD_ENTRY_HEADER);
        Assert.assertTrue(MobileActionManager.isVisible(TimeEntryConstants.ADD_ENTRY_HEADER), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void startEndSection(){
        MobileActionManager.click(TimeEntryConstants.ADD_ENTRY_LAYOUT);
    }

    public static void pickDay(String day){
        MobileActionManager.click(TimeEntryConstants.DAY_PICKER,day);
    }

    public static void hourEntryStart(String hour,String minute){
        DateTime time = new DateTime();
        int h= time.getHourOfDay();
        int m= LocalDateTime.now().getMinute();
        int clicksHour = abs(h-Integer.parseInt(hour));
        int clicksMinute= abs(m-Integer.parseInt(minute));
        for (int i=0;i<clicksHour;i++){
            MobileActionManager.click(TimeEntryConstants.START_HOUR);
        }
        for (int i=0;i<clicksMinute;i++){
            MobileActionManager.click(TimeEntryConstants.START_MINUTE);
        }

    }

    public static void hourEntryEnd(String hour,String minute){
        MobileActionManager.click(TimeEntryConstants.END_SECTION);
        hourEntryStart(hour,minute);
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
