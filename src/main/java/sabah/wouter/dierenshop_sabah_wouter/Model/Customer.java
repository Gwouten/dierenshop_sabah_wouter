package sabah.wouter.dierenshop_sabah_wouter.Model;


public class Customer {

    private String username;
    private String adress;
    private Integer postalcode;
    private String email;
    private Integer bankaccount;

    public Customer(String username, String adress, Integer postalcode, String email, Integer bankaccount) {
        this.username = username;
        this.adress = adress;
        this.postalcode = postalcode;
        this.email = email;
        this.bankaccount = bankaccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(Integer bankaccount) {
        this.bankaccount = bankaccount;
    }
}
