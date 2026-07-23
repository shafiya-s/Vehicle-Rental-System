import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        Vehicle[] vehicles={
            new Car(101,"Swift",1200),
            new Bike(201,"Apache",500)
        };

        Customer c=new Customer(1,"Shafiya");

        int choice;

        do{
            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1.View Vehicles");
            System.out.println("2.Rent Vehicle");
            System.out.println("3.Exit");
            System.out.print("Enter Choice : ");
            choice=sc.nextInt();

            switch(choice){

                case 1:
                    for(Vehicle v:vehicles){
                        v.displayDetails();
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle ID : ");
                    int id=sc.nextInt();

                    boolean found=false;

                    for(Vehicle v:vehicles){
                        if(v.getVehicleId()==id){
                            found=true;

                            System.out.print("Enter Number of Days : ");
                            int days=sc.nextInt();

                            int bill=days*v.getRentPerDay();

                            System.out.println("\nCustomer : "+c.getCustomerName());
                            System.out.println("Vehicle : "+v.getVehicleName());
                            System.out.println("Total Bill : Rs."+bill);
                        }
                    }

                    if(!found){
                        System.out.println("Vehicle Not Found");
                    }
                    break;

                case 3:
                    System.out.println("Thank You...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice!=3);

        sc.close();
    }
}