package sabah.wouter.dierenshop_sabah_wouter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sabah.wouter.dierenshop_sabah_wouter.Model.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
public class CartController {

    // Add items to cart
    @ModelAttribute("product")
    public Product productToAdd() {
        return new Product();
    }

    @RequestMapping(value = "/add-to-cart", method = RequestMethod.GET)
    public String showIndex() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add-to-cart", method = RequestMethod.POST)
    public String addToCart(
            @ModelAttribute(name = "product")Product product,
            BindingResult br
        ) {

        if (br.hasErrors()) {
            return "index";
        }

        CartDAO.addToCart( product );
        return "redirect:/index";
    }

    // Display items in cart

    @ModelAttribute("cartContent")
    public ArrayList<ShoppingCartItem> getCartContent() {
        return ShoppingCart.INSTANCE.getCartContent();
    }

    @ModelAttribute("cartTotal")
    public BigDecimal getCartTotal() {
        return ShoppingCart.INSTANCE.getCartTotal();
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String showCart(
            @ModelAttribute("cartContent") ShoppingCartItem item,
            @ModelAttribute("cartTotal") BigDecimal cartTotal,
            BindingResult bindingResult
    ) {
        return "cart";
    }
}


