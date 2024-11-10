import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Vehicle> rentedVehicles = new ArrayList<>();
        int n = 0;
        boolean stop = true;
        do {
            System.out.println("1• Rent a Car: Prompt the user for the car model and rental days.   \n" +
                    "2• Rent a Bike: Prompt the user for the bike brand and rental hours.   \n" +
                    "3• Rent a Truck: Prompt the user for the truck type and rental weeks.   \n" +
                    "4• View Rented Vehicles: Display details of all rented vehicles.   \n" +
                    "5• Exit the program.");
            n = input.nextInt();

                switch (n) {

                    case 1:
                        System.out.println("Please enter the car Model.");
                        input.nextLine();
                        String model = input.nextLine();
                        System.out.println("Please enter how many Days to rent.");
                        int days = input.nextInt();
                        Vehicle car = new Car(model,days);
                        rentedVehicles.add(car);
                        break;
                    case 2:
                        System.out.println("Please enter the Brand name.");
                        input.nextLine();
                        String brand = input.nextLine();
                        System.out.println("Please enter how many Hour to rent.");
                        int hour = input.nextInt();
                        Vehicle bike = new Bike(hour,brand);
                        rentedVehicles.add(bike);
                        break;
                    case 3:
                        System.out.println("Please enter the truck Type.");
                        input.nextLine();
                        String type = input.nextLine();
                        System.out.println("Please enter how many Weeks to rent.");
                        int week = input.nextInt();
                        Vehicle truck = new Truck(week,type);
                        rentedVehicles.add(truck);
                        break;
                    case 4:
                        for(Vehicle r : rentedVehicles){
                            r.displayDetails();
                            System.out.println("------------------");
                        }
                        break;
                    case 5:
                        System.out.println("--------------------");
                        System.out.println("Thank you for using the Vehicle Rental System!");
                        stop = false;
                        break;
                }
            }
            while (stop) ;


    }
}