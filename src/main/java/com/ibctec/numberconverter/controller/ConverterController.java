package com.ibctec.numberconverter.controller;

import com.ibctec.numberconverter.model.Number;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConverterController {

    @GetMapping("/convert")
    public String sendForm(Model model) {
        model.addAttribute("number", new Number());
        return "convertMessage";
    }

    @PostMapping("/convert")
    public String processForm(@ModelAttribute Number number) {
        number.convertNumber();
        return "result";
    }
}
