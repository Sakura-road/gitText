package com.jk.mapper;

import com.jk.model.GoodsBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface OrderMapper {
    @Select("select * from t_goods")
    List<GoodsBean> findGoods();
}
