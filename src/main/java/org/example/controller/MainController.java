package org.example.controller;

import org.example.beans.Values;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.List;

@Controller
public class MainController {

    private List<String> operations = new LinkedList<>();
    private Values values;
    private static int counter = 0;

    @RequestMapping(value = "/operations", method = RequestMethod.GET)
    public ModelAndView operations(){
        return new ModelAndView("operations", "list", values);
    }

    @RequestMapping(value = "/selectValues", method = RequestMethod.GET)
    public ModelAndView selectValues(){
        return new ModelAndView("selectValues", "command", new Values());
    }

    @RequestMapping(value = "/saveValues", method = RequestMethod.POST)
    public ModelAndView saveValues(@ModelAttribute double x, @ModelAttribute double y){
        values.setX(x);
        values.setY(y);
        return new ModelAndView("redirect:/operations");
    }

    public void saveOperation(String operation){
        counter++;
        if(counter > 10){
            operations.remove(operations.get(0));
        }
        operations.add("X=" + values.getX() + "Y=" + values.getY() + operation);
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public ModelAndView addOperation(){
        saveOperation("add=" + (values.getX()+values.getY()));
        return new ModelAndView("redirect:/operations");
    }

    @RequestMapping(value = "subtract", method = RequestMethod.GET)
    public ModelAndView subtractOperation(){
        saveOperation("subtract=" + (values.getX()-values.getY()));
        return new ModelAndView("redirect:/operations");
    }

    @RequestMapping(value = "multiply", method = RequestMethod.GET)
    public ModelAndView multiplyOperation(){
        saveOperation("multiply=" + (values.getX()*values.getY()));
        return new ModelAndView("redirect:/operations");
    }

    @RequestMapping(value = "divide", method = RequestMethod.GET)
    public ModelAndView divideOperation(){
        saveOperation("divide=" + (values.getX()/values.getY()));
        return new ModelAndView("redirect:/operations");
    }

}
