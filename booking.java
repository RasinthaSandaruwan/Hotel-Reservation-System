import java.util.Scanner;

public class booking extends rooms {
    Scanner sc = new Scanner(System.in);

    int roomId;
    String customerName;
    String checkInDate;
    String checkOutDate;
    Character choice;

    public void makeBooking() {
        System.out.println("Enter the room id: ");
        roomId = sc.nextInt();

        if (roomId < 1 || roomId > id.length) {
            System.out.println("Invalid room ID!");
            return;
        }

        int roomIndex = roomId - 1;

        if (available[roomIndex]) {
            System.out.println("Enter your name: ");
            customerName = sc.next();

            System.out.print("Enter check-in date (yyyy-mm-dd): ");
            checkInDate = sc.next();

            System.out.print("Enter check-out date (yyyy-mm-dd): ");
            checkOutDate = sc.next();

            System.out.println("****** Booking Successful ******");

            available[roomIndex] = false;
        } else {
            System.out.println("Room number " + roomId + " is not available!!");
        }
    }

    public void payment() {
    System.out.println("Do you want to pay now? (Y/N)");
    choice = sc.next().charAt(0);

    switch (choice) {
        case 'Y':
        case 'y':
            System.out.println("You need to pay: " + price[roomId - 1]);
            break;
        case 'N':
        case 'n':
            System.out.println("You can pay later.");
            break;
        default:
            System.out.println("Invalid choice. Please select a valid option.");
            break;
    }
    System.out.println("************************");
}


    public void bookingDetails(){
        System.out.println("******Booking Details******");
        System.out.println("Room Number    :"+roomId);
        System.out.println("Ordered owner  :"+customerName);
        System.out.println("Check-In date  :"+checkInDate);
        System.out.println("Check-Out date :"+checkOutDate);
        System.out.println("Payment        :"+price[roomId]);
    }
    
}

