package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Customer;
import sabah.wouter.dierenshop_sabah_wouter.Model.Productdao;
import sabah.wouter.dierenshop_sabah_wouter.Model.UserSingleton;

import javax.validation.Valid;

@Controller
public class CheckoutController {



    @ModelAttribute(value = "nieuweCustomer")
    public Customer customerToSave() {
        return new Customer();
    }

    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String showIndex(ModelMap map) {

        return "checkout";
    }

    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    public String showConfirmation(@ModelAttribute(name = "nieuweCustomer")@Valid
                                           Customer nieuweCustomer, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "checkout";

        UserSingleton.INSTANCE.setCustomer(nieuweCustomer);

        return "redirect:/confirmation";
    }}





