package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Product;
import sabah.wouter.dierenshop_sabah_wouter.Model.ProductDAO;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCart;

@Controller
public class PromoController {

    @Autowired
    ProductDAO dao;

    //deze controller wordt gebruikt om een filter te maken van de promo's

    @ModelAttribute(value = "allepromos")
    public Iterable<Product> findAllPromos() {
        return dao.findAllPromos();
    }

    @RequestMapping(value = {"/promo"}, method = RequestMethod.GET)
    public String showPromo( ModelMap map) {
        map.addAttribute("cartAmount", ShoppingCart.INSTANCE.getCartContent().size());

        return "promofilter";
    }
}