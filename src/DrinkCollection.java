public class DrinkCollection {
    Drink[] drinks;

    public DrinkCollection(Drink[] drinks) {
        this.drinks = drinks;
    }

    public void stampaDrinks(){
        System.out.println("Le nostre bevande sono : ");
        for(Drink d : drinks){
            System.out.println(d.getName() + " : $" + d.getPrice());
        }
    }
}
