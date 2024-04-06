package org.example.SwiggyOrder;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
    public List<Restarunt> restaurantList() {
        Restarunt mehfilrestarunt = new Restarunt();
        mehfilrestarunt.restaruntName = "Mehfil";
        mehfilrestarunt.rating = "4.5";
        mehfilrestarunt.phoneNumber = "7286928062";
        Address mehfilrestaurant = new Address("Lbnagar", "Hyderabad", "2", "500028");
        Dishes dishes = new Dishes("Biriyani");
        Dishes dishes1 = new Dishes("Icecream");
        Dishes dishes2 = new Dishes("Cooldrinks");
        Dishes dishes3 = new Dishes("ButterNon");
        List<Dishes> mehfilDishesList = new ArrayList<>();
        mehfilDishesList.add(dishes);
        mehfilDishesList.add(dishes1);
        mehfilDishesList.add(dishes2);
        mehfilDishesList.add(dishes3);
        mehfilrestarunt.address = mehfilrestaurant;
        mehfilrestarunt.dishList = mehfilDishesList;
        Restarunt paradiserestarunt = new Restarunt();
        paradiserestarunt.restaruntName = "paradise";
        paradiserestarunt.rating = "5";
        paradiserestarunt.phoneNumber = "8686712798";
        Address paradisereatarunt = new Address("kphb", "Hyderabad", "4", "508216");
        Dishes dishes4 = new Dishes("Chapathi");
        Dishes dishes5 = new Dishes("Curries");
        Dishes dishes6 = new Dishes("Statres");
        Dishes dishes7 = new Dishes("Chicken");
        List<Dishes> paradiseDishesList = new ArrayList<>();
        paradiseDishesList.add(dishes);
        paradiseDishesList.add(dishes1);
        paradiseDishesList.add(dishes2);
        paradiseDishesList.add(dishes3);
        paradiserestarunt.address = mehfilrestaurant;
        paradiserestarunt.dishList = mehfilDishesList;

        List<Restarunt> restaruntList = new ArrayList<>();
        restaruntList.add(mehfilrestarunt);
        restaruntList.add(paradiserestarunt);

        System.out.println(mehfilrestarunt);
        return restaruntList;
    }


}




