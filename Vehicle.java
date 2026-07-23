class Vehicle{
    private int vehicleId;
    private String vehicleName;
    private int rentPerDay;

    Vehicle(int vehicleId,String vehicleName,int rentPerDay){
        this.vehicleId=vehicleId;
        this.vehicleName=vehicleName;
        this.rentPerDay=rentPerDay;
    }

    public int getVehicleId(){
        return vehicleId;
    }

    public String getVehicleName(){
        return vehicleName;
    }

    public int getRentPerDay(){
        return rentPerDay;
    }

    public void displayDetails(){
        System.out.println("Vehicle ID : "+vehicleId);
        System.out.println("Vehicle Name : "+vehicleName);
        System.out.println("Rent Per Day : Rs."+rentPerDay);
    }
}