package com.zcy.ADML.mapper;

import com.zcy.ADML.domain.Card;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zcy on 2017/7/22.
 */
public interface CardMapper {
    @Select("SELECT * FROM TB_CARD WHERE ID=#{id}")
    Card selectCardById(Integer id);
}
