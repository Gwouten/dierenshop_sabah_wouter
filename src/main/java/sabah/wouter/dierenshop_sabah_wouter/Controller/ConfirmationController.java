package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.CustomerSingleton;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCart;

@Controller
public class ConfirmationController {

    @RequestMapping(value = "/confirmation", method = RequestMethod.GET)
    public String showIn(ModelMap map) {
        map.addAttribute("cartAmount", ShoppingCart.INSTANCE.getCartContent().size());
        map.addAttribute("customer", CustomerSingleton.INSTANCE.getCustomer());
        return "confirmation";
    }
}



