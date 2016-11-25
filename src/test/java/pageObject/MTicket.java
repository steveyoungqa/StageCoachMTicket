package pageObject;

import java.io.IOException;


public class MTicket {

    public String EmailAddress() throws IOException {
        return ("sh.dogfi.mticket:id/editEmailInternal");
    }

    public String Password() throws IOException {
        return ("sh.dogfi.mticket:id/editPassword");
    }

    public String DeviceName() throws IOException {
        return ("sh.dogfi.mticket:id/editDeviceName");
    }

    public String SkipButton() throws IOException {
        return ("sh.dogfi.mticket:id/btnSkip");
    }

    public String LoginButton() throws IOException {
        return ("sh.dogfi.mticket:id/btnLogin");
    }

    public String HamburgerMenu() throws IOException {
        return ("Open application navigation");
    }

    public String CloseHamburgerMenu() throws IOException {
        return ("Close application navigation");
    }

    public String BuyTickets() throws IOException {
        return ("Buy tickets");
    }

    public String HelpInfo() throws IOException {
        return ("Help + Info");
    }

}
