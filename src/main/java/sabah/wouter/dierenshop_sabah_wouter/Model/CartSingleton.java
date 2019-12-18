package sabah.wouter.dierenshop_sabah_wouter.Model;

public enum CartSingleton {

    INSTANCE;

    private ShoppingCart cart;

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {

        this.cart = cart;
    }

}
