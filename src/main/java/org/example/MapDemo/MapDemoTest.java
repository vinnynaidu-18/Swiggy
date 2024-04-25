package org.example.MapDemo;
import java.util.*;
public class MapDemoTest {
    public static void main(String[] args) {
        Map<Integer, TicketDetails> ticketDetailsMap = new HashMap<>();
        List<TicketDetails> ticketDetailsList = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            TicketDetails ticketDetails = new TicketDetails();
            ticketDetails.pnrNumber = "234" + i;
            ticketDetailsList.add(ticketDetails);
            ticketDetailsMap.put(ticketDetails.hashCode(), ticketDetails);
        }
            Set<Map.Entry<Integer, TicketDetails>> entrySetOfTicketDetails = ticketDetailsMap.entrySet();
            Iterator<Map.Entry<Integer, TicketDetails>> iterator = entrySetOfTicketDetails.iterator();

            for(;iterator.hasNext();){
                Map.Entry<Integer,TicketDetails>map=iterator.next();
                System.out.println("Key"+map.getKey()+"Value"+map.getValue());
            }

            ticketDetailsMap.forEach((k,v)->{
                System.out.println("Key from forEach"+k+"Value"+v);
            });

            TicketDetails ticketDetails1=new TicketDetails();
            ticketDetails1.pnrNumber="2344000";
            System.out.println("Getting ticket from List");
            long liststartTime = System.currentTimeMillis();
            Iterator<TicketDetails>itrListTicketDetails=ticketDetailsList.iterator();

            for(;itrListTicketDetails.hasNext();){
                TicketDetails ticketDetails2=itrListTicketDetails.next();
                if (ticketDetails2.equals(ticketDetails1)){
                    System.out.println("Find the ticket"+ticketDetails2.pnrNumber);
                    break;
                }
            }
            long listEndTime = System.currentTimeMillis();
            System.out.println("Time taken"+(listEndTime-liststartTime));
            System.out.println("Getting ticket from Map");
            long mapliststartTime=System.currentTimeMillis();
            TicketDetails mapTicektDetails= ticketDetailsMap.get(ticketDetails1.hashCode());
            System.out.println("Find the ticket from map"+ticketDetails1.pnrNumber);
            long maplistendTime=System.currentTimeMillis();
            System.out.println("Ticket taken Map"+(maplistendTime-mapliststartTime));

        }
    }

