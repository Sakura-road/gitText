package com.jk.service;

import com.jk.model.GoodsBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("provider-user")
public interface OrderServiceFeign {
    @GetMapping("/findGoods")
    List<GoodsBean> findGoods();
}
