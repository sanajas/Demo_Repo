public class ParkingLot {

    private int capacity;

    public ParkingLot(int capacity)
    {
        this.capacity = capacity;
    }

    public boolean isFull()
    {
        if (capacity == 0)

        return true;

            else
         return false;
    }

    public void addcar()
    {
        capacity--;
    }

    public void removecar()
    {
        capacity++;
    }

}
