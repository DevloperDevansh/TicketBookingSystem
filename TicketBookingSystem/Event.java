package TicketBookingSystem;

public class Event {
    private String EventName;
    private String EventDate;
    private String EventVenue;
    private int numberOfTicket;


    //generate constructor
    public Event(String eventName, String eventDate, String eventVenue, int numberOfTicket) {
        EventName = eventName;
        EventDate = eventDate;
        EventVenue = eventVenue;
        this.numberOfTicket = numberOfTicket;
    }

    public Event() {

    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventDate() {
        return EventDate;
    }

    public void setEventDate(String eventDate) {
        EventDate = eventDate;
    }

    public String getEventVenue() {
        return EventVenue;
    }

    public void setEventVenue(String eventVenue) {
        EventVenue = eventVenue;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    @Override
    public String toString() {
        return "Event{" +
                "EventName='" + EventName + '\'' +
                ", EventDate='" + EventDate + '\'' +
                ", EventVenue='" + EventVenue + '\'' +
                ", numberOfTicket='" + numberOfTicket + '\'' +
                '}';
    }
}
