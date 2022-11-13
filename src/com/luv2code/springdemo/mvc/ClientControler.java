package com.luv2code.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/client")
public class ClientControler {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("client", new Client());
        return "client-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid
            @ModelAttribute("client") Client theClient,
            BindingResult theBindingResult) {

        if (theBindingResult.hasErrors()) {
            System.out.println("Error: " + theBindingResult);
            return "client-form";
        } else {
            System.out.println("Client: " + theClient);
            return "client-confirmation";
        }

    }

}
