package sabah.wouter.dierenshop_sabah_wouter.Model;

public class ShoppingCartItem {

    // Fields
    private static int nthOrder;
    private int orderLineId;
    private Product product;
    private int qty;

    // Constructors
    public ShoppingCartItem() {
        this.nthOrder++;
        this.orderLineId = this.nthOrder;
    }

    public ShoppingCartItem(Product product) {
        this.nthOrder++;
        this.orderLineId = this.nthOrder;
        this.product = product;
        this.qty = 1;
    }

    public ShoppingCartItem(Product product, int qty) {
        this.nthOrder++;
        this.orderLineId = this.nthOrder;
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

    public int getOrderId() {
        return orderLineId;
    }

    public void setOrderId(int orderId) {
        this.orderLineId = orderId;
    }

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "product=" + product +
                ", qty=" + qty +
                ", orderline: " + orderLineId +
                '}';
    }
}
