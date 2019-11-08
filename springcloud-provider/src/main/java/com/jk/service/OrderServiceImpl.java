package com.jk.service;

import com.jk.mapper.OrderMapper;
import com.jk.model.GoodsBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<GoodsBean> findGoods() {
        return orderMapper.findGoods();
    }
}
