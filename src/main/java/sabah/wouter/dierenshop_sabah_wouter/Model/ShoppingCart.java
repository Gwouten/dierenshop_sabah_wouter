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
    public void addToCart( Product product, int qty ) {
        ShoppingCartItem item = new ShoppingCartItem( product, qty );
        this.cartContent.add( item );
        this.cartSum();
    }

    // Add a product without a given quantity (defaults to 1)
    // or if the item already exists in the ArrayList, adjust the quantity
    public void addToCart( Product product ) {
        ShoppingCartItem item = new ShoppingCartItem( product );
        if( cartContent.contains( item )) {
            int itemIndex = cartContent.indexOf( item );
            ShoppingCartItem itemToUpdate = cartContent.get( itemIndex );
            itemToUpdate.setQty( itemToUpdate.getQty()+1 );
            cartContent.set( itemIndex, cartContent.set( itemIndex, itemToUpdate) );
            System.out.println("Adjusted qty");
        } else {
            ShoppingCartItem newItem = new ShoppingCartItem( product, 1 );
            this.cartContent.add( newItem );
        }
        this.cartSum();
    }

    // Remove a product from the cart
    public void removeFromCart( int orderId ) {

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

        this.cartSum();
    }

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
