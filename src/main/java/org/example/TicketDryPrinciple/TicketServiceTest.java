package org.example.TicketDryPrinciple;

import org.example.TicketPredicate.TicketDetails;
import org.example.TicketPredicate.TicketList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class TicketServiceTest {
    public void ticketStatus(List<Ticket> ticketList, Predicate<Ticket> predicate) {
        Iterator<Ticket> iterator = ticketList.iterator();
        for (; iterator.hasNext(); ) {
            Ticket ticket = iterator.next();
            if (predicate.test(ticket)) {
                System.out.println("Ticket status"+ticket.status);

            }
        }

    }

    public static void main(String[] args) {


        Predicate<Ticket> ticketSuccessFunction = (predicateTicket) ->
                predicateTicket.status.equals("Success");

        Predicate<Ticket> ticketFailedFunction = (predicateTicket) ->
                predicateTicket.status.equals("failed");

        Predicate<Ticket> ticketLockedFunction = (predicateTicket) ->
                predicateTicket.status.equals("locked");

        Ticket ticket=new Ticket();
        ticket.status="Success";
        ticket.ticketNumber="333";


        Ticket ticket1 = new Ticket();
        ticket1.ticketNumber = "55";
        ticket1.status = "Locked";

        Ticket ticket2 = new Ticket();
        ticket2.ticketNumber = "67";
        ticket2.status = "Success";

        Ticket ticket3 = new Ticket();
        ticket3.ticketNumber = "88";
        ticket3.status = "Failed";

        Ticket ticket4 = new Ticket();
        ticket4.ticketNumber = "99";
        ticket4.status = "Success";

        List<Ticket>ticketList=new ArrayList<>();
        ticketList.add(ticket);
        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);
        ticketList.add(ticket4);

      TicketServiceTest ticketServiceTest=new TicketServiceTest();
      ticketServiceTest.ticketStatus(ticketList,ticketFailedFunction);
      ticketServiceTest.ticketStatus(ticketList,ticketSuccessFunction);
      ticketServiceTest.ticketStatus(ticketList,ticketLockedFunction);



    }
}

