package TicketBookingSystem;

import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        EventService eventService = new EventService();
        BookingService bookingService = new BookingService();
        User u1 = null;
        // eventService.displayEventName();
        System.out.println();


        while (true) {
            System.out.println("\t\t--------------Operations------------------");
            System.out.println("\t\t1:-Register");
            System.out.println("\t\t2:-Login");
            System.out.println("\t\t3:-Exit");
             System.out.println();
            System.out.print("\t\tEnter Your choice::");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\t\tEnter User Id :");
                    String userId = scn.nextLine();
                    scn.nextLine();
                    System.out.print("\t\tEnter User Name :");
                    String userName = scn.nextLine();
                    System.out.print("\t\tEnter User Address :");
                    String userAddress = scn.nextLine();
                    System.out.print("\t\tEnter User Mo No: ");
                    String userMo = scn.nextLine();
                    System.out.print("\t\tEnter user password:");
                    String pass = scn.nextLine();
                    u1 = new User(userId, userName, userAddress, userMo, pass);
                    bookingService.addUser(u1);
                    System.out.println("\t\t--------User Details Added Successfully---------------");
                    break;
                case 2:
                    System.out.println("\t\t----------------Login Page-----------------------------");

                    System.out.print("\t\tEnter userid::");
                    String usId = scn.nextLine();

                    scn.nextLine();
                    System.out.print("\t\tEnter Password::");
                    String password = scn.nextLine();

                    try {
                        if(u1.getUserId().equals(usId) && u1.getPassword().equals(password)){
                           userMenu(u1,eventService,bookingService);
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    break;
                case 3:

                    break;
                case 4:
                    System.out.print("\t\t------------Thank you for using my application-----------------");
                    return;

            }

        }
    }

    private static void userMenu(User user,EventService eventService,BookingService bs) {

        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("\t\t----------------------------------------------------------------------------");
            System.out.println("\t\t1. View Events");
            System.out.println("\t\t2. Book Ticket");
            System.out.println("\t\t3. View Bookings");
            System.out.println("\t\t4. Logout");

            System.out.print("\t\tEnter Your Choice::");
            int choice = scn.nextInt();
            scn.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    eventService.displayEventName();
                    break;
                case 2:
                    eventService.displayEventName();
                    System.out.print("Enter Event Name: ");
                    String eventName = scn.nextLine();
                    System.out.print("Enter Number of Ticket you want: ");
                    int ticket = scn.nextInt();
                    boolean b = eventService.bookTicket(eventName, ticket);
                    if(b){
                        Event e1 = eventService.getEvent(eventName);
                        Booking b1 = new Booking(eventName,ticket,"11-11-2024",user,e1);
                        bs.addBooking(b1);
                        System.out.print("\t\t--------Booking Successful-------------------------");
                    }else{
                        System.out.print("\t\t-------Not enough Ticket --------------");
                    }
                    break;
                case 3:
                    for(Booking booking:bs.getBookings()){

                        System.out.print(booking);
                    }
                    break;
                case 4:
                    System.out.println("------------------Logout successfuly------------------");
                    return;
            }
        }
    }
}
