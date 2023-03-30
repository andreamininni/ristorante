public class App {
    public static void main(String[] args) throws Exception {
        Dish d1 = new Dish("Carbonara", 12, new String[]{"pasta", "uova", "guanguale", "pepe"});
        Dish d2 = new Dish("Pasta al forno", 12, new String[]{"pasta", "salsa", "mozzarella", "pepe"});
        Drink b1 = new Drink("Acqua triste", 2);
        Drink b2 = new Drink("Vino", 5);
        Drink b3 = new Drink("Coca Cola", 3);

        //! genero gli array di piatti e bevande
        Dish[] dishes = new Dish[] { d1, d2 };
        DishCollection dc = new DishCollection(dishes);
        Drink[] drinks = new Drink[] { b1, b2, b3 };
        DrinkCollection ds = new DrinkCollection(drinks);
        Restaurant r = new Restaurant("McJava", dc, ds);
        System.out.println("Oggi abbiamo questo menu");
        r.stampaMenu();

        d1 = new Dish("Risotto allo zafferano", 15, new String[]{"Riso", "burro", "zafferano"});
        d2 = new Dish("Tagliata di manzo", 20, new String[]{"manzo", "rucola", "grana"});
        dc = new DishCollection(new Dish[]{d1, d2});
        r = new Restaurant("McJava", dc, ds);
        System.out.println("Domani avremo questo menu");
        r.stampaMenu();
    }
}
