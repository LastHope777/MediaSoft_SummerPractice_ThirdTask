class UltraLuxRoom extends LuxRoom {
    public UltraLuxRoom(int number) {
        super(number);
        this.pricePerNight = Prices.ULTRALUX.getPrice();
    }
}