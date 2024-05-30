import java.util.Scanner;


public class main extends booking{

    Scanner sc=new Scanner(System.in);
    int choice;

    public void displaymenu(){
    
        System.out.println("1. Search for available rooms");
        System.out.println("2. Make a reservation");
        System.out.println("3. View bookings");
        System.out.println("4. Process payment");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice=sc.nextInt();
        System.out.println("*******************"); 
    }

    public void menu(){
        
        switch(choice){
            case 1:
                avbrooms();
            break;

            case 2:
                makeBooking();
            break;

            case 3:
                bookingDetails();
            break;

            case 4:
                payment();
            break;

            case 5:
                System.out.println("Exiting the application. Thank you for using our services!");
                System.exit(0);
            break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
            break;


        }
    }

    public static void main(String[] args) {
        
        main mm = new main();
        while(true){

            mm.displaymenu();
            mm.menu();
        }
    }
}