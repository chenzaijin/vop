package com.example.vop;

import com.example.vop.service.WorkOrderService;
import com.example.vop.service.impl.WorkOrderServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@MapperScan("com.example.vop.dao")
public class VopApplication {

    public static void main(String[] args) {

        SpringApplication.run(VopApplication.class, args);

    }

}
