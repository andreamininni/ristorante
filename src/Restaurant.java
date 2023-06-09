public class Restaurant {
    String name;
    DishCollection dishes;
    DrinkCollection drinks;
    public Restaurant(String name, DishCollection dishes, DrinkCollection drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    public void stampaMenu(){
        System.out.println("Benvenuti a " + this.name);
        this.dishes.stampaPiatti();
        this.drinks.stampaDrinks();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishCollection getDishes() {
        return dishes;
    }

    public void setDishes(DishCollection dishes) {
        this.dishes = dishes;
    }

    public DrinkCollection getDrinks() {
        return drinks;
    }

    public void setDrinks(DrinkCollection drinks) {
        this.drinks = drinks;
    }
}
