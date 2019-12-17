package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Customer;
import sabah.wouter.dierenshop_sabah_wouter.Model.Productdao;

@Controller
public class CheckoutController {

    @ModelAttribute(value = "nieuweCustomer")
    public Customer customerToSave(){
        return new Customer();
    }

    @RequestMapping(value = "/checkout",method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "checkout";
    }
}
