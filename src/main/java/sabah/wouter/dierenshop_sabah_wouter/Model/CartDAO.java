package sabah.wouter.dierenshop_sabah_wouter.Model;

public interface CartDAO {

    static void addToCart(Product product) {
        ShoppingCart.INSTANCE.addToCart( product );
    }

}
