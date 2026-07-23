class Bike extends Vehicle{

    Bike(int vehicleId,String vehicleName,int rentPerDay){
        super(vehicleId,vehicleName,rentPerDay);
    }

    @Override
    public void displayDetails(){
        System.out.println("\n--- Bike Details ---");
        super.displayDetails();
    }
}