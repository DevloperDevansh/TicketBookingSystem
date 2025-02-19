package TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class EventService {

    private static List<Event> events = new ArrayList<>();


    static{
        events.add(new Event("movie night","11-01-2024","Lucknow",40));
        events.add(new Event("sport movie","11-01-2024","Lucknow",50));
        events.add(new Event("Stree 2","11-01-2024","Lucknow",60));

    }

    public void displayEventName() {
        for(Event e:events){
            System.out.println(e);
        }
    }

    public boolean bookTicket(String eventName, int noOfTicket) {
        boolean flag = false;
        Event e = new Event();
        int currenticket = 0;
        for(Event event:events){
            if(event.getEventName().equals(eventName) && (event.getNumberOfTicket()>=noOfTicket)){
                currenticket = e.getNumberOfTicket() - noOfTicket;
                flag = true;
            }
        }
        return flag;
    }

    public Event getEvent(String eventName) {

        for(Event e:events){
            if(e.getEventName().equals(eventName)){
                return e;
            }
        }
        return null;
    }
}
