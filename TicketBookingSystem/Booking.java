package TicketBookingSystem;

import java.security.PrivateKey;
import java.util.List;

public class Booking {
    private String userEvent;
    private int numberOfTicket;
    private String bookingDate;
    private User user;
    private Event event;

    public Booking(String userEvent, int numberOfTicket, String bookingDate, User user, Event event) {
        this.userEvent = userEvent;
        this.numberOfTicket = numberOfTicket;
        this.bookingDate = bookingDate;
        this.user = user;
        this.event = event;
    }

    public String getUserEvent() {
        return userEvent;
    }

    public void setUserEvent(String userEvent) {
        this.userEvent = userEvent;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userEvent='" + userEvent + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                ", bookingDate='" + bookingDate + '\'' +
                ", user=" + user +
                ", event=" + event +
                '}';
    }
}
