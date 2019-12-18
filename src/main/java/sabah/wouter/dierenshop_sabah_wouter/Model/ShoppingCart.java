package sabah.wouter.dierenshop_sabah_wouter.Model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShoppingCart {

    // Fields
    private static ArrayList<ShoppingCartItem> cartContent;
    private static BigDecimal cartTotal;

    // Constructors
    public ShoppingCart() {
        this.cartContent = new ArrayList<ShoppingCartItem>();
    }

    public ShoppingCart(ArrayList<ShoppingCartItem> cartContent) {
        this.cartContent = cartContent;
    }

    // Getters & setters


    public static ArrayList<ShoppingCartItem> getCartContent() {
        return cartContent;
    }

    public static void setCartContent(ArrayList<ShoppingCartItem> cartContent) {
        ShoppingCart.cartContent = cartContent;
    }

    public static BigDecimal getCartTotal() {
        return cartTotal;
    }

    public static void setCartTotal(BigDecimal cartTotal) {
        ShoppingCart.cartTotal = cartTotal;
    }

    @Override
    public String toString() {
        String cart = "Cart:\n";
        for(ShoppingCartItem item : cartContent) {
            cart += "item: " + item.getProduct().getName() + ", price: " + item.getProduct().getPrice() + ", qty: " + item.getQty() + "\n";
        }
        if( cart != null) {
            cart += "TOTAL: " + this.cartTotal;
        }
        return cart;
    }

    // Methods

    // Add a product to the cart: create new instance of ShoppingCartItem to add to ShoppingCart
    public static void addToCart( Product product, int qty ) {
        ShoppingCartItem item = new ShoppingCartItem( product, qty );
        cartContent.add( item );
        cartSum();
    }

    // Add a product without a given quantity (defaults to 1)
    // or if the item already exists in the ArrayList, adjust the quantity
    public static void addToCart( Product product ) {
        ShoppingCartItem item = new ShoppingCartItem( product );
        if( cartContent.contains( item )) {
            int itemIndex = cartContent.indexOf( item );
            ShoppingCartItem itemToUpdate = cartContent.get( itemIndex );
            itemToUpdate.setQty( itemToUpdate.getQty()+1 );
            cartContent.set( itemIndex, cartContent.set( itemIndex, itemToUpdate) );
            System.out.println("Adjusted qty");
        } else {
            ShoppingCartItem newItem = new ShoppingCartItem( product, 1 );
            cartContent.add( newItem );
        }

        cartSum();
    }

    // Remove a product from the cart
    public static void removeFromCart( int orderId ) {

        // Select items to delete
        int indexToDelete = 0;
        for( ShoppingCartItem item : cartContent) {
            System.out.println( "order id: " + item.getOrderId() );
            System.out.println( "input: " + orderId );
            if( orderId == item.getOrderId() ) {
                indexToDelete = orderId - 1;
            }
        }

        // Delete the item at the index found in indexToDelete
        cartContent.remove( indexToDelete );

        cartSum();
    }

    // Get total price af items in cart
    public static void cartSum(){
        BigDecimal cartTotal = new BigDecimal(0);
        for(ShoppingCartItem prod : cartContent) {

            BigDecimal price = prod.getProduct().getPrice();
            BigDecimal qty = BigDecimal.valueOf( prod.getQty() );

            cartTotal = cartTotal.add( price.multiply( qty ) );
        }
        cartTotal = cartTotal;
    }

}
