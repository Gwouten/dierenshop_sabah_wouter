package sabah.wouter.dierenshop_sabah_wouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sabah.wouter.dierenshop_sabah_wouter.Model.Product;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCart;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCartItem;

import java.math.BigDecimal;

@SpringBootApplication
public class DierenshopSabahWouterApplication {

    public static void main(String[] args) {
       SpringApplication.run(DierenshopSabahWouterApplication.class, args);
    }

}
