package MultipleInheritance;

public class SuperShop implements Toiletries, Cookies, Vegetables {


    @Override
    public void cookieProducts() {
        System.out.println("Cookie categories are: salt, chocolate, horlicks and price of" +
                "each product "+Toiletries.PRICE);
    }

    @Override
    public void toiletProducts() {
        System.out.println("Toilet Products are: soap, shampoo and price of each product " + Cookies.PRICE);
    }

    @Override
    public void vegetableProducts() {
        System.out.println("Vegetable Products are: Carrot, Begun, Shosha and price of each product "+Vegetables.PRICE);
    }
}
