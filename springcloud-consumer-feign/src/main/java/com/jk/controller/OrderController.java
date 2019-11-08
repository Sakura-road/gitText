package com.jk.controller;

import com.jk.model.GoodsBean;
import com.jk.service.OrderServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderServiceFeign orderServiceFeign;

    @RequestMapping("findGoods")
    @ResponseBody
    public List<GoodsBean> findGoods(){
        return orderServiceFeign.findGoods();
    }
    @RequestMapping("findShow")
    public String findShow(){
        return "userList";
    }
}
