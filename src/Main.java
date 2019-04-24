public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Parkable Car1 = new Car();
        Parkable Car2 = new Car();
        //Car car1 =  new Car();
        ParkingLot parkingLot = new ParkingLot( 2);

        Car1.park(parkingLot);
        Car2.unpark(parkingLot);

        Parkable jeep = new jeep();
        jeep.park(parkingLot);

        parkingLot.isFull();


        //Jeep jeep = new jeep();
        //jeep.park(parkingLot);


    }
}

