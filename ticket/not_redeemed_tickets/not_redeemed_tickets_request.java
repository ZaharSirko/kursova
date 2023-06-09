package  ticket.not_redeemed_tickets;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class not_redeemed_tickets_request {
    public List<not_redeemed_tickets_model> getAllNotRedeemedTicket() throws SQLException {
        List<not_redeemed_tickets_model>  NotRedeemedTicket = new ArrayList<>();
        
        List<not_redeemed_tickets> NotRedeemedTicketList = new not_redeemed_tickets_DAO().getAllNotRedeemedTickets();

        for (not_redeemed_tickets  NotRedeemedTickets :  NotRedeemedTicketList) {
            not_redeemed_tickets_model  NotRedeemedTicketsModel = new not_redeemed_tickets_model(
                NotRedeemedTickets.getTicket_id(),
                NotRedeemedTickets.getType(),
                NotRedeemedTickets.getId(),
                NotRedeemedTickets.getFrom(),
                NotRedeemedTickets.getDirection(),
                NotRedeemedTickets.getTo(),
                NotRedeemedTickets.getNotRedeemed_tickets()
            );

            NotRedeemedTicket.add( NotRedeemedTicketsModel);
        }

        return  NotRedeemedTicket;
    }
}
