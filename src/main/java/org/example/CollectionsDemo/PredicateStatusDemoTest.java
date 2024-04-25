package org.example.CollectionsDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class PredicateStatusDemoTest {
    public static void main (String []args){
        RestaurantDemo restaurantDemo =new RestaurantDemo();
        restaurantDemo.name="Mehfil";

        RestaurantDemo restaurantDemo1=new RestaurantDemo();
        restaurantDemo1.name="Mandi";

        RestaurantDemo restaurantDemo2=new RestaurantDemo();
        restaurantDemo2.name="Paradise";
        List<RestaurantDemo>restaurantDemoList=new ArrayList<>();
        restaurantDemoList.add(restaurantDemo);
        restaurantDemoList.add(restaurantDemo1);
        restaurantDemoList.add(restaurantDemo2);

        for(int i=0;i<restaurantDemoList.size();i++){
            RestaurantDemo restaurantDemo3=restaurantDemoList.get(i);
            System.out.println(restaurantDemo3);

        }
        Iterator<RestaurantDemo> iterator = restaurantDemoList.iterator();
        for(;iterator.hasNext();){
            RestaurantDemo restaurantDemo3=iterator.next();
            System.out.println("Iterator Resturant name"+restaurantDemo3.name);


        }
        restaurantDemoList.forEach(restaurantDemo4 ->System.out.println("Consumer Restaurant name: " + restaurantDemo4.name));

    }
}
