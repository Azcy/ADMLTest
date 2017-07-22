package com.zcy.ADML.mapper;

import com.zcy.ADML.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zcy on 2017/7/22.
 */
public interface UserMapper {
   @Select("SELECT * FROM TB_USER WHERE ID= #{id}")
    User selectById(Integer id);
}
