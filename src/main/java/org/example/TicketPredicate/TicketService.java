package org.example.TicketPredicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class TicketService {
    public static void main(String[]args) {
        TicketDetails ticketDetails = new TicketDetails();
        ticketDetails.ticketNumber = "23";
        ticketDetails.status = "Locked";

        TicketDetails ticketDetails1 = new TicketDetails();
        ticketDetails1.ticketNumber = "55";
        ticketDetails1.status = "Locked";

        TicketDetails ticketDetails2 = new TicketDetails();
        ticketDetails2.ticketNumber = "67";
        ticketDetails2.status = "Success";

        TicketDetails ticketDetails3 = new TicketDetails();
        ticketDetails3.ticketNumber = "88";
        ticketDetails3.status = "Failed";

        TicketDetails ticketDetails4 = new TicketDetails();
        ticketDetails4.ticketNumber = "99";
        ticketDetails4.status = "Success";

        List<TicketDetails> ticketDetailsList = new ArrayList<>();
        ticketDetailsList.add(ticketDetails);
        ticketDetailsList.add(ticketDetails1);
        ticketDetailsList.add(ticketDetails2);
        ticketDetailsList.add(ticketDetails3);
        ticketDetailsList.add(ticketDetails4);

        TicketList ticketList = new TicketList();
        ticketList.ticketDetailsList1 = ticketDetailsList;

        Predicate<TicketDetails> ticketSuccessFunction = (predicateTicket) ->
                predicateTicket.status.equals("Success");

        Predicate<TicketDetails> ticketFailedFunction = (predicateTicket) ->
                predicateTicket.status.equals("failed");

        Predicate<TicketDetails> ticketLockedFunction = (predicateTicket) ->
                predicateTicket.status.equals("locked");


        Iterator<TicketDetails> iterator = ticketDetailsList.iterator();
        for (; iterator.hasNext(); ) {
            TicketDetails ticketDetails5 = iterator.next();
            if (ticketSuccessFunction.test(ticketDetails5)) {
                System.out.println("Ticket Details" + ticketDetails5.ticketNumber);
            }
        }
        Iterator<TicketDetails> iterator1 = ticketDetailsList.iterator();
        for (; iterator1.hasNext(); ) {
            TicketDetails ticketDetails5 = iterator1.next();
            if (ticketFailedFunction.test(ticketDetails5)) {
                System.out.println("Ticket Details" + ticketDetails5.ticketNumber);
            }
        }
        Iterator<TicketDetails> iterator2 = ticketDetailsList.iterator();
        for (; iterator2.hasNext(); ) {
            TicketDetails ticketDetails5 = iterator2.next();
            if (ticketLockedFunction.test(ticketDetails5)) {
                System.out.println("Ticket Details" + ticketDetails5.ticketNumber);
            }

        }
    }

    
}

