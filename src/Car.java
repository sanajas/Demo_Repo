public class Car
{
    private String registration = "ABC1";

    public void park(ParkingLot parkinglot)
    {
        parkinglot.addcar();

    }
    public void unpark(ParkingLot parkinglot)
    {
        parkinglot.removecar();
    }
}
