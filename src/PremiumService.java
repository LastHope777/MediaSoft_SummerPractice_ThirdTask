class PremiumService<T extends LuxRoom> implements LuxRoomService<T> {
    @Override
    public void clean(T room) {
        System.out.println("Номер класса \"Люкс\" " + room.getNumber() + " убран!");
    }

    @Override
    public void reserve(T room) {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Номер класса \"Люкс\" " + room.getNumber() + " уже зарезервирован!");
        }
        room.setReserved(true);
        System.out.println("Номер класса \"Люкс\" " + room.getNumber() + " успешно зарезервирован!");
    }

    @Override
    public void free(T room) {
        room.setReserved(false);
        System.out.println("Номер класса \"Люкс\" " + room.getNumber() + " теперь свободен!");
    }

    @Override
    public void foodDelivery(T room) {
        System.out.println("Еда доставлена в номер класса \"Люкс\" "  + room.getNumber());
    }
}