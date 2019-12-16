package sabah.wouter.dierenshop_sabah_wouter.Model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShoppingCart {

    // Fields
    private static ArrayList<ShoppingCartItem> cartContent;
    private static BigDecimal cartTotal;

    // Constructors
    public ShoppingCart() {}

    public ShoppingCart(ArrayList<ShoppingCartItem> cartContent) {
        this.cartContent = cartContent;
    }

    // Getters & setters
    public ArrayList<ShoppingCartItem> getCartContent() {
        return cartContent;
    }

    public void setCartContent(ArrayList<ShoppingCartItem> cartContent) {
        this.cartContent = cartContent;
    }

    // Methods

    // Add a product to the cart
    public void addToCart( ShoppingCartItem product ) {
        this.cartContent.add( product );
    }

    // Remove a product from the cart
    public void removeFromCart(Product product) {
        this.cartContent.remove( product );
    }

    // Get total price af items in cart
    // TODO: finish method for cartSum
    public void cartSum(){
        BigDecimal cartTotal = BigDecimal.valueOf(0.00);
        for(ShoppingCartItem prod : this.cartContent) {

        }
    }

}
