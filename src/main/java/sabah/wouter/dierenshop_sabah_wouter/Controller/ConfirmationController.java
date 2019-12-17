package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Customer;
import sabah.wouter.dierenshop_sabah_wouter.Model.UserSingleton;

import javax.validation.Valid;

@Controller
public class ConfirmationController {

    @RequestMapping(value = "/confirmation", method = RequestMethod.GET)
    public String showIn(ModelMap map) {

        map.addAttribute("customer", UserSingleton.INSTANCE.getCustomer());

        return "confirmation";
    }
}



