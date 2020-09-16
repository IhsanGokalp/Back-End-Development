package com.example.tacocloud.Web;

import com.example.tacocloud.DiscountCodeProps;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/discounts")
public class DiscountController {

    private DiscountCodeProps discountCodeProps;

    @GetMapping
    public String displayDiscountCodes(Model model) {
        Map<String, Integer> codes = discountCodeProps.getCodes();
        model.addAttribute("codes", codes);
        return "discountList";
    }
}
