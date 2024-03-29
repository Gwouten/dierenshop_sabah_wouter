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
public class AnimalController {
    @Autowired
    ProductDAO dao;

    //deze controller wordt gebruikt om een filter te maken van de animals

    @ModelAttribute(value = "alledieren")
    public Iterable<Product> findAll() {
        return dao.findAll();
    }

    @RequestMapping(value = {"animalfilter/{animal}"}, method = RequestMethod.GET)
    public String showAnimal(ModelMap map , @PathVariable(value = "animal") String animal) {
        map.addAttribute("cartAmount", ShoppingCart.INSTANCE.getCartContent().size());
        map.addAttribute("animals", dao.findByAnimal(animal));
        return "animalfilter";
    }

}
