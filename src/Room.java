import java.util.Random;

abstract class Room {
    protected int number;
    protected int maxPeople;
    protected int pricePerNight;
    protected boolean isReserved;

    public Room(int number, Prices priceTier) {
        this.number = number;
        this.maxPeople = new Random().nextInt(4) + 1;
        this.pricePerNight = priceTier.getPrice();
        this.isReserved = false;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getNumber() {
        return number;
    }
}