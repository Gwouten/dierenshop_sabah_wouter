package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

@Controller
class IndexController {

    @Autowired
    ProductDAO dao;

    @ModelAttribute(value = "alleProducten")
    public Iterable<Product> getAllProducts(){
        return dao.findAll();
    }

    @RequestMapping(value = {"","/","/index"},method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }

    @RequestMapping(value = {"","/","/index"},method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute(name="nieuweProduct") @Valid Product nieuweProduct, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "index";
        dao.save(nieuweProduct);
        return "redirect:/index";
    }

}

