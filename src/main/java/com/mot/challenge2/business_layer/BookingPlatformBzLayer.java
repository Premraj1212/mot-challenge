package com.mot.challenge2.business_layer;

import com.mot.challenge2.enums.Credential;
import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.factories.LaunchComponentFactory;
import com.mot.challenge2.ui_layer.pages.*;

public class BookingPlatformBzLayer {

    private BookingPlatformBzLayer(){

    }

    public static BookingPlatformBzLayer getBookingPlatformInstance(){
        return new BookingPlatformBzLayer();
    }


    public void loginToPlatform(){
        LaunchComponentFactory.getInstance(LaunchOption.ADMIN_PANEL)
                .toLaunch()
                .toLogInWithCredentials(Credential.USERNAME.toString(),Credential.PASSWORD.toString());
    }

    public String getLeftHeaderOptions(){
        return new BookingPage()
                .getLeftMenuOptions();
    }

    public int findCreatedRooms() {
        return new BookingPage()
                .createRoom()
                .listedCreatedRooms();
    }

    public void toUpdateBranding(){
        LaunchComponentFactory.getInstance(LaunchOption.BRANDING)
                .toLaunch()
                .toLogInWithCredentials(Credential.USERNAME.toString(),Credential.PASSWORD.toString());
    }

    public int toCheckAlertIsPresent(){
        return new BrandingPage()
                .toCreateForm()
                .confirmAlertIsDisplayed();
    }

    public void toSendContactForm(){
        LaunchComponentFactory.getInstance(LaunchOption.CONTACT_FORM)
                .toLaunch();
    }

    public boolean isContactFormSent(){
        return new ContactFormPage()
                .toCreateForm()
                .isMessageSent();
    }

    public void toFindEnquiryList(){
        LaunchComponentFactory.getInstance(LaunchOption.ENQUIRY)
                .toLaunch()
                .toLogInWithCredentials(Credential.USERNAME.toString(),Credential.PASSWORD.toString());
    }

    public int toFetchListOfEnquiry(){
        return new EnquiryPage()
                .getListOfEnquiry();
    }
}
