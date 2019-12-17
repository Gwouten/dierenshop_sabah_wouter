package sabah.wouter.dierenshop_sabah_wouter.Model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShoppingCart {

    // Fields
    private ArrayList<ShoppingCartItem> cartContent;
    private BigDecimal cartTotal;

    // Constructors
    public ShoppingCart() {
        this.cartContent = new ArrayList<ShoppingCartItem>();
    }

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

    @Override
    public String toString() {
        String cart = "Cart: ";
        for(ShoppingCartItem item : cartContent) {
            cart += "item: " + item.getProduct().getName() + ", price: " + item.getProduct().getPrice() + ", qty: " + item.getQty() + "\n";
        }
        cart += "TOTAL: " + this.cartTotal;
        return cart;
    }

    // Methods

    // Add a product to the cart: create new instance of ShoppingCartItem to add to ShoppingCart
    public void addToCart( Product product, int qty ) {
        System.out.println("addToCart: "+product+", "+qty);
        ShoppingCartItem item = new ShoppingCartItem( product, qty );
        this.cartContent.add( item );
        this.cartSum();
    }

    // Remove a product from the cart
    public void removeFromCart(Product product) {
        this.cartContent.remove( product );
        this.cartSum();
    }

    // Change order quantity of item in cart

    // Get total price af items in cart
    public void cartSum(){
        BigDecimal cartTotal = new BigDecimal(0);
        for(ShoppingCartItem prod : this.cartContent) {

            BigDecimal price = prod.getProduct().getPrice();
            BigDecimal qty = BigDecimal.valueOf( prod.getQty() );

            cartTotal = cartTotal.add( price.multiply( qty ) );
        }
        this.cartTotal = cartTotal;
    }

}
