public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor client1 = new Human("Елена Ивановна");
        Actor client2 = new Human("Виталий Валентинович");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.update();
    }
}