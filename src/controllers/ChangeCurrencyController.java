package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeCurrencyController {
    @PostMapping("/changeCurrency")
    public String changeCurrencyToUsd(@RequestParam String vnd, Model model)
    {
        float usd = Float.parseFloat(vnd) / 23000;
        model.addAttribute("usd",usd);
        return "changeCurrency";
    }
    @GetMapping("/home")
    public String getVnd()
    {
        return "changeCurrency";
    }
}

