enum Prices {
    ECONOMY(50),
    STANDARD(80),
    LUX(150),
    ULTRALUX(250);

    private final int price;

    Prices(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}