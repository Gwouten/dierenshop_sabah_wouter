package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Product;
import sabah.wouter.dierenshop_sabah_wouter.Model.ProductDAO;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCart;

import java.util.Optional;

@Controller
public class AddController {

    @Autowired
    ProductDAO dao;

    @RequestMapping(value = "/add/{id}", method = RequestMethod.GET)
    public String addToCart(@PathVariable("id") int id) {
        Product product = dao.findById( id ).get();
        ShoppingCart.INSTANCE.addToCart( product );
        return "redirect:/index";
    }

}
