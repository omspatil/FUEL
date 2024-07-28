package posttest;
import java.util.Scanner;

abstract class Ticket {
    protected String Class;
    protected String seats;

    public Ticket(String Class, String seats) {
        this.Class = Class;
        this.seats = seats;
    }

    public abstract void book();
}

class FlightTicket extends Ticket {

    public FlightTicket(String Class, String seats) {
        super(Class, seats);
    }

    @Override
    public void book() {
        System.out.println("Flight ticket booked in " + Class + " class for " + seats + " seats.");
    }
}

class BusTicket extends Ticket {

    public BusTicket(String Class, String seats) {
        super(Class, seats);
    }

    @Override
    public void book() {
        System.out.println("Bus ticket booked in " + Class + " class for " + seats + " seats.");
    }
}

class TrainTicket extends Ticket {

    public TrainTicket(String Class, String seats) {
        super(Class, seats);
    }

    @Override
    public void book() {
        System.out.println("Train ticket booked in " + Class + " class for " + seats + " seats.");
    }
}

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ticket Booking Application");
        System.out.println("1. Book Flight Ticket");
        System.out.println("2. Book Bus Ticket");
        System.out.println("3. Book Train Ticket");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bookTicket("Flight");
                break;
            case 2: 
                bookTicket("Bus");
                break;
            case 3:
                bookTicket("Train");
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void bookTicket(String type) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(type + " Ticket Booking:");

        System.out.println("Select class type:");
        System.out.println("1. Regular Class");
        System.out.println("2. Business Class");
        System.out.println("3. First Class");
        System.out.print("Enter your choice : ");
        int classChoice = scanner.nextInt();
        scanner.nextLine(); 

        String ticketClass;
        switch (classChoice) {
            case 1:
                ticketClass = "Regular";
                break;
            case 2:
                ticketClass = "Business";
                break;
            case 3:
                ticketClass = "First Class";
                break;
            default:
                System.out.println("Invalid choice, setting class to Regular");
                ticketClass = "Regular";
        }

        System.out.print("Enter seats: ");
        String seats = scanner.nextLine();

        switch (type) {
            case "Flight":
                FlightTicket flightTicket = new FlightTicket(ticketClass, seats);
                flightTicket.book();
                break;
            case "Bus":
                BusTicket busTicket = new BusTicket(ticketClass, seats);
                busTicket.book();
                break;
            case "Train":
                TrainTicket trainTicket = new TrainTicket(ticketClass, seats);
                trainTicket.book();
                break;
            default:
                System.out.println("Invalid ticket type");
        }

        scanner.close();
    }
}
