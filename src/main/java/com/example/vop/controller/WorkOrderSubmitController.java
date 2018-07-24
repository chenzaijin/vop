package com.example.vop.controller;

import com.example.vop.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkOrderSubmitController {

    @Autowired
    private WorkOrderService workOrderService;

    @RequestMapping(value="/workOrderSubmit", method=RequestMethod.POST)
    public ModelAndView  workOrderSubmit(@RequestParam("support_deal")String support_deal,@RequestParam("support_content") String support_content
            ,@RequestParam("entiry") String entiry) {
        ModelAndView mav =new ModelAndView();
        workOrderService.supportSubmit(support_deal,support_content,entiry);
        mav.setViewName("workOrderSubmit");
        return mav;
    }

    @RequestMapping("/toworkOrderSubmit")
    public String toworkOrderSubmit(){
        workOrderService.test();
        return "workOrderSubmit";
    }
}
