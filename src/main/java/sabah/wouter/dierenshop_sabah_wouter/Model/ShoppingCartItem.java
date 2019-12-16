package sabah.wouter.dierenshop_sabah_wouter.Model;

public class ShoppingCartItem {

    // Fields
    private Product product;
    private int qty;

    // Constructors

    public ShoppingCartItem(Product product) {
        this.product = product;
        this.qty = 1;
    }

    public ShoppingCartItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    // Getters & Setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
