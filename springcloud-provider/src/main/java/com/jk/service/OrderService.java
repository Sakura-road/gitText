package com.jk.service;

import com.jk.model.GoodsBean;

import java.util.List;

public interface OrderService {
    List<GoodsBean> findGoods();
}
