class Car extends Vehicle{

    Car(int vehicleId,String vehicleName,int rentPerDay){
        super(vehicleId,vehicleName,rentPerDay);
    }

    @Override
    public void displayDetails(){
        System.out.println("\n--- Car Details ---");
        super.displayDetails();
    }
}