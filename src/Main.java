public class Main {
    public static void main(String[] args) {
        EconomyRoom eRoom = new EconomyRoom(101);
        RoomService<EconomyRoom> economyService = new BasicRoomService<>();
        System.out.println("\n--- Тестирование EconomyRoom ---");
        economyService.clean(eRoom);
        economyService.reserve(eRoom);
        try {
            economyService.reserve(eRoom); // вызовет исключение
        } catch (RoomAlreadyReservedException ex) {
            System.out.println("Исключение: " + ex.getMessage());
        }
        economyService.free(eRoom);

        StandardRoom sRoom = new StandardRoom(102);
        RoomService<StandardRoom> standardService = new BasicRoomService<>();
        System.out.println("\n--- Тестирование StandardRoom ---");
        standardService.clean(sRoom);
        standardService.reserve(sRoom);
        standardService.free(sRoom);

        LuxRoom lRoom = new LuxRoom(202);
        RoomService<LuxRoom> luxRoomBasicService = new BasicRoomService<>();
        LuxRoomService<LuxRoom> luxRoomPremiumService = new PremiumService<>();
        System.out.println("\n--- Тестирование LuxRoom ---");
        luxRoomBasicService.clean(lRoom);
        luxRoomPremiumService.reserve(lRoom);
        luxRoomPremiumService.foodDelivery(lRoom);
        luxRoomPremiumService.free(lRoom);

        UltraLuxRoom uRoom = new UltraLuxRoom(303);
        LuxRoomService<UltraLuxRoom> ultraLuxService = new PremiumService<>();
        System.out.println("\n--- Тестирование UltraLuxRoom ---");
        ultraLuxService.clean(uRoom);
        ultraLuxService.reserve(uRoom);
        ultraLuxService.foodDelivery(uRoom);
        ultraLuxService.free(uRoom);

        // Попытка создать объект Room или ProRoom (ошибка компиляции)
        // Room testRoom = new Room(...);        // Ошибка: Room — абстрактный класс
        // ProRoom pro = new ProRoom(...);       // Ошибка: ProRoom — абстрактный класс

    }
}
