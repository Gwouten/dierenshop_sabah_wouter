package sabah.wouter.dierenshop_sabah_wouter.Model;

import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository <Product,Integer> {



    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByAnimal(String animal);

}
