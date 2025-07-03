class BasicRoomService<T extends Room> implements RoomService<T> {
    @Override
    public void clean(T room) {
        System.out.println("Номер  " + room.getNumber() + " убран!");
    }

    @Override
    public void reserve(T room) {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Номер " + room.getNumber() + " уже зарезервирован!");
        }
        room.setReserved(true);
        System.out.println("Номер " + room.getNumber() + " успешно зарезервирован!");
    }

    @Override
    public void free(T room) {
        room.setReserved(false);
        System.out.println("Номер " + room.getNumber() + " теперь свободен!");
    }
}
