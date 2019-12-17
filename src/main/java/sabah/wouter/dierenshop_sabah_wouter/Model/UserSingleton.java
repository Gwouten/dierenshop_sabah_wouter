package sabah.wouter.dierenshop_sabah_wouter.Model;

public enum UserSingleton {

    INSTANCE;

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
