package com.example.vop.controller;

import com.example.vop.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkOrderSubmitController {

    @Autowired
    private WorkOrderService workOrderService;

    @RequestMapping("/workOrderSubmit")
    public ModelAndView  workOrderSubmit() {
        ModelAndView mav =new ModelAndView();

        mav.setViewName("workOrderSubmit");
        return mav;
    }

    @RequestMapping("/toworkOrderSubmit")
    public String toworkOrderSubmit(){
        workOrderService.test();
        return "workOrderSubmit";
    }
}
