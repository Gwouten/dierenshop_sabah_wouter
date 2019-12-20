package sabah.wouter.dierenshop_sabah_wouter.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository <Product,Integer> {



    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByAnimal(String animal);



    @Query("SELECT p FROM Product p WHERE promo_price > '0.00'")
    Iterable<Product> findAllPromos();
}
