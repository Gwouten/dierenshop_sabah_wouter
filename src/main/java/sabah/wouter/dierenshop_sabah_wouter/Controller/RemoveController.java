package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Product;
import sabah.wouter.dierenshop_sabah_wouter.Model.ProductDAO;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCart;

public class RemoveController {

    @Autowired
    ProductDAO dao;

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String removeFromCart(@PathVariable("id") int id) {
//        Product product = dao.findById( id).get();
//        ShoppingCart.INSTANCE.removeFromCart( product );
        return "redirect:/cart";
    }

}
