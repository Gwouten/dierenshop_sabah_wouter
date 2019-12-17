package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.Product;
import sabah.wouter.dierenshop_sabah_wouter.Model.ProductDAO;

import java.util.Optional;



@Controller
public class DetailController {

    @Autowired
    ProductDAO repo;


    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)

    public String showDetailsForID(ModelMap map, @PathVariable(value = "id") int id){

        Optional<Product> optional = repo.findById(id);

        map.addAttribute("product", optional.get());

        return "details";

    }}