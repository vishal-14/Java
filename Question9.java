//Q9.Write a program to display values of enums using a constructor & getPrice()
// method (Example display house & their prices)

public class Question9 {
enum Rent{
    TheTaj(5000),
    PalatialGrand(7500),
    AnsalGardenia(8500),
    Amrapali(9500);

    private int price;

    Rent(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

    public static void main(String[] args) {
        for(Rent house : Rent.values()){
            System.out.println("House name : "+house+" Rent : "+house.getPrice());
        }

    }
}
