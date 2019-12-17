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
        Product test1 = new Product();
        Product test2 = new Product();
        Product test3 = new Product();

        test1.setId(1);
        test1.setName("Test1");
        test1.setPrice( new BigDecimal("5.00"));
        test1.setDescription("Desc");
        test1.setRating(4);
        test1.setImgUrl("http://image.com");
        test1.setCategory("voeding");
        test1.setStock(5);
        test1.setDelivery(2);

        test2.setId(2);
        test2.setName("Test2");
        test2.setPrice( new BigDecimal("4.00"));
        test2.setDescription("Desc");
        test2.setRating(4);
        test2.setImgUrl("http://image.com");
        test2.setCategory("voeding");
        test2.setStock(5);
        test2.setDelivery(2);

        test2.setId(3);
        test2.setName("Test3");
        test2.setPrice( new BigDecimal("10.00"));
        test2.setDescription("Desc");
        test2.setRating(4);
        test2.setImgUrl("http://image.com");
        test2.setCategory("voeding");
        test2.setStock(5);
        test2.setDelivery(2);

        ShoppingCart cart = new ShoppingCart();

        cart.addToCart(test1, 5);
        System.out.println( cart );


        cart.addToCart(test2, 2);
        System.out.println( cart );

        cart.addToCart( test2 );
        System.out.println( cart );

        cart.addToCart( test3 );
        System.out.println( cart );



       SpringApplication.run(DierenshopSabahWouterApplication.class, args);
    }

}
