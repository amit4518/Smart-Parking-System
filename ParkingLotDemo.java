class ParkingLotDemo{
    public static void main(String[] args) {
        int nFloors=4;
        int nSlotsPerFloor=6;
        ParkingLot parkingLot = new ParkingLot("PR1234", nFloors, nSlotsPerFloor);

        System.out.println("No of open slots for car: " + parkingLot.getNoOfOpenSlots("car"));

        String ticket1 = parkingLot.parkVehicle("car", "MH-03", "red");
        String ticket2 = parkingLot.parkVehicle("car", "MH-04", "purple");
        System.out.println("After parking:");
        parkingLot.displayOccupiedSlots("car");

        parkingLot.unPark(ticket2);
        parkingLot.displayOccupiedSlots("car");



        
        
    }
}