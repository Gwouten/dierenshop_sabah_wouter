package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.ShoppingCart;


@Controller
    public class AboutController {

        //gaat naar de about pagina

        @RequestMapping(value = "/about",method = RequestMethod.GET)
        public String showIndex(ModelMap map) {
            map.addAttribute("cartAmount", ShoppingCart.INSTANCE.getCartContent().size());
            return "about";
        }
}

