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
public class FilterController {

        // deze controller zorgt ervoor dat we kunnen filteren op categorie

        @Autowired
        ProductDAO dao;

        @ModelAttribute(value = "alleDieren")
        public Iterable<Product> findAll() {
            return dao.findAll();
        }

        @RequestMapping(value = {"/categoryfilter/{category}"}, method = RequestMethod.GET)
        public String showCategory(ModelMap map , @PathVariable(value = "category") String category) {
            map.addAttribute("filteredProducts", dao.findByCategory(category));
            map.addAttribute("cartAmount", ShoppingCart.INSTANCE.getCartContent().size());
            return "categoryfilter";
        }


    }
