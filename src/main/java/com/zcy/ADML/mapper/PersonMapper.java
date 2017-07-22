package com.zcy.ADML.mapper;

import com.zcy.ADML.domain.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

/**
 * Created by zcy on 2017/7/22.
 */
public interface PersonMapper {
    @Select("SELECT * FROM TB_PERSON WHERE ID=#{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "card_id",property = "card",
            one=@One(
                    select="com.zcy.ADML.mapper.CardMapper.selectCardById",
                    fetchType = FetchType.EAGER
            ))
    })
    Person selectPersonById(Integer id);
}
