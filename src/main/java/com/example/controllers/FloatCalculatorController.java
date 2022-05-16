//package com.example.controllers;
//
//import com.example.model.FloatOperationModel;
//import com.example.service.FloatCalculateSimple;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class FloatCalculatorController {
//
//    FloatOperationModel floatOperationModel = new FloatOperationModel();
//
//    @Autowired
//    private FloatCalculateSimple floatCalculateSimple;
//
//    @RequestMapping("/float/calculator")
//    public String getCalculatorPage(Model model){
//        model.addAttribute("floatOperationModel",floatOperationModel);
//        return "calculator";
//    }
//
//    @RequestMapping(value="/float/calculator", params="add", method = RequestMethod.POST)
//    public String add(@ModelAttribute("floatOperationModel")  FloatOperationModel floatOperationModel, Model model ){
//        model.addAttribute("result", floatCalculateSimple.fadd(floatOperationModel));
//        return "calculator";
//    }
//
//    @RequestMapping(value="/float/calculator", params="subtract", method = RequestMethod.POST)
//    public String subtract(@ModelAttribute("floatOperationModel")  FloatOperationModel floatOperationModel, Model model ){
//        model.addAttribute("result", floatCalculateSimple.fsubtract(floatOperationModel));
//        return "calculator";
//    }
//
//    @RequestMapping(value="/float/calculator", params="multiply", method = RequestMethod.POST)
//    public String multiply(@ModelAttribute("floatOperationModel")  FloatOperationModel floatOperationModel, Model model ){
//        model.addAttribute("result", floatCalculateSimple.fmultiply(floatOperationModel));
//        return "calculator";
//    }
//
//    @RequestMapping(value="/float/calculator", params="divide", method = RequestMethod.POST)
//    public String divide(@ModelAttribute("floatOperationModel")  FloatOperationModel floatOperationModel, Model model ){
//        model.addAttribute("result", floatCalculateSimple.fdivide(floatOperationModel));
//        return "calculator";
//    }
//
//    @RequestMapping(value="/float/calculator", params="clearSimple", method = RequestMethod.POST)
//    public String clearSimple(@ModelAttribute("floatOperationModel")  FloatOperationModel floatOperationModel, Model model ){
//        model.addAttribute("floatOperationModel",  floatCalculateSimple.clearSimple(floatOperationModel));
//        model.addAttribute("result", 0);
//        return "calculator";
//    }
//
//}
