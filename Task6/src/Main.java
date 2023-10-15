package Task6.src;

public class Main {
    public static void main(String[] args) {
        // Тестирование посуды
        Dish cup = new Cup("Ceramic", 250, true);
        cup.use();
        cup.wash();

        Dish plate = new Plate("Porcelain", 500, true);
        plate.use();
        plate.wash();

        // Тестирование собак
        Dog bulldog = new Bulldog(5);
        bulldog.bark();
        bulldog.sleep();

        Dog poodle = new Poodle(3);
        poodle.bark();
        poodle.sleep();

        // Тестирование мебели и магазина
        Furniture chair = new Chair("Wooden", 10, true);
        chair.sit();
        chair.move();
        Furniture table = new Table("Glass", 20, 4);
        table.sit();
        table.move();

        FurnitureShop furnitureShop = new FurnitureShop("My Furniture Shop");
        furnitureShop.sell(chair);
        furnitureShop.sell(table);
    }
}