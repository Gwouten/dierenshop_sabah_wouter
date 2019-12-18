package sabah.wouter.dierenshop_sabah_wouter.Model;

public interface CartDAO {

    static void addToCart(Product product) {
        System.out.println("Added to cart");
        ShoppingCart.addToCart( product );
    }

}
