package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Product;
import sabah.wouter.dierenshop_sabah_wouter.Model.ProductDAO;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCart;

import java.util.Optional;



@Controller
public class DetailController {

    @Autowired
    ProductDAO repo;

    //deze controller zorgt ervoor dat de bezoeker alle details op een overzicht pagina krijgt
    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)

    public String showDetailsForID(ModelMap map, @PathVariable(value = "id") int id){
        Optional<Product> optional = repo.findById(id);
        map.addAttribute("product", optional.get());
        map.addAttribute("cartAmount", ShoppingCart.INSTANCE.getCartContent().size());
        return "details";

    }}