public class Car implements Parkable {


    public void park(ParkingLot parkinglot)
    {
        parkinglot.addcar();
        System.out.println("can park");
    }

    public void unpark(ParkingLot parkinglot)
    {
       parkinglot.removecar();
        System.out.println("cannot park");
    }

}


