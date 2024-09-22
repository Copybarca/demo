package com.example.demo.controller;


import com.example.demo.calculating.CalcVocationPay;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller()
@RequestMapping("/")
public class SalaryVocationController {

    public SalaryVocationController(){}

    @GetMapping("/clients")
    public String index(@RequestParam(name = "salary", required = false, defaultValue = "0") int name,
                        @RequestParam(name = "day", required = false, defaultValue = "0")int day,
                        Model model){
        double result = CalcVocationPay.count(name,day);
        model.addAttribute("salary",result);
        return "salaryCalculating";
    }


}
