package TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<User> users = new ArrayList<User>();
    private List<Event> events = new ArrayList<Event>();
    private List<Booking> bookings = new ArrayList<Booking>();

    //add user
    public void addUser(User user){
        users.add(user);
    }
    //add event
    public void addEvent(Event event){
        events.add(event);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking b1){
        bookings.add(b1);
    }
}
