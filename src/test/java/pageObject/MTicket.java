package pageObject;

import java.io.IOException;


public class MTicket {

    public String SkipButton() throws IOException {
        return ("sh.dogfi.mticket:id/btnSkip");
    }

    public String BuyTickets() throws IOException {
        return ("//*[contains(text(), 'BUY TICKETS')]");
    }

    public String HelpInfo() throws IOException {
        return ("Help + Info");
    }

}
