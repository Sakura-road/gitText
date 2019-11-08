package com.jk.controller;

import com.jk.model.GoodsBean;
import com.jk.service.OrderService;
import com.jk.service.OrderServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderControllerFeign implements OrderServiceFeign {
    @Resource
    private OrderService orderService;
    @GetMapping("/findGoods")
    @ResponseBody
    @Override
    public List<GoodsBean> findGoods() {

        return orderService.findGoods();
    }
}
