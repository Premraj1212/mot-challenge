package com.mot.challenge2.ui_layer.pages;

import com.mot.challenge2.data_model.RoomInfo;
import com.mot.challenge2.helper.ResourceHelper;
import com.mot.challenge2.ui_layer.base.Ui_Layer;
import org.openqa.selenium.By;

public class BookingPage extends LaunchPage {
    private By LEFT_MENU_OPTIONS = By.className("navbar-collapse");
    private By ROOM_NUMBER = By.id("roomNumber");
    private By ROOM_PRICE = By.id("roomPrice");
    private By CREATE = By.id("createRoom");
    private By CREATED_ROOM_LIST = By.xpath("//div[@class='row detail']");

    RoomInfo roomInfo = ResourceHelper.getDataYml("src\\test\\resources\\data\\roomData.yaml",RoomInfo.class);

    public String getLeftMenuOptions(){
        waitForPageToLoad();
        waitForElementToBeClickable(LEFT_MENU_OPTIONS);
        return findElement(LEFT_MENU_OPTIONS).getText();
    }

    public BookingPage createRoom(){
        waitForPageToLoad();
        waitForElementToBeClickable(LEFT_MENU_OPTIONS);
        findElement(ROOM_NUMBER).sendKeys(roomInfo.getRoomNumber());
        findElement(ROOM_PRICE).sendKeys(roomInfo.getRoomPrice());
        findElement(CREATE).click();
        return this;
    }

    public int listedCreatedRooms(){
        sleep();
        return findElements(CREATED_ROOM_LIST).size();
    }
}
