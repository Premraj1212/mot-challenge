package com.mot.challenge2.tests;

import com.mot.challenge2.business_layer.BookingPlatformBzLayer;
import com.mot.challenge2.enums.HeaderMenu;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Challenge2Tests extends BaseTest {

    BookingPlatformBzLayer bookingPlatformBzLayer = BookingPlatformBzLayer.getBookingPlatformInstance();

    //  Test one: Check to see if you can log in with valid credentials
    @Test
    public void loginTest(){
        bookingPlatformBzLayer.loginToPlatform();
        assertThat(bookingPlatformBzLayer.getLeftHeaderOptions())
                .contains(HeaderMenu.ROOMS.toString());
    }
    //  Test two: Check to see if rooms are saved and displayed in the UI
    @Test
    public void roomCreationTest(){
        bookingPlatformBzLayer.loginToPlatform();
        assertThat(bookingPlatformBzLayer.findCreatedRooms())
                        .isNotEqualTo(1);
    }

    //  Test three: Check to see the confirm message appears when branding is updated
    @Test
    public void updateBrandingTest() {
        bookingPlatformBzLayer.toUpdateBranding();
        assertThat(bookingPlatformBzLayer.toCheckAlertIsPresent())
                .isEqualTo(1);
    }
    //  Test four: Check to see if the contact form shows a success message
    @Test
    public void contactFormTest(){
        bookingPlatformBzLayer.toSendContactForm();
        assertThat(bookingPlatformBzLayer.isContactFormSent())
                .isTrue();
    }

    //Test five: Check to see if unread messages are bolded
    @Test
    public  void messageEnquiryTest(){
        bookingPlatformBzLayer.toFindEnquiryList();
        assertThat(bookingPlatformBzLayer.toFetchListOfEnquiry())
                .isGreaterThanOrEqualTo(1);
    }
}