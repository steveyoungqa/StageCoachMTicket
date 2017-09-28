package pageObject;

import java.io.IOException;


public class MTicket {

    public String EmailAddress() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/editEmail");
    }

    public String Password() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/editPassword");
    }

    public String DeviceName() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/editDeviceName");
    }

    public String SkipButton() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/btnSkip");
    }

    public String LoginButton() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/btnLogin");
    }

    public String RegisterButton() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/btnRegister");
    }

    public String HamburgerMenu() throws IOException {
        return ("Open application navigation");
    }

    public String CloseHamburgerMenu() throws IOException {
        return ("Close application navigation");
    }

    public String BuyTickets() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/layoutBuyTickets");
    }

    public String TicketWallet() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/layoutTicketWallet");
    }

    public String MyAccount() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/layoutMyAccount");
    }

    public String HelpInfo() throws IOException {
        return ("com.virgintrainseastcoast.mticket:id/layoutLiveUpdates");
    }

    public String Home() throws IOException {
        return ("Home");
    }

    public String PassengerCharter() throws IOException {
        return ("Passenger Charter");
    }

    public String LiveTravelUpdate() throws IOException {
        return ("Live Travel Updates");
    }

    public String HowBusyIsMyTrain() throws IOException {
        return ("How busy is my train?");
    }

    public String JourneyPlanner() throws IOException {
        return ("Journey Planning");
    }

    public String Settings() throws IOException {
        return ("Settings");
    }

    public String HelpFromMenu() throws IOException {
        return ("Help");
    }

    public String Feedback() throws IOException {
        return ("Feedback");
    }

    public String TrainMapper() throws IOException {
        return ("Train mapper");
    }

    public String LiveTrainTimes() throws IOException {
        return ("Live Departures/Arrivals");
    }

    public String About() throws IOException {
        return ("About");
    }

    public String SociaHub() throws IOException {
        return ("Social Hub");
    }

    public String DownloadBeamApp() throws IOException {
        return ("Download Beam App");
    }

    public String HelpActivate() throws IOException {
        return ("How do I activate and use my m-ticket?");
    }

    public String HelpWhereMTicket() throws IOException {
        return ("Where do I find my m-ticket?");
    }

    public String HelpWhatJourneyTypes() throws IOException {
        return ("What journey/ticket types are available?");
    }

    public String HelpTransfer() throws IOException {
        return ("How do I transfer my m-ticket to another device?");
    }

    public String Test() throws IOException {
        return ("Test");
    }

    public String xpath() throws IOException {
        return ("//*[contains(text(), 'BUY TICKETS')]");
    }

    public String logOut() throws IOException {
        return ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[1]");
    }

    public String logOutConfirm () throws IOException {
        return ("android:id/button1");
    }

    public String cancelConfirm () throws IOException {
        return ("android:id/button2");
    }


}
